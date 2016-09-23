/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author AlexCPU7
 */
public class Cat {
    
    int ago;
    int vozrast;
    
    Cat(int a, int v){
        ago = a;
        vozrast = v;
    }
    
    //инициализируем преиенную одним и тем же значением
    Cat(int i){
        this(i,i);
    }
    
    //присваиваем значение по умолчанию 0
    Cat(){
        this(0);
    }
    
    public static void main(String[] argc){
        Cat cat = new Cat(1,2);
        System.out.println(cat.ago);
        System.out.println(cat.vozrast);
        
        Cat cat1 = new Cat(5);
        System.out.println(cat1.ago);
        System.out.println(cat1.vozrast);
        
        Cat cat2 = new Cat();
        System.out.println(cat2.ago);
        System.out.println(cat2.vozrast);
        
    }
}
