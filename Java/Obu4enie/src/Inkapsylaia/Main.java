/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inkapsylaia;

import Inkapsylaia.*;
import Inkapsylaia.PackCat.Cat;
import Inkapsylaia.PackPeople.People;

/**
 *
 * @author AlexCPU7
 */
public class Main {
    
    //Экземпляр класса
    static Cat cat = new Cat();
    static People people = new People();
    
    public static void main(String[] args){
        
        cat.setName("JoJo");
        cat.setAgo(5);
        cat.setPoroda("X3");
        //System.out.println(cat.setAgo(5));
        
        people.setName("Alex");
        people.setAgo(20);
        people.setCat1(cat);
        
        //Из-за переопределение метода
        System.out.println(people);
        
        cat.may();
        people.getCat1().may();
        
    }
    
}
