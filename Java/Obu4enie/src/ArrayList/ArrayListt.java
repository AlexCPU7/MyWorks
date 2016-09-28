/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author AlexCPU7
 */
public class ArrayListt {

    public static void main(String[] args){
        List list = new ArrayList();
        
        list.add(21);   //0
        list.add(43);   //1
        list.add(77);   //2
        
        list.remove(1);
        
        System.out.println(list.get(0) + "   " + list.get(1));
        
        List<Integer> list1 = new ArrayList();
        
        list1.add(22);   //0
        list1.add(33);   //1
        list1.add(44);   //2
        
        for(int n : list1){
            System.out.print(n + "; ");
        }
        
        boolean prov = list.isEmpty();
        System.out.println(prov);
    }
    
    
    
}
