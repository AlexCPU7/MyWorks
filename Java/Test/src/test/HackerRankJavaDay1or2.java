/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.random;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import static jdk.nashorn.internal.objects.NativeMath.random;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.*;



/**
 *
 * @author Alex
 */
public class HackerRankJavaDay1or2 {

   public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        
        int x1 = scan.nextInt();
        double x2 = scan.nextDouble();
        String x3 = scan.next();
        
        
        int sum1 = x1 + i;
        double sum2 = x2 + d;
        
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(s + x3);
        
        scan.close();
    }
}
    
