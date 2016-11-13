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
public class Test {

  public static void main(String args[]){
      
      int[] solutionArray = { 1, 2, 3, 4};

    shuffleArray(solutionArray);
    for (int i = 0; i < solutionArray.length; i++)
    {
        int a = i;
        int b = a + 1;
        System.out.println("Ходится игрок " + b+":");
        System.out.println(solutionArray[i] + " ");
    }
 
  }

  // Implementing Fisher–Yates shuffle
  static void shuffleArray(int[] ar)
  {
    // If running on Java 6 or older, use `new Random()` on RHS here
    Random rnd = ThreadLocalRandom.current();
    for (int i = ar.length - 1; i > 0; i--)
    {
      int index = rnd.nextInt(i + 1);
      // Simple swap
      int a = ar[index];
      ar[index] = ar[i];
      ar[i] = a;
    }
  }

    
}
