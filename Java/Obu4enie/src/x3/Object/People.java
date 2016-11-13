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
public class People {
    
    String name;
    int ago;
    
    Cat cat1;
    
    @Override
    public String toString(){
        return "people:[ " + name + ", " + ago + ", имет кота " + cat1 +"]";
    }
    
}
