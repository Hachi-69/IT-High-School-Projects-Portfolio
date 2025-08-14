<?php

$username = $_POST['username'];
$password = $_POST['password'];

$jsonData = file_get_contents("utenti.json");
$utenti = json_decode($jsonData, true);

$utenteTrovato = false;

foreach ($utenti as $utente => $pwd) {
    if ($utente === $username && $pwd === $password) {
        $utenteTrovato = true;
        break;
    }
}

if ($utenteTrovato) {
    echo 'Login riuscito! Benvenuto, ' . $username;
    header("Location: merende.php");
    exit();
} else {
    echo 'Credenziali non valide. Riprova.';
    header("Location: credenzialiNonValide.htm");
    exit();
}
?>