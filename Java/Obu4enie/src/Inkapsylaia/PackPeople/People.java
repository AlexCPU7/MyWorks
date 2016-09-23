/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inkapsylaia.PackPeople;

import Inkapsylaia.PackCat.Cat;
import Inkapsylaia.Main;


/**
 *
 * @author AlexCPU7
 */
public class People {
    
    private String name;
    private int ago;
    
    private Cat cat1;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    } 
    
    public int getAgo(){
        return ago;
    }
    
    public void setAgo(int ago){
        this.ago = ago;
    } 
    
    public Cat getCat1(){
        return cat1;
    }
    
    public void setCat1(Cat cat1){
        this.cat1 = cat1;
    }
    
    @Override
    public String toString(){
        return "people:[ " + name + ", " + ago + ", имет кота " + cat1 +"]";
    }
    
}
