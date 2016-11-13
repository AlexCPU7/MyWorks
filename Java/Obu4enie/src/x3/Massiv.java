/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x3;

/**
 *
 * @author Alex
 */
public class Massiv {
    
    static int[] mas = new int[5];
    
    public static void main(String[] args){

        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        mas[3] = 4;
        mas[4] = 5; 
        
        rez1();
    }
    
    public static void rez(){
        for(int m : mas){
            System.out.println(m);
        }             
    }
    public static void rez1(){
        for(int i = 0; i<mas.length;i++){
            System.out.println(mas[i]);
        }
        System.out.println(mas[0]);
    }
}
