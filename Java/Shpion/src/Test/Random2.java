/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
 
public class Random2 {
 
public static void main(String[] args) {
    int arrayLength = 5;
    int[] array = new int[arrayLength];
    //filling array
    for (int i = 0; i < array.length; i++) {
        array[i] = i;
    }
 
    //copy array
    int[] tmpArray = Arrays.copyOf(array, array.length);
    Random r = new Random();
    int counter = 1;//counter of printed values
    while (counter < tmpArray.length) {//while not all values printed
        int i = r.nextInt(tmpArray.length);//next random index of tmpArray
        int value = tmpArray[i];//value at this index
        if (value != -1) {//if value not printed
            System.out.println(value);
            tmpArray[i] = -1;//mark printed value
            counter++;//increase counter
        }
    }
}
}


