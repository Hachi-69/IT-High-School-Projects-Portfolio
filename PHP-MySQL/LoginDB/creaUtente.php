<?php
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $newUsername = $_POST['newUsername'];
    $newPassword = $_POST['newPassword'];
    $newPhoneNumber = $_POST['newPhoneNumber'];
    $newEmail = $_POST['newEmail'];

    $servername = "localhost";
    $dbusername = "root";
    $dbpassword = "";
    $dbname = "login";

    $conn = new mysqli($servername, $dbusername, $dbpassword, $dbname);

    if ($conn->connect_error) {
        die("Connection failed: " . $conn->connect_error);
    }

    $sql = "INSERT INTO login (log_id, log_username, log_password) 
            VALUES ('null', '$newUsername', '$newPassword')";

    if ($conn->query($sql) === TRUE) {
        echo "Nuovo utente creato con successo";

        echo '<script>
                setTimeout(function() {
                    window.location.href = "index.htm";
                }, 2000);
              </script>';
    } else {
        echo "Errore durante la creazione del nuovo utente: " . $conn->error;
    }

    $conn->close();
}
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Crea Utente</title>
    <style>
        @font-face {
            font-family: 'font';
            src: url('font.otf') format('opentype');
            font-weight: normal;
            font-style: normal;
        }

        body {
            background-color: #032217;
            color: #000000;
            text-align: center;
            margin: 0;
            padding: 0;
            font-family: 'font', Arial, sans-serif;
        }

        .login-container {
            max-width: 400px;
            margin: 100px auto;
            background-color: #FFB100;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border: 2px dashed white;
        }

        .login-container h1 {
            color: #000000;
        }

        .login-form {
            margin-top: 20px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group label {
            display: block;
            margin-bottom: 8px;
            color: #000000;
        }

        .form-group input {
            width: 100%;
            padding: 10px;
            box-sizing: border-box;
            border: 1px solid #343331;
            border-radius: 4px;
        }

        .form-group button {
            background-color: #343331;
            color: #FFB100;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .form-group button:hover {
            background-color: #9e6f00;
            color: #252525;
        }
    </style>
</head>

<body>
    <div class="login-container">
        <h1>Crea un nuovo utente</h1>
        <div class="login-form">
            <form method="post" action="">
                <div class="form-group">
                    <label for="newUsername">Username:</label>
                    <input type="text" name="newUsername" required>
                </div>
                <div class="form-group">
                    <label for="newPassword">Password:</label>
                    <input type="password" name="newPassword" required>
                </div>
                <div class="form-group">
                    <label for="newPhoneNumber">Numero di Telefono:</label>
                    <input type="text" name="newPhoneNumber" required>
                </div>
                <div class="form-group">
                    <label for="newEmail">Email:</label>
                    <input type="email" name="newEmail" required>
                </div>
                <div class="form-group">
                    <button type="submit">Crea Utente</button>
                </div>
            </form>
        </div>
    </div>
</body>

</html>