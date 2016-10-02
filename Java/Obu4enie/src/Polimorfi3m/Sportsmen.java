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
public class Sportsmen extends People{

    //полиморфизм
    public Sportsmen(String n, int a) {
        super(n, a);
    }
    
    @Override
    public void hi(){
        System.out.println("Sport");
    }
    
    
    
}
