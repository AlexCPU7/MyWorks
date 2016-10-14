/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Random;
/**
 *
 * @author Alex
 */
public class Game {

    String[] a = {"1a", "2a", "3a", "4a"};
    String[] b = {"1b", "2b", "3b", "4b"};
    String[] c = {"1c", "2c", "3c", "4c"};
    
    public static void main(String[] args) {
        System.out.println();
        Random ran = new Random();
        int a = ran.nextInt(9)+1;
        System.out.println(a);
    }
    
}
