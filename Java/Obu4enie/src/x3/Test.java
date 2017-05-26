package x3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlexCPU7
 */
public class Test {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
        
        int rez;
        if (a > 0){
            rez = a * 2;
            System.out.println(rez);
        }else{
            if (a < 0){
                rez = a + 1;
                System.out.println(rez);
            }else{
                rez = a;
                System.out.println(rez);
            }
        }
    }
}
