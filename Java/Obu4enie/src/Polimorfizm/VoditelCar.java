/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfizm;

/**
 *
 * @author AlexCPU7
 */
public class VoditelCar implements Car, People{
    
    // VoditelCar vc = new VoditelCar();
    public  String color;
    public String categori;  
    public String model = "BA3";  
    public int ago = 21;      

    @Override
    public String model() {
        return model;             
    }

    @Override
    public void color(String col) {
        this.color = col;
        System.out.println(col);
    }

    @Override
    public void name() {
        System.out.println("name");
    }

    @Override
    public int ago() {
        return ago;
    }

    @Override
    public void categori(String c) {
        //https://www.youtube.com/watch?v=j-7s8Co65gY&index=25&list=PLIU76b8Cjem48KXIy83YIm-QM6SwvzjQd
    }
    
    
    
}
