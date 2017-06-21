/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Argoritm2;

/*
Сортировка методом выборки!
Находит минимальный элемент в массиве и перемещает его на 1 позицию
эсли элементы одинаковые, то обмен не производится
*/

import java.util.Random;

public class Argoritm2 {
    
    public static void main(String[] args) {
        
        int []mas = new int[10];
        
        System.out.println("Создания массива:");
        for(int i = 0; i < mas.length; i++){
            Random ran = new Random();
            mas[i] = ran.nextInt(10);
            System.out.print(mas[i] + " ");
        }
        
        System.out.println("");
        
        int numb = 0;
        int save = 0;
        for(int i = 0; i < mas.length; i++){
            numb = mas[i];
            for(int j = i+1; j < mas.length; j++){
                if(mas[j] < numb){
                    numb = mas[j];
                    save = mas[i];
                    mas[i] = numb;
                    mas[j] = save;
                }
            }
        }
        
        System.out.println("Вывод массива:");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
