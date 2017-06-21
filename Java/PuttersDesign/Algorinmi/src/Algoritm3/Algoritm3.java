/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritm3;

import java.util.Random;

/**
 * Сортировка методом вставки!
 * Сравнивает левое значение с правый, если левое меньше, то заменает его и так по всему циклу
 */
public class Algoritm3 {
    
    public static void main(String[] args) {
        
        int []mas = new int[10];
        
        System.out.println("Создания массива:");
        for(int i = 0; i < mas.length; i++){
            Random ran = new Random();
            mas[i] = ran.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        
        System.out.println("");
        
        int j, temp;
        for(int i = 0; i < mas.length; i++){
            temp = mas[i];
            for(j = i-1; j >= 0 && mas[j] > temp; j--){
                mas[j+1] = mas[j];
            }
            mas[j+1] = temp;
        }
        
        System.out.println("Вывод массива:");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
