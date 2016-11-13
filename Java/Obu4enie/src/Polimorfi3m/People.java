/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfi3m;

/**
 *
 * @author AlexC_000
 */
public class People {
    
    public String name;
    int ago;
    
    public void hi(){
        System.out.println("Hi");
    }
    
    People(String n, int a){
        n = name;
        a = ago;
        
    }
    
    @Override
    public String toString(){
        return "Имя " + name + ", возраст " + ago;
    }
     
}
