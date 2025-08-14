<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>GUERTURMAZ</title>
    <style>
        /* Stile per l'immagine */
        .map-image {
            width: 300px;
            /* Imposta la larghezza desiderata */
            height: auto;
            /* Imposta l'altezza in base alla larghezza */
            position: absolute;
            /* Posiziona l'immagine in modo assoluto */
            top: 100px;
            /* Distanza dal bordo superiore */
            left: 40px;
            /* Distanza dal bordo sinistro */
            cursor: pointer;
            /* Cambia il cursore al passaggio sopra l'immagine */
        }

        /* Stili mantenuti */
        /* Stile per il rettangolo in cima alla pagina */
        .header-container {
            background-color: #343331;
            padding: 10px;
            color: #ffffff;
            text-align: center;
            margin-bottom: 20px;
            position: relative;
            /* Aggiunto per posizionare l'immagine in base a questo */
        }

        /* Stile per il rettangolo verticale a sinistra */
        .left-container {
            background-color: #343331;
            height: 200vh;
            width: 20%;
            float: left;
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
        }

        /* Stili precedenti mantenuti */
        table {
            width: 100%;
            border-collapse: collapse;
        }

        table,
        th,
        td {
            border: 1px solid black;
        }

        th,
        td {
            padding: 10px;
            text-align: center;
        }

        th {
            background-color: #f2f2f2;
            cursor: pointer;
            position: relative;
        }

        button {
            padding: 5px 10px;
        }

        @font-face {
            font-family: 'font';
            src: url('font.otf') format('opentype');
            font-weight: normal;
            font-style: normal;
        }

        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #032217;
            color: #ffffff;
            border-radius: 5px;
            font-family: 'font', Arial, sans-serif;
        }

        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 60%;
            background-color: #FFB100;
            color: #000000;
            font-family: 'font', Arial, sans-serif;
            border: 0px !important;
            border-collapse: collapse;
            overflow: hidden;
            border-radius: 5px;
        }

        th,
        td {
            border: 1px solid #ddd;
            padding: 10px;
            font-family: 'font', Arial, sans-serif;
            border: 2px dashed white !important;
        }

        th {
            color: #FFB100;
            background-color: #343331;
        }

        button {
            background-color: #343331;
            color: #FFB100;
            padding: 5px;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            font-family: 'font', Arial, sans-serif;
        }

        button:hover {
            background-color: #000000;
            color: #FFB100;
        }

        .inserisci {
            width: 150px;
            height: 90px;
            font-size: 20px;
        }

        .inserisci2 {
            width: 150px;
            height: 50px;
            font-size: 20px;
        }

        .nome {
            font-size: 20px;
        }

        /* Stile per la colonna delle checkbox */
        .checkbox-column {
            width: 30px;
            text-align: center;
        }

        .checkbox-column input[type="checkbox"] {
            visibility: visible;
            /* Modifica la visibilità */
        }

        .checkbox-column input[type="checkbox"]:checked~.row-highlight {
            background-color: #4CAF50;
        }

        /* Stili CSS per la riga selezionata */
        .selected-row {
            background-color: #cce5ff;
            /* Colore di evidenziazione della riga */
        }
    </style>
</head>

<?php
// Verifica se sono stati passati degli ID come parametri di query
if (isset($_GET['ids'])) {
    $ids = $_GET['ids'];

    // Utilizza una funzione personalizzata per estrarre solo i numeri interi
    $formeSelezionate = extractIntegers($ids);

    if (!empty($formeSelezionate)) {
        // Connessione al database
        $conn = mysqli_connect("localhost", "root", "", "caseifici_gueturmaz");

        if (!$conn) {
            die("Connessione fallita: " . mysqli_connect_error());
        }

        // Costruisci la query SQL per selezionare le informazioni delle forme selezionate
        $query = "SELECT frm_csf_id, frm_id, frm_stagionatura, frm_prima_scelta, frm_data_produzione, frm_progressivo_mese 
                  FROM forme
                  WHERE frm_id IN (" . implode(',', $formeSelezionate) . ")";

        $result = mysqli_query($conn, $query);


        if (mysqli_num_rows($result) > 0) {
            echo "<h2>Riepilogo Forme Selezionate</h2>";
            echo "<table>";
            echo "<thead>";
            echo "<tr>";
            echo "<th>ID</th>";
            echo "<th>Stagionatura</th>";
            echo "<th>Prima Scelta</th>";
            echo "<th>Data Produzione</th>";
            echo "<th>Progressivo Mese</th>";
            echo "</tr>";
            echo "</thead>";
            echo "<tbody>";

            // Itera sui risultati della query e stampa le informazioni delle forme selezionate
            while ($row = mysqli_fetch_assoc($result)) {
                echo "<tr>";
                echo "<td>" . $row['frm_id'] . "</td>";
                echo "<td>" . $row['frm_stagionatura'] . "</td>";
                echo "<td>" . ($row['frm_prima_scelta'] ? 'Sì' : 'No') . "</td>";
                echo "<td>" . $row['frm_data_produzione'] . "</td>";
                echo "<td>" . $row['frm_progressivo_mese'] . "</td>";
                echo "</tr>";
                $frm_csf_id = $row["frm_csf_id"];
            }

            echo "</tbody>";
            echo "</table>";
        } else {
            echo "<p>Nessuna forma selezionata.</p>";
        }

        mysqli_close($conn);
    } else {
        echo "<p>Nessun ID valido passato.</p>";
    }
} else {
    echo "<p>Nessuna forma selezionata.</p>";
}

// Funzione per estrarre numeri interi da una stringa
function extractIntegers($string)
{
    preg_match_all('/\d+/', $string, $matches);
    return array_map('intval', $matches[0]);
}

// Connessione al database
$conn = mysqli_connect("localhost", "root", "", "caseifici_gueturmaz");

if (!$conn) {
    die("Connessione fallita: " . mysqli_connect_error());
}

// Query per selezionare tutti i dati dei clienti dalla tabella "clienti"
$query_clienti = "SELECT cln_id,cln_nome, cln_cognome, cln_mail FROM clienti";
$result_clienti = mysqli_query($conn, $query_clienti);

// Array per memorizzare i dati dei clienti
$dati_clienti = array();

if (mysqli_num_rows($result_clienti) > 0) {
    while ($row = mysqli_fetch_assoc($result_clienti)) {
        $dati_clienti[] = $row;
    }
}
mysqli_close($conn);
?>

<body>
    <form action="inserisci.php" method="GET">
        <select name="cliente_id">
            <?php
            // Mostra i nomi, cognomi ed email dei clienti nel menu a discesa
            foreach ($dati_clienti as $cliente) {
                $id_cliente = $cliente['cln_id']; // Aggiunto il recupero dell'ID del cliente
                $nome = $cliente['cln_nome'];
                $cognome = $cliente['cln_cognome'];
                $email = $cliente['cln_mail'];
                echo "<option value=\"$id_cliente\">$nome $cognome ($email)</option>"; // Aggiunto id_cliente come value
            }
            ?>
        </select>
        <input type="hidden" name="ids" value="<?php echo implode(',', $formeSelezionate); ?>">
        <input type="hidden" name="frm_csf_id" value="<?php echo $frm_csf_id ?>">
        <button type="submit">Seleziona</button>
    </form>
</body>