<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "turilloparchinaturali";

if (!isset($_POST['fau_id'], $_POST['fau_dex'], $_POST['fau_sesso'], $_POST['fau_stato_salute'], $_POST['fau_data_nascita'], $_POST['fk_spf_id'], $_POST['fk_prc_id'])) {
    echo "Tutti i campi sono obbligatori.";
    exit();
}

$fau_id = $_POST['fau_id'];
$fau_dex = $_POST['fau_dex'];
$fau_sesso = $_POST['fau_sesso'];
$fau_stato_salute = $_POST['fau_stato_salute'];
$fau_data_nascita = $_POST['fau_data_nascita'];
$fk_spf_id = $_POST['fk_spf_id'];
$fk_prc_id = $_POST['fk_prc_id'];

$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connessione fallita: " . mysqli_connect_error());
}

$query = "UPDATE fauna SET fau_dex = '$fau_dex', fau_sesso = '$fau_sesso', fau_stato_salute = '$fau_stato_salute', fau_data_nascita = '$fau_data_nascita', fk_spf_id = '$fk_spf_id', fk_prc_id = '$fk_prc_id' WHERE fau_id = '$fau_id'";

if (mysqli_query($conn, $query)) {
    header("Location: tabella_fauna.php");
} else {
    echo "Errore nell'esecuzione della query: " . mysqli_error($conn);
}

mysqli_close($conn);
