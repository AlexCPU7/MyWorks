//Мигающий светоиод на плате
/*

Первая программа на Ардуино

*/
int led = 13;

void setup() {

pinMode(led, OUTPUT);

}

void loop() {

digitalWrite(led, HIGH);

delay(500);

digitalWrite(led, LOW);

delay(500);
}




