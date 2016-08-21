/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AlexC_000
 */
public class Test {

    public int component1 = 6; // Сырье №1
    public int component2 = 13; // Сырье №2
    
    //Ниже представлен единственный метод нашей фабрики
    //Он собирает из исходного сырья некий продукт и отдает его
    public int getProduct(){
        System.out.println("Factory component #1: " + component1); //Напишем в консоль,
                        //что из себя представляет первое поле

        System.out.println("Factory component #2: " + component2); //и второе
        int product = component1*component2; // Вычислим результат
        return product; // Отдаем результат
    }
} 

