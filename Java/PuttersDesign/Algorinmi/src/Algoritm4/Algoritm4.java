/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritm4;

import java.util.Random;

/**
 * Сортировка методом шейкера!
 */
public class Algoritm4 {
    
    public static void main(String[] args) {
        
        int []mas = new int[10];
        
        System.out.println("Создания массива:");
        for(int i = 0; i < mas.length; i++){
            Random ran = new Random();
            mas[i] = ran.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        
        System.out.println("");
        
        int left = 1, right = mas.length - 1;
        do{
            //int left = 1, right = mas.length - 1;
        for(int i = right; i >= left; i--){
            if(mas[i-1] > mas[i]){
                int num = mas[i];
                mas[i] = mas[i-1];
                mas[i-1] = num;
            }
        }
        left++;
        for(int i = left; i <= right; i++){
            if(mas[i-1] > mas[i]){
                int num = mas[i];
                mas[i] = mas[i-1];
                mas[i-1] = num;
            }
        }
        right--;
        } while(left <= right);
        
        System.out.println("Вывод массива:");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
