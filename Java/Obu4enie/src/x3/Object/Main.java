/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x3.Object;

/**
 *
 * @author AlexCPU7
 */
public class Main {
    
    //Экземпляр класса
    static Cat cat = new Cat();
    static People people = new People();
    
    public static void main(String[] args){
        
        cat.name = "JoJo";
        cat.ago = 5;
        cat.poroda = "X3";
        System.out.println(cat.ago);
        
        people.name = "Alex";
        people.ago = 20;
        people.cat1 = cat;
        
        //Из-за переопределение метода
        System.out.println(people);
        
        cat.may();
        people.cat1.may();
        
    }
    
}
