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
public class Box {
    
    int length = 2;
    int width = 3;
    int height = 4;
    String sd = "O_o";
    
    String area(){
        return ("Площадь = " + (length*width*height));
    }
    /*
    public static void main(String[] args){
        Box iBox = new Box();
        
        //iBox.length;
       // iBox.width ;
       // iBox.height ;
        
        System.out.println(iBox.area());
    }   */
    
    int sum(){
        return 5 + 2;
    }
    
    int sum1(int a, int b, int c){
        return (a + b * c);
    }
    
}
