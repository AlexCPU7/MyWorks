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
public class Box {
    
    int a;
    int b;
    int c;
    
    Box(){
        a = 20;
        b = 30;
        c = 40;
    }

    
    int setRez(){
        return a + b + c;
    }
    
    public static void main(String[] args){
        Box box = new Box();
        System.out.println(box.setRez());
        
    }
    
}
