/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radomnumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AlexCPU7
 */
public class RadomNumber {

    public static void main(String[] args) {
        
        int i = 1;
        Scanner nubmerSc = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Введите максимальное значение: ");
        int nubmer = nubmerSc.nextInt();
            
        int secret = random.nextInt(nubmer + 1);
        System.out.println("Ответ: " + secret);
        
        System.out.print("Введите предполагаемое число: ");
        int nubmerWat = nubmerSc.nextInt();
        
        if (nubmerWat > secret){
                System.out.println("Число меньше");
            }else{
                System.out.println("Число больше");
            }

        for(int x = secret; x != nubmerWat; i++){
            System.out.print("Введите предполагаемое число: ");
            nubmerWat = nubmerSc.nextInt();
            //System.out.println("i = " + i);
            if (nubmerWat > secret){
                System.out.println("Число меньше");
            }else{
                System.out.println("Число больше");
            }
        }
        
        if (i == 2){
            System.out.println("Вы отгадали со " + i + " раза");
        }else{
            System.out.println("Вы отгадали с " + i + " раза");
        }

    }
    
}
