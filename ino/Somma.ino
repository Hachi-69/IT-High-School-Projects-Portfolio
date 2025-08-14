#include <ESP8266WiFi.h>

#ifndef STASSID
#define STASSID "ESPtutu"
#define STAPSK "lucaturi"
#endif

const char* ssid = STASSID;
const char* password = STAPSK;

// Create an instance of the server
// specify the port to listen on as an argument
WiFiServer server(80);

void setup() {
  Serial.begin(115200);

  // prepare LED
  pinMode(LED_BUILTIN, OUTPUT);
  digitalWrite(LED_BUILTIN, LOW);

  // Set up Access Point
  WiFi.softAP(ssid, password);
  IPAddress myIP = WiFi.softAPIP();
  Serial.print("AP IP address: ");
  Serial.println(myIP);

  // Start the server
  server.begin();
  Serial.println(F("Server started"));

  // Print the IP address
  Serial.println(WiFi.softAPIP());
}
void loop() {
  // Check if a client has connected
  WiFiClient client = server.available();
  if (!client) { return; }
  Serial.println(F("new client"));

  client.setTimeout(5000);  // default is 1000

  // Read the first line of the request
  String req = client.readStringUntil('\r');
  Serial.println(F("request: "));
  Serial.println(req);

  // Match the request
  int val;
  if (req.indexOf(F("/gpio/0")) != -1) {
    val = 0;
  } else if (req.indexOf(F("/gpio/1")) != -1) {
    val = 1;
  } else {
    Serial.println(F("invalid request"));
    val = digitalRead(LED_BUILTIN);
  }

  // Set LED according to the request
  digitalWrite(LED_BUILTIN, val);

  // read/ignore the rest of the request
  // do not client.flush(): it is for output only, see below
  while (client.available()) {
    // byte by byte is not very efficient
    client.read();
  }

  // Send the response to the client
  client.print(F("HTTP/1.1 200 OK\r\n"));
  client.print(F("Content-Type: text/html\r\n"));
  client.print(F("\r\n"));
  client.print(F("<!DOCTYPE HTML>\r\n"));
  client.print(F("<html>\r\n"));
  client.print(F("<head>\r\n"));
  client.print(F("<style>\r\n"));
  client.print(F("body {\r\n"));
  client.print(F("  font-family: Arial, sans-serif;\r\n"));
  client.print(F("  background-color: #f4f4f4;\r\n"));
  client.print(F("  margin: 0;\r\n"));
  client.print(F("  padding: 0;\r\n"));
  client.print(F("}\r\n"));
  client.print(F(".container {\r\n"));
  client.print(F("  width: 50%;\r\n"));
  client.print(F("  margin: 50px auto;\r\n"));
  client.print(F("  background-color: #fff;\r\n"));
  client.print(F("  border-radius: 10px;\r\n"));
  client.print(F("  box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n"));
  client.print(F("  padding: 20px;\r\n"));
  client.print(F("}\r\n"));
  client.print(F(".form-group {\r\n"));
  client.print(F("  margin-bottom: 20px;\r\n"));
  client.print(F("}\r\n"));
  client.print(F(".input-group input {\r\n"));
  client.print(F("  width: calc(100% - 20px);\r\n"));
  client.print(F("  padding: 10px;\r\n"));
  client.print(F("  border: 1px solid #ccc;\r\n"));
  client.print(F("  border-radius: 5px;\r\n"));
  client.print(F("}\r\n"));
  client.print(F(".input-group input[type='submit'] {\r\n"));
  client.print(F("  background-color: #4CAF50;\r\n"));
  client.print(F("  color: white;\r\n"));
  client.print(F("  border: none;\r\n"));
  client.print(F("  cursor: pointer;\r\n"));
  client.print(F("}\r\n"));
  client.print(F("</style>\r\n"));
  client.print(F("</head>\r\n"));
  client.print(F("<body>\r\n"));
  client.print(F("<div class='container'>\r\n"));
  client.print(F("<h2>Calcolatrice Somma</h2>\r\n"));
  client.print(F("<form action='/sum' method='GET'>\r\n"));
  client.print(F("<div class='form-group'>\r\n"));
  client.print(F("<label for='addendo1'>Addendo 1:</label>\r\n"));
  client.print(F("<div class='input-group'>\r\n"));
  client.print(F("<input type='text' id='addendo1' name='addendo1' required>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("<div class='form-group'>\r\n"));
  client.print(F("<label for='addendo2'>Addendo 2:</label>\r\n"));
  client.print(F("<div class='input-group'>\r\n"));
  client.print(F("<input type='text' id='addendo2' name='addendo2' required>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("<div class='form-group'>\r\n"));
  client.print(F("<input type='submit' value='Calcola Somma'>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("</form>\r\n"));
  client.print(F("</div>\r\n"));
  client.print(F("</body>\r\n"));
  client.print(F("</html>\r\n"));

  // Check if the client requested the calculation of the sum
  if (req.indexOf("/sum") != -1) {
    // Parse parameters from the request
    int pos = req.indexOf("addendo1=") + 9;
    String addendo1 = req.substring(pos, req.indexOf("&", pos));
    pos = req.indexOf("addendo2=") + 9;
    String addendo2 = req.substring(pos, req.indexOf(" ", pos));

    // Convert parameters to integers and calculate sum
    int sum = addendo1.toInt() + addendo2.toInt();

    // Show result on the webpage
    client.print(F("<br><br>Risultato della somma: "));
    client.print(sum);
  }

  client.print(F("</html>"));

  // The client will actually be *flushed* then disconnected
  // when the function returns and 'client' object is destroyed (out-of-scope)
  // flush = ensure written data are received by the other side
  Serial.println(F("Disconnecting from client"));
}
