/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

/**
 *
 * @author AlexCPU7
 */
public class DelenieNaNol {
    
    public static void main(String[] args){
        int nol = 5/0;
        
        try{
            System.out.print(nol);
            //внизу также можно написать конкретную ошибку или Exception
        }catch(ArithmeticException err){
            System.out.print("Сер, у вас проблемы. Ошибка!!!");
        }
    }
    
}
