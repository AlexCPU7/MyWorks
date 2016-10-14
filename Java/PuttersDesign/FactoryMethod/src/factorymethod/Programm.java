/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 * Фабричный метод
 * 
 */
public class Programm {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaDeveloper();
        javaDeveloper.code();
        
        Developer cppDeveloper = new CppDeveloper();
        cppDeveloper.code();
        
        Fabrika javaFab = new JavaFabrika();
        Developer javaDel = javaFab.fabrika();
        javaDel.code();
        
        Fabrika cppFab = new CppFabrika();
        Developer cppDel = cppFab.fabrika();
        cppDel.code();
    }
}
