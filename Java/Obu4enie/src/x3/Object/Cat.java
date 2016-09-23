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
public class Cat {
    
    String name;
    int ago;
    String poroda;
    
    void may(){
        System.out.println("Пошел ты нахер козел!");
    }
    
    //Переопределяем метод:
    @Override
    public String toString(){
        return "Cat:[ " + name + ", " + ago + ", " + poroda + "]";
    }
    
}
