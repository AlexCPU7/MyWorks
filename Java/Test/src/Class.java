/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
 
public class Class {
 
public static void main(String[] agrs)
{
    int[] a = new int[7];
    int i = 0;
    Scanner in = new Scanner(System.in);


    for (int element : a)
    {       

        System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
        a[i] = in.nextInt();

        System.out.println(a[i] + " - ");

        i++;
    }

    for (int element : a)

        System.out.print(element + " ");


}
}
