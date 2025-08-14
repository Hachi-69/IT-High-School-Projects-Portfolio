<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tabella Fauna</title>
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
      height: 70px;
      font-size: 20px;
    }
  </style>
</head>

<body>
  <button class="inserisci" onclick="window.location.href = 'inserisci_riga_fauna.php';">Inserisci nuova riga</button>
  <table>
    <thead>
      <tr>
        <th class="sort-icon" onclick="sortTable('Nome')">Nome<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTableByGenderAndHealth(1)">Sesso<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTableByGenderAndHealth(2)">Stato Salute<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th>Aggiorna</th>
        <th>Elimina</th>
        <th>Informazioni</th>
      </tr>
    </thead>
    <tbody>
      <?php
      $servername = "localhost";
      $username = "root";
      $password = "";
      $dbname = "turilloparchinaturali";

      // Connessione al database
      $conn = mysqli_connect($servername, $username, $password, $dbname);

      if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
      }

      $query = "SELECT speciefauna.spf_dex, fauna.fau_id, fauna.fau_dex, fauna.fau_sesso, fauna.fau_stato_salute FROM fauna INNER JOIN speciefauna ON fauna.fk_spf_id = speciefauna.spf_id";
      $result = mysqli_query($conn, $query);

      if (mysqli_num_rows($result) > 0) {
        while ($row = mysqli_fetch_assoc($result)) {
          echo "<tr>";
          echo "<td>" . $row['fau_dex'] . "</td>";
          echo "<td>" . ($row['fau_sesso'] == "M" ? "Maschio" : "Femmina") . "</td>";
          echo "<td>" . ($row['fau_stato_salute'] == "S" ? "In Salute" : "Malato") . "</td>";
          echo "<td><button onclick=\"modificaRiga(" . $row['fau_id'] . ")\">Aggiorna</button></td>";
          echo "<td><button onclick=\"eliminaRiga(" . $row['fau_id'] . ")\">Elimina</button></td>";
          echo "<td><button onclick=\"visualizzaInformazioni(" . $row['fau_id'] . ")\">Informazioni</button></td>";
          echo "</tr>";
        }
      } else {
        echo "0 risultati";
      }

      mysqli_close($conn);
      ?>

    </tbody>
  </table>

  <script>
    function eliminaRiga(id) {
      if (confirm("Sei sicuro di voler eliminare questa riga?")) {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "elimina_riga_fauna.php", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.onreadystatechange = function() {
          if (xhr.readyState === 4 && xhr.status === 200) {
            location.reload();
          }
        };
        xhr.send("id=" + id);
      }
    }

    function visualizzaInformazioni(id) {
      window.location.href = 'informazioni_riga_fauna.php?id=' + id;
    }

    function modificaRiga(id) {
      window.location.href = 'modifica_riga_fauna.php?id=' + id;
    }

    function sortTable(columnName) {
      var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
      table = document.querySelector("table");
      switching = true;
      dir = "asc";
      while (switching) {
        switching = false;
        rows = table.getElementsByTagName("tr");
        for (i = 1; i < (rows.length - 1); i++) {
          shouldSwitch = false;
          x = rows[i].getElementsByTagName("td")[0];
          y = rows[i + 1].getElementsByTagName("td")[0];
          if (dir == "asc") {
            if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
              shouldSwitch = true;
              break;
            }
          } else if (dir == "desc") {
            if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
              shouldSwitch = true;
              break;
            }
          }
        }
        if (shouldSwitch) {
          rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
          switching = true;
          switchcount++;
        } else {
          if (switchcount == 0 && dir == "asc") {
            dir = "desc";
            switching = true;
          }
        }
      }
    }

    // Funzione per ordinare la tabella per sesso
    function sortTableByGenderAndHealth(index) {
      var table, rows, switching, i, x, y, shouldSwitch, dir, switchcount = 0;
      table = document.querySelector("table");
      switching = true;
      dir = "asc";
      while (switching) {
        switching = false;
        rows = table.getElementsByTagName("tr");
        for (i = 1; i < (rows.length - 1); i++) {
          shouldSwitch = false;
          x = rows[i].getElementsByTagName("td")[index]; // Indice per identificare la colonna
          y = rows[i + 1].getElementsByTagName("td")[index];
          if (dir == "asc") {
            if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
              shouldSwitch = true;
              break;
            }
          } else if (dir == "desc") {
            if (x.innerHTML.toLowerCase() < y.innerHTML.toLowerCase()) {
              shouldSwitch = true;
              break;
            }
          }
        }
        if (shouldSwitch) {
          rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
          switching = true;
          switchcount++;
        } else {
          if (switchcount == 0 && dir == "asc") {
            dir = "desc";
            switching = true;
          }
        }
      }
    }
  </script>

</body>

</html>