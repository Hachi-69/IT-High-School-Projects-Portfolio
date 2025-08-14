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
    $query = "SELECT flora.*, specieflora.spo_dex, parchi.prc_dex FROM flora INNER JOIN specieflora ON flora.fk_spo_id = specieflora.spo_id INNER JOIN parchi ON flora.fk_prc_id = parchi.prc_id WHERE flo_id = '$id'";

    $result = mysqli_query($conn, $query);

    if (mysqli_num_rows($result) == 0) {
        echo "Riga non trovata nel database.";
        exit();
    }

    $row = mysqli_fetch_assoc($result);

    mysqli_close($conn);
    ?>


    <form action="salva_modifica_flora.php" method="post">
        <input type="hidden" name="flo_id" value="<?php echo $row['flo_id']; ?>">

        <label for="flo_dex">Nome della pianta:</label>
        <input type="text" name="flo_dex" id="flo_dex" value="<?php echo $row['flo_dex']; ?>">
        <br>

        <label for="fk_spo_id">Specie:</label>
        <select name="fk_spo_id" id="fk_spo_id">
            <option value="1" <?php echo ($row['fk_spo_id'] == '1') ? 'selected' : ''; ?>>Pino</option>
            <option value="2" <?php echo ($row['fk_spo_id'] == '2') ? 'selected' : ''; ?>>Quercia</option>
            <option value="3" <?php echo ($row['fk_spo_id'] == '3') ? 'selected' : ''; ?>>Betulla</option>
            <option value="4" <?php echo ($row['fk_spo_id'] == '4') ? 'selected' : ''; ?>>Faggio</option>
            <option value="5" <?php echo ($row['fk_spo_id'] == '5') ? 'selected' : ''; ?>>Abete</option>
            <option value="6" <?php echo ($row['fk_spo_id'] == '6') ? 'selected' : ''; ?>>Cedro</option>
            <option value="7" <?php echo ($row['fk_spo_id'] == '7') ? 'selected' : ''; ?>>Acero</option>
            <option value="8" <?php echo ($row['fk_spo_id'] == '8') ? 'selected' : ''; ?>>Olmo</option>
            <option value="9" <?php echo ($row['fk_spo_id'] == '9') ? 'selected' : ''; ?>>Salice</option>
            <option value="10" <?php echo ($row['fk_spo_id'] == '10') ? 'selected' : ''; ?>>Ginepro</option>
            <option value="11" <?php echo ($row['fk_spo_id'] == '11') ? 'selected' : ''; ?>>Larice</option>
            <option value="12" <?php echo ($row['fk_spo_id'] == '12') ? 'selected' : ''; ?>>Ontano</option>
            <option value="13" <?php echo ($row['fk_spo_id'] == '13') ? 'selected' : ''; ?>>Castagno</option>
            <option value="14" <?php echo ($row['fk_spo_id'] == '14') ? 'selected' : ''; ?>>Ciliegio</option>
            <option value="15" <?php echo ($row['fk_spo_id'] == '15') ? 'selected' : ''; ?>>Melo</option>
            <option value="16" <?php echo ($row['fk_spo_id'] == '16') ? 'selected' : ''; ?>>Pesco</option>
            <option value="17" <?php echo ($row['fk_spo_id'] == '17') ? 'selected' : ''; ?>>Prugno</option>
            <option value="18" <?php echo ($row['fk_spo_id'] == '18') ? 'selected' : ''; ?>>Susino</option>
            <option value="19" <?php echo ($row['fk_spo_id'] == '19') ? 'selected' : ''; ?>>Biancospino</option>
            <option value="20" <?php echo ($row['fk_spo_id'] == '20') ? 'selected' : ''; ?>>Ginepro comune</option>
            <option value="21" <?php echo ($row['fk_spo_id'] == '21') ? 'selected' : ''; ?>>Pungitopo</option>
            <option value="22" <?php echo ($row['fk_spo_id'] == '22') ? 'selected' : ''; ?>>Corbezzolo</option>
            <option value="23" <?php echo ($row['fk_spo_id'] == '23') ? 'selected' : ''; ?>>Erica</option>
            <option value="24" <?php echo ($row['fk_spo_id'] == '24') ? 'selected' : ''; ?>>Alloro</option>
            <option value="25" <?php echo ($row['fk_spo_id'] == '25') ? 'selected' : ''; ?>>Millefoglie</option>
            <option value="26" <?php echo ($row['fk_spo_id'] == '26') ? 'selected' : ''; ?>>Mirto</option>
            <option value="27" <?php echo ($row['fk_spo_id'] == '27') ? 'selected' : ''; ?>>Rovo</option>
            <option value="28" <?php echo ($row['fk_spo_id'] == '28') ? 'selected' : ''; ?>>Sambuco</option>
            <option value="29" <?php echo ($row['fk_spo_id'] == '29') ? 'selected' : ''; ?>>Ligustro</option>
            <option value="30" <?php echo ($row['fk_spo_id'] == '30') ? 'selected' : ''; ?>>Anemone</option>
            <option value="31" <?php echo ($row['fk_spo_id'] == '31') ? 'selected' : ''; ?>>Tulipano</option>
            <option value="32" <?php echo ($row['fk_spo_id'] == '32') ? 'selected' : ''; ?>>Ortensia</option>
            <option value="33" <?php echo ($row['fk_spo_id'] == '33') ? 'selected' : ''; ?>>Girasole</option>
            <option value="34" <?php echo ($row['fk_spo_id'] == '34') ? 'selected' : ''; ?>>Fiordaliso</option>
            <option value="35" <?php echo ($row['fk_spo_id'] == '35') ? 'selected' : ''; ?>>Margherita</option>
            <option value="36" <?php echo ($row['fk_spo_id'] == '36') ? 'selected' : ''; ?>>Lavanda</option>
            <option value="37" <?php echo ($row['fk_spo_id'] == '37') ? 'selected' : ''; ?>>Geranio</option>
            <option value="38" <?php echo ($row['fk_spo_id'] == '38') ? 'selected' : ''; ?>>Campanella</option>
            <option value="39" <?php echo ($row['fk_spo_id'] == '39') ? 'selected' : ''; ?>>Bocca di leone</option>
            <option value="40" <?php echo ($row['fk_spo_id'] == '40') ? 'selected' : ''; ?>>Orchidea</option>
            <option value="41" <?php echo ($row['fk_spo_id'] == '41') ? 'selected' : ''; ?>>Narciso</option>
            <option value="42" <?php echo ($row['fk_spo_id'] == '42') ? 'selected' : ''; ?>>Primula</option>
            <option value="43" <?php echo ($row['fk_spo_id'] == '43') ? 'selected' : ''; ?>>Lillium</option>
            <option value="44" <?php echo ($row['fk_spo_id'] == '44') ? 'selected' : ''; ?>>Iris</option>
            <option value="45" <?php echo ($row['fk_spo_id'] == '45') ? 'selected' : ''; ?>>Ciclamino</option>
            <option value="46" <?php echo ($row['fk_spo_id'] == '46') ? 'selected' : ''; ?>>Peonia</option>
            <option value="47" <?php echo ($row['fk_spo_id'] == '47') ? 'selected' : ''; ?>>Dalia</option>
            <option value="48" <?php echo ($row['fk_spo_id'] == '48') ? 'selected' : ''; ?>>Amaranto</option>
            <option value="49" <?php echo ($row['fk_spo_id'] == '49') ? 'selected' : ''; ?>>Anemone</option>
        </select>
        <br>


        <label for="flo_stag_fiori">Stagione di Fioritura:</label>
        <select name="flo_stag_fiori" id="flo_stag_fiori">
            <option value="estate" <?php echo ($row['flo_stag_fiori'] == 'estate') ? 'selected' : ''; ?>>Estate</option>
            <option value="primavera" <?php echo ($row['flo_stag_fiori'] == 'primavera') ? 'selected' : ''; ?>>Primavera</option>
            <option value="autunno" <?php echo ($row['flo_stag_fiori'] == 'autunno') ? 'selected' : ''; ?>>Autunno</option>
            <option value="inverno" <?php echo ($row['flo_stag_fiori'] == 'inverno') ? 'selected' : ''; ?>>Inverno</option>
        </select>
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