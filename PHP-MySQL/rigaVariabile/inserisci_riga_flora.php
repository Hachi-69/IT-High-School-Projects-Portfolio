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

    <form id="insertForm" action="inserisci_riga_flora.php" method="post">

        <label for="flo_dex">Nome della pianta:</label>
        <input type="text" name="flo_dex" id="flo_dex">

        <label for="spo_id">Specie:</label>
        <select name="spo_id" id="spo_id">
            <option value="0" selected> </option>
            <option value="1">Pino</option>
            <option value="2">Quercia</option>
            <option value="3">Betulla</option>
            <option value="4">Faggio</option>
            <option value="5">Abete</option>
            <option value="6">Cedro</option>
            <option value="7">Acero</option>
            <option value="8">Olmo</option>
            <option value="9">Salice</option>
            <option value="10">Ginepro</option>
            <option value="11">Larice</option>
            <option value="12">Ontano</option>
            <option value="13">Castagno</option>
            <option value="14">Ciliegio</option>
            <option value="15">Melo</option>
            <option value="16">Pesco</option>
            <option value="17">Prugno</option>
            <option value="18">Susino</option>
            <option value="19">Biancospino</option>
            <option value="20">Ginepro comune</option>
            <option value="21">Pungitopo</option>
            <option value="22">Corbezzolo</option>
            <option value="23">Erica</option>
            <option value="24">Alloro</option>
            <option value="25">Millefoglie</option>
            <option value="26">Mirto</option>
            <option value="27">Rovo</option>
            <option value="28">Sambuco</option>
            <option value="29">Ligustro</option>
            <option value="30">Anemone</option>
            <option value="31">Tulipano</option>
            <option value="32">Ortensia</option>
            <option value="33">Girasole</option>
            <option value="34">Fiordaliso</option>
            <option value="35">Margherita</option>
            <option value="36">Lavanda</option>
            <option value="37">Geranio</option>
            <option value="38">Campanella</option>
            <option value="39">Bocca di leone</option>
            <option value="40">Orchidea</option>
            <option value="41">Narciso</option>
            <option value="42">Primula</option>
            <option value="43">Lillium</option>
            <option value="44">Iris</option>
            <option value="45">Ciclamino</option>
            <option value="46">Peonia</option>
            <option value="47">Dalia</option>
            <option value="48">Amaranto</option>
            <option value="49">Anemone</option>
        </select>


        <label for="flo_stag_fiori">Stagione di Fioritura:</label>
        <select name="flo_stag_fiori" id="flo_stag_fiori">
            <option value="0" selected> </option>
            <option value="estate">Estate</option>
            <option value="primavera">Primavera</option>
            <option value="autunno">Autunno</option>
            <option value="inverno">Inverno</option>
        </select>


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
            var flo_dex = document.getElementById("flo_dex").value;
            var flo_stag_fiori = document.getElementById("flo_stag_fiori").value;
            var spo_id = document.getElementById("spo_id").value;
            var fk_prc_id = document.getElementById("fk_prc_id").value;
            var errorMessage = "";

            if (flo_dex.trim() === "") {
                errorMessage += "Il campo Nome della pianta è obbligatorio.\n";
            }
            if (spo_id === "0") {
                errorMessage += "Il campo Specie è obbligatorio.\n";
            }
            if (flo_stag_fiori === "0") {
                errorMessage += "Il campo Stagione di Fioritura è obbligatorio.\n";
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
    $spo_id = $_POST['spo_id'];
    $flo_stag_fiori = $_POST['flo_stag_fiori'];
    $fk_prc_id = $_POST['fk_prc_id'];
    $flo_dex = $_POST['flo_dex'];

    $query = "INSERT INTO flora (fk_spo_id, flo_stag_fiori, fk_prc_id, flo_dex) VALUES ('$spo_id', '$flo_stag_fiori', '$fk_prc_id', '$flo_dex')";

    if (mysqli_query($conn, $query)) {
        echo "<script>window.location.href = 'tabella_flora.php';</script>";
        exit();
    } else {
        echo "Errore durante l'inserimento dei dati: " . mysqli_error($conn);
    }
}

mysqli_close($conn);
?>