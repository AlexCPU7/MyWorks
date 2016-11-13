/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Peregrezkametodov;

/**
 *
 * @author AlexCPU7
 */
public class Main {
    
    public static void main(String... args){
        Peregrezkametodov object = new Peregrezkametodov();        
        String s1 = object.get();
        String s2 = object.get("Semenov");
        String s3 = object.get(21);
        System.out.println(s1 + s2 + s3);
        
        object.get(true);
    }
    
}
