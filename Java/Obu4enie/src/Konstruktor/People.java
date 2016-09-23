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
public class People {
    
    String name;
    int ago;
    String pol;
    String from;
    
    People(String n, int a, String p, String f) {
        name = n;
        ago = a;
        pol = p;
        from = f;
    }
    
    @Override
    public String toString(){
        return "Имя " + name + ", возраст " + ago + ", пол " + pol + ", город " + from;
    }
    
    public static void main(String[] argc){
        People people = new People("Alex", 20, "M", "Ivanovo");
        System.out.println(people);
        
    }
}
