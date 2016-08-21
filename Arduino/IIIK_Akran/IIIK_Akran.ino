#include <dht.h>
#define dht_apin A0
#include <LiquidCrystal.h>

LiquidCrystal lcd(8, 9, 4, 5, 6, 7);

dht DHT;

void setup() {
  lcd.begin(16, 2);
  lcd.clear();
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
      lcd.clear();
      //lcd.print("anlog = ");
      //lcd.print(analogRead(0));
      lcd.print("V komnate ");
      lcd.print(DHT.temperature); 
      lcd.print("C");
      
  lcd.setCursor(0, 1);
  //lcd.print(" :( :) :0 :o");
     switch (key()){
        case 1:
          lcd.print("Select");
          break;
         case 2:
          lcd.print("DDaanneekk lox");
          break;
         case 3:
          lcd.print(":D");
          break;
         case 4:
          lcd.print(":{");
          break;
         case 5:
          lcd.print("Vlazhnost=");
          lcd.print(DHT.humidity);
          lcd.print("%");
          break;
      }
      
  delay(250);
}

