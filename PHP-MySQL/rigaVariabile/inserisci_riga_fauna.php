<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inserisci Nuova Riga</title>
    <style>
        body {
            font-family: 'font', Arial, sans-serif;
            text-align: center;
            background-color: #032217;
            color: #ffffff;
            border-radius: 5px;
        }

        form {
            margin: 20px auto;
            width: 50%;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            background-color: #FFB100;
            color: #000000;
            font-family: 'font', Arial, sans-serif;
        }

        label {
            display: block;
            margin-bottom: 10px;
            color: #000000;
            font-family: 'font', Arial, sans-serif;
        }

        input[type="text"],
        input[type="date"],
        select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            font-family: 'font', Arial, sans-serif;
        }

        input[type="submit"] {
            background-color: #343331;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-family: 'font', Arial, sans-serif;
        }

        input[type="submit"]:hover {
            background-color: #000000;
            color: #FFB100;
            font-family: 'font', Arial, sans-serif;
        }

        select {
            color: #000000;
            font-family: 'font', Arial, sans-serif;
        }

        @font-face {
            font-family: 'font';
            src: url('font.otf') format('opentype');
            font-weight: normal;
            font-style: normal;
        }
    </style>
</head>

<body>

    <h2>Inserisci Nuova Riga</h2>

    <form id="insertForm" action="inserisci_riga_fauna.php" method="post">

        <label for="fau_dex">Nome dell'animale:</label>
        <input type="text" name="fau_dex" id="fau_dex">

        <label for="spf_id">Specie:</label>
        <select name="spf_id" id="spf_id">
            <option value="0" selected> </option>
            <option value="1">Elefante</option>
            <option value="2">Tigre</option>
            <option value="3">Gorilla</option>
            <option value="4">Orso</option>
            <option value="5">Lupo</option>
            <option value="6">Balena</option>
            <option value="7">Squalo</option>
            <option value="8">Pappagallo</option>
            <option value="9">Gufo</option>
            <option value="10">Picchio</option>
            <option value="11">Serpente</option>
            <option value="12">Tartaruga</option>
            <option value="13">Rana</option>
            <option value="14">Farfalla</option>
            <option value="15">Ape</option>
            <option value="16">Ragno</option>
            <option value="17">Granchio</option>
            <option value="18">Lumaca</option>
            <option value="19">Medusa</option>
            <option value="20">Stella Marina</option>
            <option value="21">Tigre</option>
            <option value="22">Pinguino</option>
            <option value="23">Aquila</option>
            <option value="24">Cobra</option>
            <option value="25">Salmone</option>
        </select>


        <label for="fau_sesso">Sesso:</label>
        <select name="fau_sesso" id="fau_sesso">
            <option value="0" selected> </option>
            <option value="M">Maschio</option>
            <option value="F">Femmina</option>
        </select>

        <label for="fau_stato_salute">Stato Salute:</label>
        <select name="fau_stato_salute" id="fau_stato_salute">
            <option value="0" selected> </option>
            <option value="S">In Salute</option>
            <option value="M">Malato</option>
        </select>

        <label for="fau_data_nascita">Data di Nascita:</label>
        <input type="date" name="fau_data_nascita" id="fau_data_nascita" max="<?php echo date('Y-m-d'); ?>">

        <label for="fk_prc_id">Parco:</label>
        <select name="fk_prc_id" id="fk_prc_id">
            <option value="0" selected> </option>
            <option value="1">Parco Nazionale del Gran Paradiso</option>
            <option value="2">Parco Nazionale dei Monti Sibillini</option>
            <option value="3">Parco Nazionale delle Cinque Terre</option>
            <option value="4">Parco Nazionale del Gargano</option>
            <option value="5">Parco Nazionale d'Abruzzo, Lazio e Molise</option>
            <option value="6">Parco Nazionale del Vesuvio</option>
            <option value="7">Parco Nazionale d'Aspromonte</option>
            <option value="8">Parco Nazionale dell'Arcipelago di La Maddalena</option>
            <option value="9">Parco Nazionale delle Foreste Casentinesi, Monte Falterona e Campigna</option>
            <option value="10">Parco Nazionale dello Stelvio</option>
        </select>


        <input type="submit" value="Inserisci">
    </form>
    <script>
        document.getElementById("insertForm").addEventListener("submit", function(event) {
            var fau_dex = document.getElementById("fau_dex").value;
            var fau_data_nascita = document.getElementById("fau_data_nascita").value;
            var spf_id = document.getElementById("spf_id").value;
            var fau_sesso = document.getElementById("fau_sesso").value;
            var fau_stato_salute = document.getElementById("fau_stato_salute").value;
            var fk_prc_id = document.getElementById("fk_prc_id").value;
            var errorMessage = "";

            if (fau_dex.trim() === "") {
                errorMessage += "Il campo Nome dell'animale è obbligatorio.\n";
            }
            if (spf_id === "0") {
                errorMessage += "Il campo Specie è obbligatorio.\n";
            }
            if (fau_sesso === "0") {
                errorMessage += "Il campo Sesso è obbligatorio.\n";
            }
            if (fau_stato_salute === "0") {
                errorMessage += "Il campo Stato Salute è obbligatorio.\n";
            }
            if (fau_data_nascita.trim() === "") {
                errorMessage += "Il campo Data di Nascita è obbligatorio.\n";
            }
            if (fk_prc_id === "0") {
                errorMessage += "Il campo Parco è obbligatorio.\n";
            }

            if (errorMessage !== "") {
                alert(errorMessage);
                event.preventDefault(); // Impedisce l'invio del modulo se ci sono errori
            }
        });
    </script>

</body>

</html>

<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "turilloparchinaturali";

$conn = mysqli_connect($servername, $username, $password, $dbname);

if (!$conn) {
    die("Connessione fallita: " . mysqli_connect_error());
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $spf_id = $_POST['spf_id'];
    $fau_sesso = $_POST['fau_sesso'];
    $fau_stato_salute = $_POST['fau_stato_salute'];
    $fau_data_nascita = $_POST['fau_data_nascita'];
    $fk_prc_id = $_POST['fk_prc_id'];
    $fau_dex = $_POST['fau_dex'];

    $query = "INSERT INTO fauna (fk_spf_id, fau_sesso, fau_stato_salute, fau_data_nascita, fk_prc_id, fau_dex) VALUES ('$spf_id', '$fau_sesso', '$fau_stato_salute', '$fau_data_nascita', '$fk_prc_id', '$fau_dex')";

    if (mysqli_query($conn, $query)) {
        echo "<script>window.location.href = 'tabella_fauna.php';</script>";
        exit();
    } else {
        echo "Errore durante l'inserimento dei dati: " . mysqli_error($conn);
    }
}

mysqli_close($conn);
?>