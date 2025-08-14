<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <title>Riepilogo Ordine</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
        @font-face {
            font-family: 'font';
            src: url('font.otf') format('opentype');
            font-weight: normal;
            font-style: normal;
        }

        body {
            font-family: 'font', Arial, sans-serif;
            text-align: center;
            background-color: #032217;
            color: #ffffff;
            border-radius: 5px;
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

        p {
            margin-top: 20px;
            font-size: 18px;
        }

        a {
            color: #ffb100;
            text-decoration: none;
            font-weight: bold;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>
    <h2>Riepilogo Ordine</h2>

    <table>
        <tr>
            <th>Prodotto</th>
            <th>Prezzo</th>
            <th>Quantità</th>
        </tr>
        <?php
        session_start();

        $jsonData = file_get_contents('JSON.json');
        $products = json_decode($jsonData, true);

        $totalQuantity = 0;
        $totalPrice = 0;

        $productsOrdered = false;

        foreach ($products['prodotti'] as $product) {
            $productName = $product['nome'];
            $quantity = isset($_SESSION[$productName]) ? intval($_SESSION[$productName]) : 0;

            if ($quantity > 0) {
                $productsOrdered = true;

                $productPrice = $product['prezzo'];
                $totalPrice += $quantity * $productPrice;
                $totalQuantity += $quantity;

                echo '<tr>';
                echo '<td>';
                echo '<i class="' . $product['icon'] . '"></i> ';
                echo $product['nome'];
                echo '</td>';
                echo '<td>' . $quantity . '</td>';
                echo '<td>' . number_format($quantity * $productPrice, 2, '.', '') . ' €</td>';
                echo '</tr>';
            }
        }

        if (!$productsOrdered) {
            echo '<tr>';
            echo '<td colspan="3">Nessun prodotto ordinato!</td>';
            echo '</tr>';
            echo '<p>Torna all` <a href="merende.php"> ordine</a></p>';
        }
        ?>
    </table>

    Totale Quantità: <?php echo $totalQuantity; ?></p>
    Prezzo Totale: <?php echo number_format($totalPrice, 2, '.', ''); ?> €

</body>

</html>