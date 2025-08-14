<?php

$username = $_POST['username'];
$password = $_POST['password'];

$servername = "localhost";
$dbusername = "root";
$dbpassword = "";
$dbname = "login";

$conn = new mysqli($servername, $dbusername, $dbpassword, $dbname);

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT log_id, log_username, log_password FROM login";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    $utenteTrovato = false;

    while ($row = $result->fetch_assoc()) {
        if ($row["log_username"] == $username && $row["log_password"] == $password) {
            header('Location: merende.php');
            $utenteTrovato = true;
            break;
        } elseif ($row["log_username"] == $username) {
            header('Location: credenzialiNonValide.htm');
            $utenteTrovato = true;
            break;
        }
    }

    if (!$utenteTrovato) {
        header('Location: creaUtente.php');
    }

} else {
    echo "0 result";
}

$conn->close();
?>
