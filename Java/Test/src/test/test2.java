/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AlexCPU7
 */
public class test2 {
    
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{
         if (n == 2 || n == 3 || n == 4 || n == 5 ) {
             System.out.println("Not Weird");
         }else{
             if (n == 6 || n == 7 || n == 8 || n == 9 || n == 10 || n == 11 || n == 12 || n == 13 || n ==14 || n == 15 || n == 16 || n == 17 || n == 18 || n == 19 || n == 20  ){
                 System.out.println("Weird");
             }else{
                 if (n>=20){
                     System.out.println("Not Weird");
                 }
             }
         } 
      }
      System.out.println(ans);
   }    
}
