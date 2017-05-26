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
 * @author AlexCPU7
 */
public class Primer {
    
    public static void main(String[] args) {
       /* Pattern pt = Pattern.compile("(([a-z]){1,}([\\-]){0,1}([a-z]){1,}([\\.]){0,1})+" +
                "@(([a-z]){1,}([\\-]){0,1}([a-z]){1,})" +
                "(([\\.]){1}([a-z]){2,4})+");
        Matcher m = pt.matcher("name-email.one@gmail-name.com.ua");*/
       
       //сокращённый способ
       
       Pattern pt = Pattern.compile("\\W+([\\.-]?\\W+)*@\\W+([\\.-]?\\W+)*\\.\\W{2,4}");
       Matcher m =pt.matcher("name9@gmail.com");
        boolean prim = m.matches();
        
        System.out.println("prim = " + prim);
        
        /*
        \\W == [a-zA-Z0-9]    сокращает запись
        * - это +
        ? - или будет или нет
        */
    }
    
}
