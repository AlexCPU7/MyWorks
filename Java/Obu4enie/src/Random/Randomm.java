/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.util.Random;

/**
 *
 * @author Alex
 */
public class Randomm {
    
    public static void main(String[] args) {
        Random ran = new Random();
        int namber = ran.nextInt(9)+1;
        System.out.println(namber);
        if(namber == 9){
            System.out.println("101010101011010101010101");
        }else{
            System.out.println("lizlizlizlizlizlizlizliz");
        }
        
    }
    
}
