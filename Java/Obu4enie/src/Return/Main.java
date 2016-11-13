/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Return;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] argc){
        
        Box iBox = new Box();
        System.out.println(iBox.area());
        
        Box iSum = new Box();
        System.out.println(iSum.sum());
        
        Box iSum1 = new Box();
        System.out.println(iSum.sum1(2, 2, 2));
    }
}
