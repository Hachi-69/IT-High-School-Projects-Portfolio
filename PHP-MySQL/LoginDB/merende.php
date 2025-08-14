<!DOCTYPE html>
<html lang="it">

<head>
    <meta charset="UTF-8">
    <title>Ordina Merende</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
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

        #totalPrice {
            margin-top: 20px;
            font-size: 18px;
        }

        button:hover {
            background-color: #FFB100;
            color: #343331;
        }

        .quantity-controls button:hover {
            background-color: #2C2929;
            color: #FFB100;
        }
    </style>
</head>

<body>
    <h2>Ordina Merende</h2>
    <table>
        <tr>
            <th>Prodotto</th>
            <th>Prezzo</th>
            <th>Quantità</th>
        </tr>

        <?php
        function controllaChiaveSessione($chiave)
        {
            if (array_key_exists($chiave, $_SESSION)) {
                return $_SESSION[$chiave];
            } else {
                return 0;
            }
        }
        session_start();

        $jsonData = file_get_contents('JSON.json');
        $products = json_decode($jsonData, true);

        $totalPrice = 0;

        if ($_SERVER['REQUEST_METHOD'] === 'POST') {
            foreach ($products['prodotti'] as $product) {
                $productName = $product['nome'];

                if (isset($_POST['decrease' . $productName])) {
                    $_SESSION[$productName] = max(0, intval(controllaChiaveSessione($productName)) - 1);
                }

                if (isset($_POST['increase' . $productName])) {
                    $_SESSION[$productName] = intval(controllaChiaveSessione($productName)) + 1;
                }
            }
        }

        foreach ($products['prodotti'] as $product) {
            $productName = $product['nome'];
            $quantity = isset($_SESSION[$productName]) ? intval($_SESSION[$productName]) : 0;
            $totalPrice += $quantity * $product['prezzo'];

            echo '<tr>';
            echo '<td>';
            echo '<i class="' . $product['icon'] . '"></i> ';
            echo $product['nome'];
            echo '</td>';
            echo '<td>' . number_format((float)$product['prezzo'], 2, '.', '') . ' €</td>';
            echo '<td>';
            echo '<form method="post" action="">';
            echo '<div class="quantity-controls">';
            echo '<button type="submit" name="decrease' . $productName . '">-</button>';
            echo '<input type="number" class="quantity" name="' . $productName . '" value="' . $quantity . '" min="0" readonly>';
            echo '<button type="submit" name="increase' . $productName . '">+</button>';
            echo '</div>';
            echo '</form>';
            echo '</td>';
            echo '</tr>';
        }
        ?>
    </table>

    <div id="totalPrice">Prezzo Totale: <?php echo number_format($totalPrice, 2, '.', ''); ?>€</div>
    </br>
    <form method="post" action="php.php" target="_blank">
        <input type="hidden" name="ordine" value="1">
        <button type="submit">
            <h3>Invia Ordine<h3>
        </button>
    </form>

</body>

</html>