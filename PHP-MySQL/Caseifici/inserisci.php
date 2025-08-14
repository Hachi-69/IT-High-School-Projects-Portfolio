<?php
// Verifica se sono stati passati degli ID come parametri di query
if (isset($_GET['ids']) && is_string($_GET['ids'])) {
    $cliente_id = isset($_GET['cliente_id']) ? intval($_GET['cliente_id']) : null;
    $ids = explode(',', $_GET['ids']);
    $formeSelezionate = extractIntegers(implode(',', $ids)); // Make sure it's a string
    $conn = mysqli_connect("localhost", "root", "", "caseifici_gueturmaz");
    if (!$conn) {
        die("Connessione fallita: " . mysqli_connect_error());
    }
    if (!empty($formeSelezionate)) {
        // Itera sulle forme selezionate e aggiorna il campo frm_cln_id
        foreach ($formeSelezionate as $forma_id) {
            $query_insert = "UPDATE forme SET frm_cln_id = $cliente_id WHERE frm_id = $forma_id";
            $result_insert = mysqli_query($conn, $query_insert);
            if (!$result_insert) {
                echo "<p>Errore durante l'aggiunta del cliente alla forma con ID $forma_id: " . mysqli_error($conn) . "</p>";
            }
        }
        // Verifica se ci sono errori durante l'aggiornamento
        if (!mysqli_error($conn)) {
            header("location: ./tabella_attivita_giornaliere.php?caseificio=" . $_GET["frm_csf_id"]);
        }
    } else {
        echo "<p>Nessuna forma selezionata.</p>";
    }
} else {
    echo "<p>Nessuna forma selezionata.</p>";
}
mysqli_close($conn);
function extractIntegers($string)
{
    preg_match_all('/\d+/', $string, $matches);
    return array_map('intval', $matches[0]);
}
?>