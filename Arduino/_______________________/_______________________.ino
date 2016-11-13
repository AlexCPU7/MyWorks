#include <dht.h>
#define dht_apin A0 // Analog Pin sensor is connected to
#include <LiquidCrystal.h>

LiquidCrystal lcd(8, 9, 4, 5, 6, 7);
dht DHT;
void setup() {
  Serial.begin(9600);
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 2);
  lcd.clear();
  // Print a message to the LCD.
  //lcd.print("hello, world!");
}

byte key(){
  // 1 - 719, 2 - 477, 3 - 131, 4 - 305, 5 - 0
  int val = analogRead(0);
  if (val < 50) return 5;
  else if (val < 150) return 3;
  else if (val < 350) return 4;
  else if (val < 500) return 2;
  else if (val < 800) return 1;
  else if (val < 1500) return 0;
}

void loop() {
  DHT.read11(dht_apin);
    lcd.setCursor(0, 0);
      lcd.print("anlogg = ");
      lcd.print(analogRead(0));
      /*lcd.print("Temperature");
      lcd.print(DHT.temperature); 
      lcd.println("C");*/
    lcd.setCursor(0, 1);
      /*lcd.print("Humidity=");
      lcd.print(DHT.humidity);
      lcd.print("%");*/
      switch (key()){
        case 1:
          lcd.print("Select");
          break;
         case 2:
          lcd.print("Left");
          break;
         case 3:
          lcd.print("Up");
          break;
         case 4:
          lcd.print("Down");
          break;
         case 5:
          lcd.print("Rigth");
          break;
      }
  delay(250);
  // set the cursor to column 0, line 1
  // (note: line 1 is the second row, since counting begins with 0):
  //lcd.setCursor(0, 1);
  // print the number of seconds since reset:

}

