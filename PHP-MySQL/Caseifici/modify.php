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
    $dbname = "caseifici_gueturmaz";

    $conn = mysqli_connect($servername, $username, $password, $dbname);

    if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
    }

    $id = $_GET['id'];
    $query = "SELECT frm_csf_id, frm_id, frm_stagionatura, frm_prima_scelta
    FROM forme
    WHERE frm_id = '$id'";

    $result = mysqli_query($conn, $query);

    if (mysqli_num_rows($result) == 0) {
        echo "Riga non trovata nel database.";
        exit();
    }

    $row = mysqli_fetch_assoc($result);

    mysqli_close($conn);
    ?>


    <form method="post" action="save.php">

        <input type="hidden" name="frm_csf_id" value="<?php echo $row['frm_csf_id']; ?>">
        <input type="hidden" name="frm_id" value="<?php echo $row['frm_id']; ?>">

        <label for="frm_stagionatura">Mesi di stagionatura</label>
        <select name="frm_stagionatura">
            <option value="12" <?php echo ($row['frm_stagionatura'] == '12') ? 'selected' : ''; ?>>12</option>
            <option value="24" <?php echo ($row['frm_stagionatura'] == '24') ? 'selected' : ''; ?>>24</option>
            <option value="30" <?php echo ($row['frm_stagionatura'] == '30') ? 'selected' : ''; ?>>30</option>
            <option value="36" <?php echo ($row['frm_stagionatura'] == '36') ? 'selected' : ''; ?>>36</option>
        </select>
        <br>

        <label for="frm_prima_scelta">Prima scelta</label>
        <select name="frm_prima_scelta">
            <option value="1">prima scelta</option>
            <option value="0">non prima scelta</option>
            <br><br>
        </select>

        <input type="submit" value="Modifica">

    </form>
</body>