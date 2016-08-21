 Дмитрий Осипов. http://www.youtube.com/user/d36073?feature=watch

v.01 Управляем Arduino с Web страницы Webserver Ethernet ENC28J60 Enternet HR911105A Pin ON OF Relays.

-----

Что нам понадобится:

1). ENC28J60 Ethernet LAN / Network Module.

http://www.ebay.com/sch/i.html?_from=R40&_sacat=0&_nkw=ENC28J60&rt=nc&LH_BIN=1

2). Библиотека / Library - "ethercard".

EtherCard is a driver for the ENC28J60 chip, compatible with Arduino IDE.

https://github.com/jcw/ethercard

или берем здесь. https://yadi.sk/d/R57sVoglbhTRN

3).

Скачать sketch.

v.01 Управляем Arduino с Web страницы Webserver Ethernet ENC28J60 Enternet HR911105A Pin ON OF Relays.

-----------------------

Подключаем Pins "ENC28J60 Module" к Arduino Uno.

VCC - 3.3V

GND - GND

SCK - Pin 13

SO - Pin 12

SI - Pin 11

CS - Pin 10 Можно выбрать любой.

Подключаем "ENC28J60 Module" например к Router, загружаем sketch, открываем страницу

в браузере например 192.168.1.222 , на странице можем включать выключат Pins / реле.

---------

Примечание: "ENC28J60 Module" питается от 3.3 volts, и потребляет по документации 250mA.

Arduino Uno Максимальный допустимый ток, получаемый с 3V3 контакта — 50 мА.

У меня прекрасно всё работает с 3V3 контакта Arduino Uno.

На всякий случай, предупреждаю.

------------------

*/

#include <EtherCard.h> // Подключаем скачанную библиотеку. https://yadi.sk/d/R57sVoglbhTRN

// MAC Address должен быть уникальным в вашей сети. Можно менять.

static byte mymac[] = {

0x5A,0x5A,0x5A,0x5A,0x5A,0x5A };

// ip статический / постоянный Address нашей Web страницы.

static byte myip[] = {

192,168,1,222 };

// Буфер, чем больше данных на Web странице, тем больше понадобится значения буфера.

byte Ethernet::buffer[900];

BufferFiller bfill;

// Массив задействованных номеров Pins Arduino, для управления например 8 реле.

int LedPins[] = {

2,3,4,5,6,7,8,9};

// Массив для фиксации изменений.

boolean PinStatus[] = {

1,2,3,4,5,6,7,8};

//-------------

const char http_OK[] PROGMEM =

"HTTP/1.0 200 OK\r\n"

"Content-Type: text/html\r\n"

"Pragma: no-cache\r\n\r\n";

const char http_Found[] PROGMEM =

"HTTP/1.0 302 Found\r\n"

"Location: /\r\n\r\n";

const char http_Unauthorized[] PROGMEM =

"HTTP/1.0 401 Unauthorized\r\n"

"Content-Type: text/html\r\n\r\n"

"<h1>401 Unauthorized</h1>";

//------------

// Делаем функцию для оформления нашей Web страницы.

void homePage()

{

bfill.emit_p(PSTR("$F"

"<title>ArduinoPIN Webserver</title>"

"ArduinoPIN 1: <a href=\"?ArduinoPIN1=$F\">$F</a><br />"

"ArduinoPIN 2: <a href=\"?ArduinoPIN2=$F\">$F</a><br />"

"ArduinoPIN 3: <a href=\"?ArduinoPIN3=$F\">$F</a><br />"

"ArduinoPIN 4: <a href=\"?ArduinoPIN4=$F\">$F</a><br />"

"ArduinoPIN 5: <a href=\"?ArduinoPIN5=$F\">$F</a><br />"

"ArduinoPIN 6: <a href=\"?ArduinoPIN6=$F\">$F</a><br />"

"ArduinoPIN 7: <a href=\"?ArduinoPIN7=$F\">$F</a><br />"

"ArduinoPIN 8: <a href=\"?ArduinoPIN8=$F\">$F</a>"),

http_OK,

PinStatus[1]?PSTR("off"):PSTR("on"),

PinStatus[1]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),

PinStatus[2]?PSTR("off"):PSTR("on"),

PinStatus[2]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),

PinStatus[3]?PSTR("off"):PSTR("on"),

PinStatus[3]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),

PinStatus[4]?PSTR("off"):PSTR("on"),

PinStatus[4]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),

PinStatus[5]?PSTR("off"):PSTR("on"),

PinStatus[5]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),

PinStatus[6]?PSTR("off"):PSTR("on"),

PinStatus[6]?PSTR("<font color=\"green\"><b>ON</b></font>"):PSTR("<font color=\"red\">OFF</font>"),
