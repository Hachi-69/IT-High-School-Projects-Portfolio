<?php
// umidita
$risorsaum = "http://10.205.3.5:8081/API4API/webresources/RealtimeDatas/?valueType=humidity&sensorType=SHT12";
//$risorsaum = "http://moodle2.franchettisalviani.it:8081/API4API/webresources/RealtimeDatas/?valueType=humidity&sensorType=SHT12";
$curlSESum = curl_init();
curl_setopt($curlSESum, CURLOPT_URL, $risorsaum);
curl_setopt($curlSESum, CURLOPT_RETURNTRANSFER, true);
curl_setopt($curlSESum, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($curlSESum, CURLOPT_USERAGENT, 'php client User-Agent');
curl_setopt($curlSESum, CURLOPT_FOLLOWLOCATION, true);
$resultum = curl_exec($curlSESum);
if ($resultum === false) {
    echo "Error Number:" . curl_errno($curlSESum) . "<br>";
    echo "Error String:" . curl_error($curlSESum);
}
curl_close($curlSESum);
$arrayum = json_decode($resultum, true);

//temperatura
$risorsatmp = "http://10.205.3.5:8081/API4API/webresources/RealtimeDatas/?valueType=temperature&sensorType=SHT12";
//$risorsatmp = "http://moodle2.franchettisalviani.it:8081/API4API/webresources/RealtimeDatas/?valueType=temperature&sensorType=SHT12";
$curlSEStmp = curl_init();
curl_setopt($curlSEStmp, CURLOPT_URL, $risorsatmp);
curl_setopt($curlSEStmp, CURLOPT_RETURNTRANSFER, true);
curl_setopt($curlSEStmp, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($curlSEStmp, CURLOPT_USERAGENT, 'php client User-Agent');
curl_setopt($curlSEStmp, CURLOPT_FOLLOWLOCATION, true);
$resulttmp = curl_exec($curlSEStmp);
if ($resulttmp === false) {
    echo "Error Number:" . curl_errno($curlSEStmp) . "<br>";
    echo "Error String:" . curl_error($curlSEStmp);
}
curl_close($curlSEStmp);
$arraytmp = json_decode($resulttmp, true);

//peso
$risorsaps = "http://10.205.3.5:8081/API4API/webresources/RealtimeDatas/?valueType=weigth";
//$risorsaps = "http://moodle2.franchettisalviani.it:8081/API4API/webresources/RealtimeDatas/?valueType=weigth";
$curlSESps = curl_init();
curl_setopt($curlSESps, CURLOPT_URL, $risorsaps);
curl_setopt($curlSESps, CURLOPT_RETURNTRANSFER, true);
curl_setopt($curlSESps, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($curlSESps, CURLOPT_USERAGENT, 'php client User-Agent');
curl_setopt($curlSESps, CURLOPT_FOLLOWLOCATION, true);
$resultps = curl_exec($curlSESps);
if ($resultps === false) {
    echo "Error Number:" . curl_errno($curlSESps) . "<br>";
    echo "Error String:" . curl_error($curlSESps);
}
curl_close($curlSESps);
$arrayps = json_decode($resultps, true);

//frequenza rilevata
$risorsafq = "http://10.205.3.5:8081/API4API/webresources/RealtimeDatas/?sensorType=INMP441&valueType=MajorPeakFrequency";
//$risorsafq = "http://moodle2.franchettisalviani.it:8081/API4API/webresources/RealtimeDatas/?sensorType=INMP441&valueType=MajorPeakFrequency";
$curlSESfq = curl_init();
curl_setopt($curlSESfq, CURLOPT_URL, $risorsafq);
curl_setopt($curlSESfq, CURLOPT_RETURNTRANSFER, true);
curl_setopt($curlSESfq, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($curlSESfq, CURLOPT_USERAGENT, 'php client User-Agent');
curl_setopt($curlSESfq, CURLOPT_FOLLOWLOCATION, true);
$resultfq = curl_exec($curlSESfq);
if ($resultfq === false) {
    echo "Error Number:" . curl_errno($curlSESfq) . "<br>";
    echo "Error String:" . curl_error($curlSESfq);
}
curl_close($curlSESfq);
$arrayfq = json_decode($resultfq, true);

//intensita del suono
$risorsains = "http://10.205.3.5:8081/API4API/webresources/RealtimeDatas/?sensorType=INMP441&valueType=MajorPeakGain";
//$risorsains = "http://moodle2.franchettisalviani.it:8081/API4API/webresources/RealtimeDatas/?sensorType=INMP441&valueType=MajorPeakGain";
$curlSESins = curl_init();
curl_setopt($curlSESins, CURLOPT_URL, $risorsains);
curl_setopt($curlSESins, CURLOPT_RETURNTRANSFER, true);
curl_setopt($curlSESins, CURLOPT_CUSTOMREQUEST, "GET");
curl_setopt($curlSESins, CURLOPT_USERAGENT, 'php client User-Agent');
curl_setopt($curlSESins, CURLOPT_FOLLOWLOCATION, true);
$resultins = curl_exec($curlSESins);
if ($resultins === false) {
    echo "Error Number:" . curl_errno($curlSESins) . "<br>";
    echo "Error String:" . curl_error($curlSESins);
}
curl_close($curlSESins);
$arrayins = json_decode($resultins, true);
?>

<!DOCTYPE html>
<html>

<head>
    <title>Controllo Arnia</title>
    <link rel="icon" href="ico.ico">
    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script>
        google.charts.load('current', {
            'packages': ['corechart']
        });
        google.charts.setOnLoadCallback(drawChart);

        function drawChart() {
            var data = new google.visualization.DataTable();
            data.addColumn('datetime', 'Data');
            data.addColumn('number', 'Umidita %');
            data.addColumn('number', 'Temperatura C°');
            data.addColumn('number', 'Peso KG');
            data.addColumn('number', 'Frequenza Rilevata');
            data.addColumn('number', 'Intensita Suono');
            // data.addColumn('number', 'Limite Umidità %');

            var listUm = <?php echo $resultum; ?>;
            var listTmp = <?php echo $resulttmp; ?>;
            var listPs = <?php echo $resultps; ?>;
            var listFq = <?php echo $resultfq; ?>;
            var listIns = <?php echo $resultins; ?>;

            var um = document.getElementById("umidita").checked;
            var tmp = document.getElementById("temperatura").checked;
            var ps = document.getElementById("peso").checked;
            var fq = document.getElementById("frequenza").checked;
            var ins = document.getElementById("suono").checked;
            var limUm = document.getElementById("rangeum").value;

            document.getElementById('log').innerHTML = " umidita: " + listUm.length + " temperatura: " + listTmp.length + " peso: " +
                listPs.length + " frequenza: " + listFq.length + " suono: " + listIns.length;

            var i = 127;
            while (true) {
                try {
                    data.addRow([new Date(listPs[listPs.length - i].timestampUtc), (um ? listUm[listUm.length - i].value : null), (tmp ? listTmp[listTmp.length - i].value : null),
                        (ps ? listPs[listPs.length - i].value : null), (fq ? listFq[listFq.length - i].value : null), (ins ? listIns[listIns - i].value : null)
                    ]);
                } catch (error) {
                    document.getElementById('log').innerHTML += " i: " + i;
                    break;
                }
                i--;
            }

            options = {
                title: 'Previsioni meteo, Arnia',
                curveType: 'function',
                legend: "none",
                pointSize: 5,
                series: {
                    0: {
                        pointShape: 'circle',
                        color: "blue"
                    },
                    1: {
                        pointShape: 'circle',
                        color: "red"
                    },
                    2: {
                        pointShape: 'circle',
                        color: "orange"
                    },
                    3: {
                        pointShape: 'circle',
                        color: "green"
                    },
                    4: {
                        pointShape: 'circle',
                        color: "purple"
                    },
                    5: {
                        pointShape: 'circle',
                        color: "black"
                    }
                },
                vAxis: {
                    viewWindow: {
                        max: document.getElementById("range").value,
                        min: document.getElementById("range").value - 100
                    }
                }
            };

            var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));
            chart.draw(data, options);

        }
    </script>
    <style>
        #curve_chart {
            position: absolute;
            z-index: 0;
            left: 200px;
        }

        .cb {
            position: absolute;
            z-index: 1;
            top: 150px;
            left: 100px;
        }

        .slidecontainer {
            position: absolute;
            z-index: 1;
            top: 300px;
            left: 100px;
        }

        .impLimiti {
            position: absolute;
            z-index: 1;
            left: 85%;
            top: 150px;
        }
    </style>
</head>

<body>
    <div id="log"></div>
    <div id="curve_chart" style="width: 80%; height: 700px; top: 10%"></div>
    <div class="cb">
        <a><b>Modifiche grafico:</b></a><br>
        <input type="checkbox" id="umidita" name="umidita" value="umidita" onclick="drawChart()">
        <label style="color: blue;" for="umidita"> Umidità</label><br>

        <input type="checkbox" id="temperatura" name="temperatura" value="temperatura" onclick="drawChart()">
        <label style="color: red;" for="temperatura"> Temperatura</label><br>

        <input type="checkbox" id="peso" name="peso" value="peso" onclick="drawChart()">
        <label style="color: orange;" for=" peso"> Peso</label><br>

        <input type="checkbox" id="frequenza" name="frequenza" value="frequenza" onclick="drawChart()">
        <label style="color: green;" for=" frequenza"> Frequenza</label><br>

        <input type="checkbox" id="suono" name="suono" value="suono" onclick="drawChart()">
        <label style="color: purple;" for=" suono"> Suono</label><br>
    </div>
    <div class="slidecontainer">
        <a> <b>Scala:</b></a> <br>
        <input type="range" min="0" max="150" value="80" class="slider" id="range" onmousemove="drawChart()">
    </div>
    <div class="impLimiti">
        <a><b>Impostazione Limiti:</b></a><br><br>
        <a>Limite Umidità:</a> <br>
        <input type="range" min="0" max="150" value="10" class="slider" id="rangeum" onmousemove="drawChart()"><br><br>

        <a>Limite Temperatura:</a> <br>
        <input type="range" min="0" max="40" value="20" class="slider" id="rangetmp" onmousemove="drawChart()"><br><br>

        <a>Limite Pressione:</a> <br>
        <input type="range" min="0" max="2" value="2" class="slider" id="rangeprs" onmousemove="drawChart()">
    </div>
</body>

</html>