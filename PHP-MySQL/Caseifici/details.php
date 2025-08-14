<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Informazioni sulla Riga</title>
    <style>
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

        .quantity {
            width: 30px;
            border-radius: 5px;
            font-family: 'font', Arial, sans-serif;

        }

        .quantity-controls {
            display: flex;
            justify-content: center;
            align-items: center;
            border-radius: 5px;
            font-family: 'font', Arial, sans-serif;

        }

        .quantity-controls button {
            margin: 0 5px;
            border-radius: 50%;
            font-family: 'font', Arial, sans-serif;
            font-size: 20px;
            width: 30px;
            height: 30px;
            padding-right: 4px;
        }

        button {
            background-color: #343331;
            color: #FFB100;
            padding: 3px;
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
            height: 70px;
            font-size: 20px;
        }
    </style>
</head>

<body>
    <h2>Informazioni sulla Riga</h2>
    <table>
        <thead>
            <tr>
                <th>ID identificativo</th>
                <th>mesi di stagionatura</th>
                <th>qualita (prima scelta)</th>
                <th>data di produzione</th>
                <th>progressivo del mese</th>
                <th>caseificio di appartenenza</th>
                <th>email del caseificio</th>
                <th>contatto telefonico</th>
                <th>indirizzo (via)</th>
                <th>citta</th>
                <th>numero civico del caseificio</th>
                <th>cap</th>
                <th>nome cliente (se venduta)</th>
                <th>cognome (se venduta)</th>
                <th>mail (se venduta)</th>
                <th>codice fiscale (se venduta)</th>
                <th>partita iva (se venduta)</th>
            </tr>
        </thead>
        <tbody>
            <?php
            $servername = "localhost";
            $username = "root";
            $password = "";
            $dbname = "caseifici_gueturmaz";

            $conn = mysqli_connect($servername, $username, $password, $dbname);

            if (!$conn) {
                die("Connessione fallita: " . mysqli_connect_error());
            }

            if (isset($_GET['id'])) {
                $id = $_GET['id'];

                $query = "SELECT forme.*, caseifici.*, clienti.*
                FROM (forme LEFT JOIN clienti ON frm_cln_id = cln_id) JOIN caseifici ON frm_csf_id = csf_id
                WHERE frm_id = '$id'";

                $result = mysqli_query($conn, $query);

                if (mysqli_num_rows($result) > 0) {
                    while ($row = mysqli_fetch_assoc($result)) {
                        echo "<tr>";
                        echo "<td>" . $row['frm_id'] . "</td>";
                        echo "<td>" . $row['frm_stagionatura'] . "</td>";
                        echo "<td>" . ($row['frm_prima_scelta'] == "1" ? "Alta qualita" : "Non prima scelta") . "</td>";
                        echo "<td>" . $row['frm_data_produzione'] . "</td>";
                        echo "<td>" . $row['frm_progressivo_mese'] . "</td>";
                        echo "<td>" . $row['csf_nome'] . "</td>";
                        echo "<td>" . $row['csf_mail'] . "</td>";
                        echo "<td>" . $row['csf_num_tel'] . "</td>";
                        echo "<td>" . $row['csf_via'] . "</td>";
                        echo "<td>" . $row['csf_citta'] . "</td>";
                        echo "<td>" . $row['csf_num_civico'] . "</td>";
                        echo "<td>" . $row['csf_cap'] . "</td>";
                        echo "<td>" . $row['cln_nome'] . "</td>";
                        echo "<td>" . $row['cln_cognome'] . "</td>";
                        echo "<td>" . $row['cln_mail'] . "</td>";
                        echo "<td>" . $row['cln_cod_fiscale'] . "</td>";
                        echo "<td>" . $row['cln_partita_iva'] . "</td>";
                        echo "</tr>";
                    }
                } else {
                    echo "Nessun risultato trovato";
                }
            } else {
                echo "ID non specificato";
            }

            mysqli_close($conn);
            ?>

        </tbody>
    </table>

    <button onclick="goBack()">Indietro</button>

    <script>
        function goBack() {
            window.history.back();
        }
    </script>
</body>

</html>