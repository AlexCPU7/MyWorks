/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegulViri;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * Алгоритм: регулярное выражения
 */
public class Algorinm {

    public static void main(String[] args) {
        Pattern pt = Pattern.compile("([a-zA-Z0-9&&[^f]]){1,5}([\\s]){1,10}([a-zA-Z0-9]){1,5}([\\.]){0,1}");  //проверяет естли в строке любой символ от а до z
        Matcher m = pt.matcher("ssd1  df.");            //это строка, сам текст над которым совершается проверка
        boolean ft = m.matches();               //выводит верно или не верно
        
        System.out.println("ft = " + ft);
    }
}
/*
{0,10} {3} ограничения по симвалам
{0,10} - минимальное значение строки и максимальное
{3} - точное значение строки
{0,} - от 0 до бесконечности 

&&[^f] - логическое и входят все кроме f
^ - обозначает "не" в регулярных выражениях 

[\\s] - в конце должен быть 1 пробел
([\\s]){1,10} - в конце должен быть минимум 1 максимум 10 пробелов

([\\.]){0,1} - должна быть точка 1 раз ли не должна быть(0)
([\\.-]){1} - точка или тире идёт 1 раз
([A-Z]){1}([a-z]){1,} - говорит о том, что 1 буква слова будет бязательно с большой буквы, потом буквы идут с маленькой сколько угодно раз

(всё условие)+   - может повториться сколько угодно раз
*/