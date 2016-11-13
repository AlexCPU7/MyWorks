long duration, cm;

void setup() {

pinMode(9, OUTPUT);
pinMode(8, INPUT);
Serial.begin(9600);
}

void loop() {
digitalWrite(9, LOW);
delayMicroseconds(2);
digitalWrite(9, HIGH);
delayMicroseconds(10);
digitalWrite(9, LOW);

duration=pulseIn(8, HIGH);
cm=duration/30/2;
Serial.print(cm);
Serial.print("CM");
Serial.println();
delay(500);

}
