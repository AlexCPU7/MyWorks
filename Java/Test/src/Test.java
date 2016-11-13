
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

        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in); 
        //===================================
        
        Scanner scan1= new Scanner(System.in); 
        Scanner scan2 = new Scanner(System.in); 
        
        int x1 = scan.nextInt();
        double x2 = scan1.nextDouble();
        String x3 = scan2.nextLine();
        
        int rez1 = x1 + i;
        double rez2 = x2 + d;
        String rez3 = s+x3;
        System.out.println("=====================================");
        System.out.println(rez1);
        System.out.println(rez2);
        System.out.println(rez3);
        
        //===================================        
        scan.close();
        
    }
        
}
