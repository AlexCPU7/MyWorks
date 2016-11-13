/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shpion;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Alex
 */
public class Shpion {
    
    
    public static void main(String[] args) {
        
        String Territory1 = "База террористов";
        String Territory2 = "Партизанский отряд";
        String Territory3 = "Киностудия";
        String Territory4 = "Полярная станция";
        String Territory5 = "Банк";
        String Territory6 = "Театр";
        String Territory7 = "Больница";
        String Territory8 = "Пиратский корабль";
        String Territory9 = "Университет";
        String Territory10 = "Церковь";
        String Territory11 = "Казино";
        String TerritoryShpion = "Шпион";
        
      
        Random ran = new Random();
        int namber = ran.nextInt(11)+1;
        
        switch (namber){
            case 1:             
                String[] array1 = {Territory1, Territory1, Territory1, TerritoryShpion};
                List<String> list1 = new LinkedList<String>(Arrays.<String>asList(array1));
                Collections.shuffle(list1);
                //System.out.println(list);
                
                Scanner rez1 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case1 = rez1.nextLine();
                System.out.println("Игрок 1: " + list1.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case1 = rez1.nextLine();
                System.out.println("Игрок 2: " + list1.get(1));
                System.out.print("Очистите поле!");

                String player3Case1 = rez1.nextLine();
                System.out.println("Игрок 3: " + list1.get(2));
                System.out.print("Очистите поле!");

                String player4Case1 = rez1.nextLine();
                System.out.println("Игрок 4: " + list1.get(3));
                System.out.println("Очистите поле!");
                break;
            
            case 2:
                //System.out.println("Партизанский отряд");
                String[] array2 = {Territory2, Territory2, Territory2, TerritoryShpion};
                List<String> list2 = new LinkedList<String>(Arrays.<String>asList(array2));
                Collections.shuffle(list2);
                
                Scanner rez2 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case2 = rez2.nextLine();
                System.out.println("Игрок 1: " + list2.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case2 = rez2.nextLine();
                System.out.println("Игрок 2: " + list2.get(1));
                System.out.print("Очистите поле!");

                String player3Case2 = rez2.nextLine();
                System.out.println("Игрок 3: " + list2.get(2));
                System.out.print("Очистите поле!");

                String player4Case2 = rez2.nextLine();
                System.out.println("Игрок 4: " + list2.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 3:
                //System.out.println("Киностудия");
                String[] array3 = {Territory3, Territory3, Territory3, TerritoryShpion};
                List<String> list3 = new LinkedList<String>(Arrays.<String>asList(array3));
                Collections.shuffle(list3);
                
                Scanner rez3 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case3 = rez3.nextLine();
                System.out.println("Игрок 1: " + list3.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case3 = rez3.nextLine();
                System.out.println("Игрок 2: " + list3.get(1));
                System.out.print("Очистите поле!");

                String player3Case3 = rez3.nextLine();
                System.out.println("Игрок 3: " + list3.get(2));
                System.out.print("Очистите поле!");

                String player4Case3 = rez3.nextLine();
                System.out.println("Игрок 4: " + list3.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 4:
                //System.out.println("Полярная станция");
                String[] array4 = {Territory4, Territory4, Territory4, TerritoryShpion};
                List<String> list4 = new LinkedList<String>(Arrays.<String>asList(array4));
                Collections.shuffle(list4);
                //System.out.println(list);
                
                Scanner rez4 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case4 = rez4.nextLine();
                System.out.println("Игрок 1: " + list4.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case4 = rez4.nextLine();
                System.out.println("Игрок 2: " + list4.get(1));
                System.out.print("Очистите поле!");

                String player3Case4 = rez4.nextLine();
                System.out.println("Игрок 3: " + list4.get(2));
                System.out.print("Очистите поле!");

                String player4Case4 = rez4.nextLine();
                System.out.println("Игрок 4: " + list4.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 5:
                //System.out.println("Банк");
                String[] array5 = {Territory5, Territory5, Territory5, TerritoryShpion};
                List<String> list5 = new LinkedList<String>(Arrays.<String>asList(array5));
                Collections.shuffle(list5);
                
                Scanner rez5 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case5 = rez5.nextLine();
                System.out.println("Игрок 1: " + list5.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case5 = rez5.nextLine();
                System.out.println("Игрок 2: " + list5.get(1));
                System.out.print("Очистите поле!");

                String player3Case5 = rez5.nextLine();
                System.out.println("Игрок 3: " + list5.get(2));
                System.out.print("Очистите поле!");

                String player4Case5 = rez5.nextLine();
                System.out.println("Игрок 4: " + list5.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 6:
                //System.out.println("Театр");
                String[] array6 = {Territory6, Territory6, Territory6, TerritoryShpion};
                List<String> list6 = new LinkedList<String>(Arrays.<String>asList(array6));
                Collections.shuffle(list6);
                
                Scanner rez6 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case6 = rez6.nextLine();
                System.out.println("Игрок 1: " + list6.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case6 = rez6.nextLine();
                System.out.println("Игрок 2: " + list6.get(1));
                System.out.print("Очистите поле!");

                String player3Case6 = rez6.nextLine();
                System.out.println("Игрок 3: " + list6.get(2));
                System.out.print("Очистите поле!");

                String player4Case6 = rez6.nextLine();
                System.out.println("Игрок 4: " + list6.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 7:
                //System.out.println("Больница");
                String[] array7 = {Territory7, Territory7, Territory7, TerritoryShpion};
                List<String> list7 = new LinkedList<String>(Arrays.<String>asList(array7));
                Collections.shuffle(list7);
                
                Scanner rez7 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case7 = rez7.nextLine();
                System.out.println("Игрок 1: " + list7.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case7 = rez7.nextLine();
                System.out.println("Игрок 2: " + list7.get(1));
                System.out.print("Очистите поле!");

                String player3Case7 = rez7.nextLine();
                System.out.println("Игрок 3: " + list7.get(2));
                System.out.print("Очистите поле!");

                String player4Case7 = rez7.nextLine();
                System.out.println("Игрок 4: " + list7.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 8:
                //System.out.println("Пиратский  корабль");
                String[] array8 = {Territory8, Territory8, Territory8, TerritoryShpion};
                List<String> list8 = new LinkedList<String>(Arrays.<String>asList(array8));
                Collections.shuffle(list8);
                
                Scanner rez8 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case8 = rez8.nextLine();
                System.out.println("Игрок 1: " + list8.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case8 = rez8.nextLine();
                System.out.println("Игрок 2: " + list8.get(1));
                System.out.print("Очистите поле!");

                String player3Case8 = rez8.nextLine();
                System.out.println("Игрок 3: " + list8.get(2));
                System.out.print("Очистите поле!");

                String player4Case8 = rez8.nextLine();
                System.out.println("Игрок 4: " + list8.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 9:
                //System.out.println("Университет");
                String[] array9 = {Territory9, Territory9, Territory9, TerritoryShpion};
                List<String> list9 = new LinkedList<String>(Arrays.<String>asList(array9));
                Collections.shuffle(list9);
                
                Scanner rez9 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case9 = rez9.nextLine();
                System.out.println("Игрок 1: " + list9.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case9 = rez9.nextLine();
                System.out.println("Игрок 2: " + list9.get(1));
                System.out.print("Очистите поле!");

                String player3Case9 = rez9.nextLine();
                System.out.println("Игрок 3: " + list9.get(2));
                System.out.print("Очистите поле!");

                String player4Case9 = rez9.nextLine();
                System.out.println("Игрок 4: " + list9.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 10:
                //System.out.println("Церковь");
                String[] array10 = {Territory10, Territory10, Territory10, TerritoryShpion};
                List<String> list10 = new LinkedList<String>(Arrays.<String>asList(array10));
                Collections.shuffle(list10);
                
                Scanner rez10 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case10 = rez10.nextLine();
                System.out.println("Игрок 1: " + list10.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case10 = rez10.nextLine();
                System.out.println("Игрок 2: " + list10.get(1));
                System.out.print("Очистите поле!");

                String player3Case10 = rez10.nextLine();
                System.out.println("Игрок 3: " + list10.get(2));
                System.out.print("Очистите поле!");

                String player4Case10 = rez10.nextLine();
                System.out.println("Игрок 4: " + list10.get(3));
                System.out.println("Очистите поле!");
                break;
                
            case 11:
                //System.out.println("Казино");
                String[] array11 = {Territory11, Territory11, Territory11, TerritoryShpion};
                List<String> list11 = new LinkedList<String>(Arrays.<String>asList(array11));
                Collections.shuffle(list11);
                
                Scanner rez11 = new Scanner(System.in);
                
                System.out.println("Нажмите Enter для продолжения...");
                String player1Case11 = rez11.nextLine();
                System.out.println("Игрок 1: " + list11.get(0));
                System.out.print("Очистите поле!");               
    
                String player2Case11 = rez11.nextLine();
                System.out.println("Игрок 2: " + list11.get(1));
                System.out.print("Очистите поле!");

                String player3Case11 = rez11.nextLine();
                System.out.println("Игрок 3: " + list11.get(2));
                System.out.print("Очистите поле!");

                String player4Case11 = rez11.nextLine();
                System.out.println("Игрок 4: " + list11.get(3));
                System.out.println("Очистите поле!");
                break;
        }
        
    }
    
}
