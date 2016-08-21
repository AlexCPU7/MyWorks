long duration, cm;

void setup() {

pinMode(3, OUTPUT);
pinMode(4, INPUT);
Serial.begin(9600);
}

void loop() {
digitalWrite(3, LOW);
delayMicroseconds(2);
digitalWrite(3, HIGH);
delayMicroseconds(10);
digitalWrite(3, LOW);

duration=pulseIn(4, HIGH);
cm=duration/30/2;
Serial.print("Растояние = ");
Serial.print(cm);
Serial.print("СM");
Serial.println();
delay(100);

}
