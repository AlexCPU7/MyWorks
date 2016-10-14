/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlexCPU7
 */
public class JavaDeveloperJobSite implements Observed{
    
    List<String> vacancies = new ArrayList<>();
    List<String> subscribers = new ArrayList<>();
    
    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserver();
    }
    
    public void remoweVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void notifyObserver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
