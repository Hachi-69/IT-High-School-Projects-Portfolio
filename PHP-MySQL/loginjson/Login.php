<?php

// Ottieni i dati inviati dal modulo HTML
$username = $_POST['username'];
$password = $_POST['password'];


// Leggi il contenuto del file JSON
//echo file_get_contents("utenti.json");
$jsonData = file_get_contents("utenti.json");
$utenti = json_decode($jsonData, true);




// Controlla se l'utente esiste nel file JSON
$utenteTrovato = false;

foreach ($utenti as $utente =>$pwd) {
    if ($utente === $username && $pwd === $password) {
        $utenteTrovato = true;
        break;
    }
}

// Verifica l'esito del login
if ($utenteTrovato) {
    echo 'Login riuscito! Benvenuto, ' . $username;
} else {
    echo 'Credenziali non valide. Riprova.';
}
