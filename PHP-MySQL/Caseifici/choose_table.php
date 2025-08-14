<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Seleziona Caseificio</title>
  <style>
    /* Stili per l'immagine di sfondo */
    .background-image {
      position: fixed;
      top: 0;
      left: 0;
      width: 100%;
      height: 100%;
      z-index: 2;
      /* Assicura che l'immagine sia dietro a tutto */
      pointer-events: none;
      /* Assicura che l'immagine non sia cliccabile */
    }

    /* Stili per i pulsanti */
    .button-container {
      display: grid;
      grid-template-columns: repeat(6, 1fr);
      grid-gap: 10px;
      justify-content: center;
      z-index: 1;
      /* Assicura che i pulsanti siano sopra all'immagine */
      position: relative;
      /* Per consentire il posizionamento relativo dei pulsanti */
    }

    .button-container a {
      margin: 10px;
    }

    .button-container button {
      background-color: #343331;
      color: #ffb100;
      padding: 0;
      border: none;
      cursor: pointer;
      border-radius: 10px;
      font-family: "font", Arial, sans-serif;
      width: 200px;
      height: 200px;
      overflow: hidden;
      transition: transform 0.3s ease;
      border: 2px dashed white;
    }

    .button-container button img {
      width: 100%;
      height: 100%;
      object-fit: cover;
    }

    .button-container button:hover {
      transform: scale(1.1);
    }

    .button-container button:hover img {
      transition: transform 0.3s ease;
      transform: scale(1.1);
    }

    /* Stili per il corpo della pagina */
    body {
      font-family: Arial, sans-serif;
      text-align: center;
      color: #ffb100;
      border-radius: 5px;
      font-size: 30px;
    }

    /* Stili per i link */
    a {
      text-decoration: none;
      color: inherit;
    }

    /* Spazio alla fine della pagina per la storia */
    .footer {
      margin-top: 50px;
      text-align: left;
      padding: 20px;
      background-color: rgba(0, 0, 0, 0.7);
      z-index: 1;
      /* Assicura che il testo della storia sia sopra all'immagine */
      position: relative;
      /* Per consentire il posizionamento relativo del testo */
    }

    .testo {
      color: black;
      z-index: 20;
      font-family: "font", Arial, sans-serif;
      opacity: 0.7;
    }

    @font-face {
      font-family: "font";
      src: url("font.otf") format("opentype");
      font-weight: normal;
      font-style: normal;
    }

    .back-button {
      background-color: #ffb100;
      color: #343331;
      border-radius: 5px;
      font-size: 16px;
      cursor: pointer;
      float: right;
      margin-top: -3px;
      z-index: 1;
      position: fixed;
      font-family: "font", Arial, sans-serif;
      width: 70px;
      height: 70px;
      left: 1800px;
      top: 160px;
    }
  </style>
</head>

<body>
  <!-- Immagine di sfondo posizionata in cima allo schermo -->
  <img class="background-image" src="sfondo.png" alt="Background Image" />

  <!-- Contenuto della pagina -->
  <div><br /><br /><br /><br /><br /><br /></div>
  <div>
    <button class="back-button" onclick="window.location.href = 'index.htm';">
      Torna Indietro
    </button>
  </div>
  <h2 class="testo">SCEGLI CASEIFICIO</h2>
  <div><br /></div>
  <div class="button-container">
    <?php
    // Array di nomi delle immagini
    $imageNames = array(
      "caseifici (1).jpg", "caseifici (2).jpg", "caseifici (3).jpg", "caseifici (4).jpg", "caseifici (5).jpg",
      "caseifici (6).jpg", "caseifici (7).jpg", "caseifici (8).jpg", "caseifici (9).jpg", "caseifici (10).jpg",
      "caseifici (11).jpg", "caseifici (12).jpg", "caseifici (13).jpg", "caseifici (14).jpg", "caseifici (15).jpg",
      "caseifici (16).jpg", "caseifici (17).jpg", "caseifici (18).jpg", "caseifici (19).jpg", "caseifici (20).jpg",
      "caseifici (21).jpg", "caseifici (22).jpg", "caseifici (23).jpg", "caseifici (24).jpg", "caseifici (25).jpg",
      "caseifici (26).jpg", "caseifici (27).jpg", "caseifici (28).jpg", "caseifici (29).jpg", "caseifici (30).jpg"
    );

    // Loop attraverso gli array di nomi delle immagini
    foreach ($imageNames as $index => $imageName) {
      // Costruisci l'URL della pagina di destinazione con la variabile nella query string
      $urlPaginaDestinazione = "tabella_attivita_giornaliere.php?caseificio=" . ($index + 1);
      echo '<a href="' . $urlPaginaDestinazione . '"><button><img src="' . $imageName . '" alt="Caseificio ' . ($index + 1) . '"></button></a>';
    }
    ?>
  </div>
  <div class="footer">
    <h2>La Storia del Consorzio Gueturmaz</h2>
    <p>
      Il Consorzio Guerturmaz nasce nel cuore delle meravigliose vallate
      alpine, un territorio ricco di tradizioni e di antiche conoscenze legate
      alla produzione casearia. Fondata nel 1950 da un gruppo di piccoli
      caseifici locali desiderosi di preservare e valorizzare le antiche
      tecniche di lavorazione del latte, l'associazione ha rappresentato da
      subito un punto di riferimento per la comunità casearia della regione.
      <br />
      Attraverso il passare degli anni, il Consorzio Guerturmaz si è evoluto,
      abbracciando nuove tecnologie e pratiche sostenibili, pur mantenendo
      salda la sua identità radicata nella tradizione. La collaborazione tra i
      vari caseifici consorziati ha permesso di sviluppare una gamma
      diversificata di prodotti caseari di alta qualità, apprezzati sia a
      livello locale che internazionale.
      <br />
      La filosofia del consorzio si basa sull'amore per la terra e per le sue
      risorse, sull'impegno per la sostenibilità ambientale e sul sostegno
      alle comunità locali. Ogni membro del consorzio condivide l'obiettivo
      comune di garantire la produzione di formaggi e latticini genuini e di
      eccellente qualità, rispettando al contempo l'ambiente e promuovendo il
      benessere degli animali.
      <br />
      Oggi, il Consorzio Guerturmaz continua a prosperare, mantenendo salde le
      sue radici e guardando fiducioso al futuro, consapevole del suo ruolo
      centrale nell'economia e nella cultura della regione alpina.
    </p>
  </div>
</body>

</html>