<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "turilloparchinaturali";

$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
  die("Connessione fallita: " . mysqli_connect_error());
}

if (isset($_POST['id'])) {
  $id = $_POST['id'];

  $query = "DELETE FROM flora WHERE flo_id = '$id'";

  if (mysqli_query($conn, $query)) {
    echo "Record eliminato con successo";
  } else {
    echo "Errore nell'eliminazione del record: " . mysqli_error($conn);
  }
}

mysqli_close($conn);
