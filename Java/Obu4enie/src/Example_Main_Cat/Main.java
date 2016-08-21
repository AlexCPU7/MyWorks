/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example_Main_Cat;

/**
 *
 * @author AlexC_000
 */
public class Main {
        public static void main(String[] arng){
        Cat cat = new Cat();
        cat.eat();
        cat.sleep(); 
        String May1 = cat.speak(": Мяу Мяу");
        System.out.println(May1);
    }
}
