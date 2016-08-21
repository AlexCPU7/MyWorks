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
public class Rekursia {
    
    public static void abc(int a, int b){
        int c = a + b;
        if (c == 7){
            abc(4,5);
        }
        System.out.println(c);
    }
    
    public static void main(String[] args){
        abc(3,4);
    }
}
