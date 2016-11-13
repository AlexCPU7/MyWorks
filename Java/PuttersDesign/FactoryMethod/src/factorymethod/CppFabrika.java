/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author AlexCPU7
 */
public class CppFabrika implements Fabrika{

    @Override
    public Developer fabrika() {
        return new CppDeveloper();
    }


    
}
