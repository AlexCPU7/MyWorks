/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
 
public class Random {
 
    public static void main(String[] args) {
        String[] array = {"a","b","c","d","f"};
        List<String> list = new LinkedList<String>(Arrays.<String>asList(array));
        Collections.shuffle(list);
        System.out.println(list);
    }
}
