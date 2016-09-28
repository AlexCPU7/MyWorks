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
public class ErrorTryCatch {
    
    public static void main(String[] args){
        String[] mas = new String[5];
        
        try{
            System.out.print(mas[7]);
            //внизу также можно написать конкретную ошибку или Exception
        }catch(Throwable err){
            System.out.print("Сер, у вас проблемы. Ошибка!!!");
        }
    }
    
}
