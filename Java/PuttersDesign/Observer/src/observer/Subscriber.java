/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.List;

/**
 *
 * @author AlexCPU7
 */
public class Subscriber implements Observer{
    
    String name;
    
    public Subscriber(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Имя " + name + "изменение в вакансии " + vacancies);
    }
    
}
