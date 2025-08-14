<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>GUERTURMAZ</title>
  <style>
    /* Stile per l'immagine */
    .map-image {
      width: 400px;
      /* Imposta la larghezza desiderata */
      height: auto;
      /* Imposta l'altezza in base alla larghezza */
      position: absolute;
      /* Posiziona l'immagine in modo assoluto */
      top: 175px;
      /* Distanza dal bordo superiore */
      left: 70px;
      /* Distanza dal bordo sinistro */
      cursor: pointer;
      /* Cambia il cursore al passaggio sopra l'immagine */
      object-fit: cover;
      border: 2px dashed white !important;
    }

    .map-image:hover {
      transition: transform 0.3s ease;
      transform: scale(1.1);
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
      background-color: #032217;
      height: 70vh;
      top: 1130px;
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
      height: 90px;
      font-size: 20px;
      position: absolute;
      top: 73px;
      left: 900px;
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

<body>
  <!-- Rettangolo in cima alla pagina con il pulsante "Torna Indietro" -->
  <div class="header-container">
    <img src="maps.jpg" alt="Apri Google Maps" class="map-image" id="map-trigger">
    <a class="nome">GUETURMAZ</a>
    <button class="back-button" onclick="window.location.href = 'choose_table.php';">Torna Indietro</button>
  </div>

  <!-- Rettangolo verticale a sinistra -->
  <div class="left-container"></div>

  <button class="inserisci"
    onclick="window.location.href = 'inserisci_attivita_giornaliera.php?caseificio=<?php echo $_GET['caseificio']; ?>';">Attività
    giornaliera</button>

  <button class="inserisci2" onclick="vendiForme()"> Vendi </button>

  <table>
    <thead>
      <tr>
        <th class="checkbox-column"></th>
        <th class="sort-icon" onclick="sortTable('frm_stagionatura')">Stagionatura<span class="asc">&#9650;</span><span
            class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTable('frm_prima_scelta')">Prima scelta<span class="asc">&#9650;</span><span
            class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTable('frm_data_produzione')">Data Produzione<span
            class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th class="sort-icon" onclick="sortTable('frm_progressivo_mese')">Progressivo Mese<span
            class="asc">&#9650;</span><span class="desc">&#9660;</span></th>
        <th colspan=3>Operazioni</th> <!-- Nuova colonna per i pulsanti -->
      </tr>
    </thead>
    <tbody>


      <?php
      // Connessione al database
      $conn = mysqli_connect("localhost", "root", "", "caseifici_gueturmaz");

      if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
      }

      // Query SQL per selezionare i dati dalla tabella forme
      $frm_csf_id = $_GET['caseificio'];
      $query = "SELECT frm_cln_id, frm_id, frm_stagionatura, frm_prima_scelta, frm_data_produzione, frm_progressivo_mese FROM forme WHERE frm_csf_id = $frm_csf_id  ";

      $result = mysqli_query($conn, $query);

      if (mysqli_num_rows($result) > 0) {
        while ($row = mysqli_fetch_assoc($result)) {
          echo "<tr>";
          // Checkbox nella prima colonna
          if($row["frm_cln_id"] === NULL){
            echo "<td><input type='checkbox' onclick='highlightRow(this)' data-id='" . $row['frm_id'] . "'></td>";
          }else{
            echo "<td></td>";
          }
          echo "<td>" . $row['frm_stagionatura'] . "</td>";
          echo "<td>" . ($row['frm_prima_scelta'] ? 'Sì' : 'No') . "</td>";
          echo "<td>" . $row['frm_data_produzione'] . "</td>";
          echo "<td>" . $row['frm_progressivo_mese'] . "</td>";
          // Pulsanti per le operazioni
          echo "<td><button onclick=\"eliminaRiga(" . $row['frm_id'] . ")\">ELIMINA</button></td>";
          echo "<td><button onclick=\"modificaRiga(" . $row['frm_id'] . ")\">MODIFICA</button></td>";
          echo "<td><button onclick=\"visualizzaInformazioni(" . $row['frm_id'] . ")\">DETTAGLI</button></td>";
          echo "</td>";
          echo "</tr>";
        }
      } else {
        echo "<tr><td colspan='6'>Nessuna forma trovata.</td></tr>";
      }
      ?>


    </tbody>
  </table>

  <script>

    function visualizzaInformazioni(id) {
      window.location.href = 'details.php?id=' + id;
    }

    function modificaRiga(id) {
      window.location.href = 'modify.php?id=' + id;
    }

    function eliminaRiga(id) {
      if (confirm("Sei sicuro di voler eliminare questa riga?")) {
        var xhr = new XMLHttpRequest();
        xhr.open("POST", "delete_row.php", true);
        xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        xhr.onreadystatechange = function () {
          if (xhr.readyState === 4 && xhr.status === 200) {
            location.reload();
          }
        };
        xhr.send("id=" + id);
      }
    }


    function highlightRow(checkbox) {
      var row = checkbox.parentNode.parentNode; // Ottieni la riga padre della checkbox
      if (checkbox.checked) {
        row.classList.add('selected-row'); // Aggiungi la classe per l'evidenziazione
      } else {
        row.classList.remove('selected-row'); // Rimuovi la classe per l'evidenziazione
      }
    }

    // Funzione per vendere le forme selezionate
    function vendiForme() {
      var formeSelezionate = []; // Array per memorizzare gli ID delle forme selezionate

      // Ottieni tutte le checkbox selezionate nella tabella
      var checkboxes = document.querySelectorAll('input[type="checkbox"]:checked');

      // Itera su ogni checkbox selezionata
      checkboxes.forEach(function (checkbox) {
        // Ottieni l'ID della forma dalla riga corrispondente
        var id = checkbox.dataset.id;
        formeSelezionate.push(id); // Aggiungi l'ID all'array delle forme selezionate
      });

      // Invia l'array degli ID delle forme a un'altra pagina PHP
      window.location.href = 'vendita.php?ids=' + JSON.stringify(formeSelezionate);
    }
  </script>

  <script>
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



    // Funzione per generare una posizione casuale nei confini della città italiana
    function openRandomLocationInItalianCity() {
      // Array di coordinate per le città italiane
      var italianCities = {
        "Rome": {
          "lat": 41.9028,
          "lng": 12.4964
        },
        "Milan": {
          "lat": 45.4642,
          "lng": 9.1900
        },
        "Naples": {
          "lat": 40.8518,
          "lng": 14.2681
        },
        "Florence": {
          "lat": 43.7696,
          "lng": 11.2558
        },
        "Palermo": {
          "lat": 38.1157,
          "lng": 13.3615
        },
        "Bologna": {
          "lat": 44.4949,
          "lng": 11.3426
        },
        "Castello": {
          "lat": 43.4655,
          "lng": 12.2289
        }, // Castello (PG)
        "Pieve Santo Stefano": {
          "lat": 43.5752,
          "lng": 11.9716
        }, // Pieve Santo Stefano (AR)
        // Aggiungi altre città italiane qui
      };

      // Seleziona una città in modo casuale
      var cities = Object.keys(italianCities);
      var randomCity = cities[Math.floor(Math.random() * cities.length)];
      var cityCoordinates = italianCities[randomCity];

      // Genera una posizione casuale all'interno dei confini della città
      var radiusInDegrees = 0.05; // Modifica a seconda delle dimensioni della città
      var randomLat = cityCoordinates.lat + (Math.random() * (radiusInDegrees * 2) - radiusInDegrees);
      var randomLng = cityCoordinates.lng + (Math.random() * (radiusInDegrees * 2) - radiusInDegrees);

      // Costruisci l'URL per aprire Google Maps con la posizione casuale
      var mapsUrl = "https://www.google.com/maps/search/?api=1&query=" + randomLat + "," + randomLng;

      // Apri Google Maps nella posizione casuale
      window.open(mapsUrl, "_blank");
    }

    // Aggiungi un gestore di eventi per il clic sull'immagine
    document.getElementById("map-trigger").addEventListener("click", openRandomLocationInItalianCity);
  </script>
</body>

</html>