<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inserisci attività giornaliera</title>
    <style>
        body {
            font-family: 'font', Arial, sans-serif;
            text-align: center;
            background-color: #032217;
            color: #ffffff;
            border-radius: 5px;
        }

        /* Stile per il pulsante "Torna Indietro" */
        .back-button {
            background-color: #ffb100;
            color: #343331;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            float: right;
            margin-top: -3px;
            font-family: 'font', Arial, sans-serif;
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
    <!-- Rettangolo in cima alla pagina con il pulsante "Torna Indietro" -->
    <div class="header-container">
        <button class="back-button" onclick="window.location.href = 'tabella_attivita_giornaliere.php?caseificio=<?php echo $_GET['caseificio']; ?>';">Torna
            Indietro
    </div>

    <h2>Aggiungi Attività Giornaliera</h2>

    <form id="insertActivityForm" method="post">
        <label for="atg_latte_lavorato">Quantità di Latte Lavorato:</label>
        <input type="number" name="atg_latte_lavorato" id="atg_latte_lavorato" required>
        <br><br>
        <label for="atg_latte_formaggio">Quantità di Latte Trasformato in Formaggio:</label>
        <input type="number" name="atg_latte_formaggio" id="atg_latte_formaggio" required>
        <br><br>
        <label for="atg_forme_prodotte">Numero di Forme Prodotte:</label>
        <input type="number" name="atg_forme_prodotte" id="atg_forme_prodotte" required>
        <br><br>
        <label for="atg_forme_vendute">Numero di Forme Vendute:</label>
        <input type="number" name="atg_forme_vendute" id="atg_forme_vendute" required>
        <br><br>
        <input type="hidden" name="caseificio" value="<?php echo $_GET['caseificio']; ?>">
        <input type="submit" name="submit_activity" value="Aggiungi Attività Giornaliera">
    </form>

    <hr>

    <h2>Inserisci Forme</h2>

    <form id="insertForm" method="post">
        <label for="numeroForme">Numero di forme da inserire:</label>
        <input type="number" name="numeroForme" id="numeroForme" min="1" required>
        <br><br>
        <label for="frm_prima_scelta">Prima scelta:</label>
        <input type="checkbox" name="frm_prima_scelta" id="frm_prima_scelta">
        <br><br>
        <label for="frm_data_produzione">Data Produzione:</label>
        <input type="date" name="frm_data_produzione" required>
        <br><br>
        <label for="stagionatura">Stagionatura:</label>
        <select name="stagionatura" required>
            <option value="12">12 mesi</option>
            <option value="24">24 mesi</option>
            <option value="30">30 mesi</option>
            <option value="36">36 mesi</option>
        </select>
        <br><br>
        <input type="hidden" name="caseificio" value="<?php echo $_GET['caseificio']; ?>">
        <input type="submit" name="submit_form" value="Inserisci">
    </form>

    <?php
    // Connessione al database
    $conn = mysqli_connect("localhost", "root", "", "caseifici_gueturmaz");

    // Verifica della connessione
    if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
    }

    // Elaborazione dei dati inviati dal modulo di aggiunta attività giornaliera
    if (isset($_POST["submit_activity"])) {
        $atg_latte_lavorato = $_POST['atg_latte_lavorato'];
        $atg_latte_formaggio = $_POST['atg_latte_formaggio'];
        $atg_forme_prodotte = $_POST['atg_forme_prodotte'];
        $atg_forme_vendute = $_POST['atg_forme_vendute'];
        $atg_csf_id = $_POST['caseificio'];

        $query_activity = "INSERT INTO attivita_giornaliere (atg_latte_lavorato, atg_latte_formaggio, atg_forme_prodotte, atg_forme_vendute, atg_csf_id) 
                       VALUES ('$atg_latte_lavorato', '$atg_latte_formaggio', '$atg_forme_prodotte', '$atg_forme_vendute', '$atg_csf_id')";

        if (mysqli_query($conn, $query_activity)) {
            echo "Attività giornaliera aggiunta con successo.<br>";
        } else {
            echo "Errore durante l'aggiunta dell'attività giornaliera: " . mysqli_error($conn) . "<br>";
        }
    }

    // Elaborazione dei dati inviati dal modulo di inserimento delle forme
    if (isset($_POST["submit_form"])) {
        $caseificio = $_POST['caseificio'];
        $numeroForme = $_POST['numeroForme'];
        $primaScelta = isset($_POST['frm_prima_scelta']) ? 1 : 0;
        $dataProduzione = $_POST['frm_data_produzione'];
        $stagionatura = $_POST['stagionatura'];

        $annoProduzione = date('Y', strtotime($dataProduzione));
        $meseProduzione = date('m', strtotime($dataProduzione));

        $queryUltimoProgressivo = "SELECT MAX(frm_progressivo_mese) AS ultimo_progressivo FROM forme WHERE YEAR(frm_data_produzione) = '$annoProduzione' AND MONTH(frm_data_produzione) = '$meseProduzione'";
        $resultUltimoProgressivo = mysqli_query($conn, $queryUltimoProgressivo);

        if ($resultUltimoProgressivo) {
            $rowUltimoProgressivo = mysqli_fetch_assoc($resultUltimoProgressivo);
            $ultimoProgressivo = $rowUltimoProgressivo['ultimo_progressivo'];
        } else {
            $ultimoProgressivo = 0;
        }

        $query_form = "INSERT INTO forme (frm_stagionatura, frm_prima_scelta, frm_data_produzione, frm_progressivo_mese, frm_csf_id) VALUES ";

        for ($i = 0; $i < $numeroForme; $i++) {
            if ($i > 0) {
                $query_form .= ", ";
            }
            $query_form .= "('$stagionatura', '$primaScelta', '$dataProduzione', '" . ($ultimoProgressivo + $i + 1) . "', '$caseificio')";
        }

        if (mysqli_query($conn, $query_form)) {
            echo "Forme inserite con successo.<br>";
        } else {
            echo "Errore durante l'inserimento delle forme: " . mysqli_error($conn) . "<br>";
        }
    }

    // Chiusura della connessione
    mysqli_close($conn);
    ?>

</body>

</html>