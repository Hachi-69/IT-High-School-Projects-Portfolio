<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "caseifici_gueturmaz";

if (!isset($_POST['frm_csf_id'], $_POST['frm_id'], $_POST['frm_stagionatura'], $_POST['frm_prima_scelta'])) {
    exit();
}

$frm_stagionatura = $_POST['frm_stagionatura'];
$frm_prima_scelta = $_POST['frm_prima_scelta'];
$frm_id = $_POST['frm_id'];
$frm_csf_id = $_POST['frm_csf_id'];

$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connessione fallita: " . mysqli_connect_error());
}

$query = "UPDATE forme SET frm_stagionatura = '$frm_stagionatura', frm_prima_scelta = '$frm_prima_scelta' WHERE frm_id = '$frm_id'";

if (mysqli_query($conn, $query)) {
    header("Location: tabella_attivita_giornaliere.php?caseificio=" . $frm_csf_id);
} else {
    echo "Errore nell'esecuzione della query: " . mysqli_error($conn);
}

mysqli_close($conn);
?>