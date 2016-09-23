/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inkapsylaia.PackCat;

import Inkapsylaia.Main;

/**
 *
 * @author AlexCPU7
 */
public class Cat {
    
    private String name;
    private int ago;
    private String poroda;
    
    public void may(){
        System.out.println("Пошел ты нахер козел!");
    }
    
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
    
    public String getPoroda(){
        return poroda;
    }
    
    public void setPoroda(String poroda){
        this.poroda = poroda;
    } 
    
    //Переопределяем метод:
    @Override
    public String toString(){
        return "Cat:[ " + name + ", " + ago + ", " + poroda + "]";
    }
    
}
