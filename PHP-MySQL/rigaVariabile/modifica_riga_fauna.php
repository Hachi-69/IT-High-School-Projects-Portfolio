<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Modifica Riga</title>
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
    <h2>Modifica Riga</h2>
    <?php
    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "turilloparchinaturali";

    $conn = mysqli_connect($servername, $username, $password, $dbname);

    if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
    }

    $id = $_GET['id'];
    $query = "SELECT fauna.*, speciefauna.spf_dex, parchi.prc_dex FROM fauna INNER JOIN speciefauna ON fauna.fk_spf_id = speciefauna.spf_id INNER JOIN parchi ON fauna.fk_prc_id = parchi.prc_id WHERE fau_id = '$id'";

    $result = mysqli_query($conn, $query);

    if (mysqli_num_rows($result) == 0) {
        echo "Riga non trovata nel database.";
        exit();
    }

    $row = mysqli_fetch_assoc($result);

    mysqli_close($conn);
    ?>


    <form action="salva_modifica_fauna.php" method="post">
        <input type="hidden" name="fau_id" value="<?php echo $row['fau_id']; ?>">

        <label for="fau_dex">Nome dell'animale:</label>
        <input type="text" name="fau_dex" id="fau_dex" value="<?php echo $row['fau_dex']; ?>">
        <br>

        <label for="fk_spf_id">Specie:</label>
        <select name="fk_spf_id" id="fk_spf_id">
            <option value="1" <?php echo ($row['fk_spf_id'] == '1') ? 'selected' : ''; ?>>Elefante</option>
            <option value="2" <?php echo ($row['fk_spf_id'] == '2') ? 'selected' : ''; ?>>Tigre</option>
            <option value="3" <?php echo ($row['fk_spf_id'] == '3') ? 'selected' : ''; ?>>Gorilla</option>
            <option value="4" <?php echo ($row['fk_spf_id'] == '4') ? 'selected' : ''; ?>>Orso</option>
            <option value="5" <?php echo ($row['fk_spf_id'] == '5') ? 'selected' : ''; ?>>Lupo</option>
            <option value="6" <?php echo ($row['fk_spf_id'] == '6') ? 'selected' : ''; ?>>Balena</option>
            <option value="7" <?php echo ($row['fk_spf_id'] == '7') ? 'selected' : ''; ?>>Squalo</option>
            <option value="8" <?php echo ($row['fk_spf_id'] == '8') ? 'selected' : ''; ?>>Pappagallo</option>
            <option value="9" <?php echo ($row['fk_spf_id'] == '9') ? 'selected' : ''; ?>>Gufo</option>
            <option value="10" <?php echo ($row['fk_spf_id'] == '10') ? 'selected' : ''; ?>>Picchio</option>
            <option value="11" <?php echo ($row['fk_spf_id'] == '11') ? 'selected' : ''; ?>>Serpente</option>
            <option value="12" <?php echo ($row['fk_spf_id'] == '12') ? 'selected' : ''; ?>>Tartaruga</option>
            <option value="13" <?php echo ($row['fk_spf_id'] == '13') ? 'selected' : ''; ?>>Rana</option>
            <option value="14" <?php echo ($row['fk_spf_id'] == '14') ? 'selected' : ''; ?>>Farfalla</option>
            <option value="15" <?php echo ($row['fk_spf_id'] == '15') ? 'selected' : ''; ?>>Ape</option>
            <option value="16" <?php echo ($row['fk_spf_id'] == '16') ? 'selected' : ''; ?>>Ragno</option>
            <option value="17" <?php echo ($row['fk_spf_id'] == '17') ? 'selected' : ''; ?>>Granchio</option>
            <option value="18" <?php echo ($row['fk_spf_id'] == '18') ? 'selected' : ''; ?>>Lumaca</option>
            <option value="19" <?php echo ($row['fk_spf_id'] == '19') ? 'selected' : ''; ?>>Medusa</option>
            <option value="20" <?php echo ($row['fk_spf_id'] == '20') ? 'selected' : ''; ?>>Stella Marina</option>
            <option value="21" <?php echo ($row['fk_spf_id'] == '21') ? 'selected' : ''; ?>>Tigre</option>
            <option value="22" <?php echo ($row['fk_spf_id'] == '22') ? 'selected' : ''; ?>>Pinguino</option>
            <option value="23" <?php echo ($row['fk_spf_id'] == '23') ? 'selected' : ''; ?>>Aquila</option>
            <option value="24" <?php echo ($row['fk_spf_id'] == '24') ? 'selected' : ''; ?>>Cobra</option>
            <option value="26" <?php echo ($row['fk_spf_id'] == '26') ? 'selected' : ''; ?>>Salmone</option>
        </select>
        <br>

        <label for="fau_sesso">Sesso:</label>
        <select name="fau_sesso" id="fau_sesso">
            <option value="M" <?php echo ($row['fau_sesso'] == 'M') ? 'selected' : ''; ?>>Maschio</option>
            <option value="F" <?php echo ($row['fau_sesso'] == 'F') ? 'selected' : ''; ?>>Femmina</option>
        </select>
        <br>

        <label for="fau_stato_salute">Stato Salute:</label>
        <select name="fau_stato_salute" id="fau_stato_salute">
            <option value="S" <?php echo ($row['fau_stato_salute'] == 'S') ? 'selected' : ''; ?>>In Salute</option>
            <option value="M" <?php echo ($row['fau_stato_salute'] == 'M') ? 'selected' : ''; ?>>Malato</option>
        </select>
        <br>

        <label for="fau_data_nascita">Data di Nascita:</label>
        <input type="date" name="fau_data_nascita" id="fau_data_nascita" value="<?php echo $row['fau_data_nascita']; ?>">
        <br>

        <label for="fk_prc_id">Parco:</label>
        <select name="fk_prc_id" id="fk_prc_id">
            <option value="1" <?php echo ($row['fk_prc_id'] == '1') ? 'selected' : ''; ?>>Parco Nazionale del Gran Paradiso</option>
            <option value="2" <?php echo ($row['fk_prc_id'] == '2') ? 'selected' : ''; ?>>Parco Nazionale dei Monti Sibillini</option>
            <option value="3" <?php echo ($row['fk_prc_id'] == '3') ? 'selected' : ''; ?>>Parco Nazionale delle Cinque Terre</option>
            <option value="4" <?php echo ($row['fk_prc_id'] == '4') ? 'selected' : ''; ?>>Parco Nazionale del Gargano</option>
            <option value="5" <?php echo ($row['fk_prc_id'] == '5') ? 'selected' : ''; ?>>Parco Nazionale d'Abruzzo, Lazio e Molise</option>
            <option value="6" <?php echo ($row['fk_prc_id'] == '6') ? 'selected' : ''; ?>>Parco Nazionale del Vesuvio</option>
            <option value="7" <?php echo ($row['fk_prc_id'] == '7') ? 'selected' : ''; ?>>Parco Nazionale d'Aspromonte</option>
            <option value="8" <?php echo ($row['fk_prc_id'] == '8') ? 'selected' : ''; ?>>Parco Nazionale dell'Arcipelago di La Maddalena</option>
            <option value="9" <?php echo ($row['fk_prc_id'] == '9') ? 'selected' : ''; ?>>Parco Nazionale delle Foreste Casentinesi</option>
            <option value="10" <?php echo ($row['fk_prc_id'] == '10') ? 'selected' : ''; ?>>Parco Nazionale dello Stelvio</option>
        </select>
        <br>


        <input type="submit" value="Modifica">


    </form>
</body>

</html>