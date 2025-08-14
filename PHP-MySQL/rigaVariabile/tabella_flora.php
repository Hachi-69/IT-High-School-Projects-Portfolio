<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Tabella Flora</title>
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
  <button class="inserisci" onclick="window.location.href = 'inserisci_riga_flora.php';">Inserisci nuova riga</button>
  <table>
    <thead>
      <tr>
        <th class="sort-icon" onclick="sortTable('Nome')">Nome<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTableByStagioneFioritura(1)">Stagione Fioritura<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTable('Nome')">Specie<span class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
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

      $query = "SELECT flora.flo_dex, flora.flo_stag_fiori, specieflora.spo_dex, flora.flo_id FROM flora INNER JOIN specieflora ON flora.fk_spo_id = specieflora.spo_id";
      $result = mysqli_query($conn, $query);

      if (mysqli_num_rows($result) > 0) {
        while ($row = mysqli_fetch_assoc($result)) {
          echo "<tr>";
          echo "<td>" . $row['flo_dex'] . "</td>";
          echo "<td>" . $row['flo_stag_fiori'] . "</td>";
          echo "<td>" . $row['spo_dex'] . "</td>";
          echo "<td><button onclick=\"modificaRiga(" . $row['flo_id'] . ")\">Aggiorna</button></td>";
          echo "<td><button onclick=\"eliminaRiga(" . $row['flo_id'] . ")\">Elimina</button></td>";
          echo "<td><button onclick=\"visualizzaInformazioni(" . $row['flo_id'] . ")\">Informazioni</button></td>";
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
        xhr.open("POST", "elimina_riga_flora.php", true);
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
      window.location.href = 'informazioni_riga_flora.php?id=' + id;
    }

    function modificaRiga(id) {
      window.location.href = 'modifica_riga_flora.php?id=' + id;
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

    // Funzione per ordinare la tabella per stagione di fioritura
    function sortTableByStagioneFioritura(index) {
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