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
public class Cat {
    //создаём свойсва кота, что он может делать
    
    public void eat(){
        String eat = "Кот хавет корм";
        System.out.println(eat);        
    }
    
    public String speak(String May){
        String speak = "Кот мяукает" + May;
        return speak;
    }
    
    public void sleep(){
        String sleep = "Кот спит";
        System.out.println(sleep);
    }
}
