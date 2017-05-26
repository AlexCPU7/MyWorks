var n = 123;

console.log(typeof n); //тип переменной(литерал)
console.log(n);


var N = new Number(4000);
console.log(N.toFixed(2)); //2 символа после точки
console.log(N.toPrecision(2)); // 2 символа после точки на кругло

console.log(0.2 + 0.1);
var a = 0.2;
var b = 0.1;
var rez = a + b;
console.log(rez);

var S = new Number(0.2);
var D = new Number(0.1);
console.log(S + D);
console.log(S.toFixed(2) + D.toFixed(2));
console.log("===================================");

console.log("Hello".length);  //длинна строки

var s = "Status";
console.log(s.charAt(2)); //вывод номера строкиы
console.log(s[2]); //вывод номера строкиы
console.log(s.charAt(s.length - 1)); //выводим последний символ
console.log(s.substring(3)); //выводм строку пропуская первые 3 символа
console.log(s.substring(3,5));  //вывод от начального симвода, до конечного
console.log(s.substr(2,3));   //выводит начало, сколько символов вывести
console.log(s.slice(-3));  //выводим последние 3 символа
console.log(s.indexOf("t")); //говорит какой номер имеет буква
console.log(s.lastIndexOf("t")); //тожесамое, только с конца
console.log(s.replace("us","IZMEN")); //находит символ и изменяет его
console.log(s.split(" ")); //разбивает строку на массив
console.log("===================================");

console.log("555");
console.log(typeof(Number("555")));
console.log(444);
console.log(typeof(String(444)));
console.log(Boolean(1));
console.log(typeof(Boolean(1)));

console.log("==Условный оператор=================================");

var x = 20;
var text = x > 15 ? "Истина" : "Ложь";
console.log(text);
//тоже самое, что и if

console.log("==Функции=================================");

function fun(name){
    return "My name " + name;
}
console.log(fun("Alex"));

var fun1 = function(mane1){
    //console.log(arguments); //передаёт оставшиеся параметры
    return "My name " + name1;
};
console.log(fun("Alex1", 21, 22, 23));

var func = function() {
    var i = 10;
    console.log(i);
    var innerFunc = function() {
        var i = 15;
        console.log(i);
    };
    innerFunc();
};
func();
