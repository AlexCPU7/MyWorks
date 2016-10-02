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
public class Main {
    public static void main(String[] args){
        People people = new People("Lolo", 21);
        people.hi();
        
        System.out.println(people);
        
        Sportsmen sportsmen = new Sportsmen("sd", 34);
        sportsmen.hi();

    }  
}
