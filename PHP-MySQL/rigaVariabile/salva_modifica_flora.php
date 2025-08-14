<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "turilloparchinaturali";

if (!isset($_POST['flo_id'], $_POST['flo_dex'], $_POST['fk_spo_id'], $_POST['fk_prc_id'], $_POST['flo_stag_fiori'])) {
    echo "Tutti i campi sono obbligatori.";
    exit();
}

$flo_id = $_POST['flo_id'];
$flo_dex = $_POST['flo_dex'];
$fk_spo_id = $_POST['fk_spo_id'];
$fk_prc_id = $_POST['fk_prc_id'];
$flo_stag_fiori = $_POST['flo_stag_fiori'];

$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connessione fallita: " . mysqli_connect_error());
}

$query = "UPDATE flora SET flo_dex = '$flo_dex', fk_spo_id = '$fk_spo_id', fk_prc_id = '$fk_prc_id', flo_stag_fiori = '$flo_stag_fiori' WHERE flo_id = '$flo_id'";

if (mysqli_query($conn, $query)) {
    header("Location: tabella_flora.php");
} else {
    echo "Errore nell'esecuzione della query: " . mysqli_error($conn);
}

mysqli_close($conn);
