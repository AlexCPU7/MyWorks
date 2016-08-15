package shpion;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Alex
 * Сократил как мог
 */
public class Shpion1_1 {
    
    static String Territory1 = "База террористов";
    static String Territory2 = "Партизанский отряд";
    static String Territory3 = "Киностудия";
    static String Territory4 = "Полярная станция";
    static String Territory5 = "Банк";
    static String Territory6 = "Театр";
    static String Territory7 = "Больница";
    static String Territory8 = "Пиратский корабль";
    static String Territory9 = "Университет";
    static String Territory10 = "Церковь";
    static String Territory11 = "Казино";
    static String TerritoryShpion = "Шпион";
    
    public static void main(String[] args) {
        
        String[] ArrayTerritory = {Territory1, Territory2, Territory3, Territory4, Territory5, Territory6, Territory7, Territory8, Territory9, Territory10, Territory11};
        List<String> RezTerritory = new LinkedList<String>(Arrays.<String>asList(ArrayTerritory));
        Collections.shuffle(RezTerritory);
        
        String[] GameTerritory = {RezTerritory.get(0), RezTerritory.get(0), RezTerritory.get(0), TerritoryShpion};
                List<String> Territory = new LinkedList<String>(Arrays.<String>asList(GameTerritory));
                Collections.shuffle(Territory);
                
                Scanner klick = new Scanner(System.in);
                System.out.println("Нажмите Enter для продолжения...");
                
                for (int i = 0; i < 4; i++){
                    int p = i + 1;
                    String player = klick.nextLine();
                    System.out.println("Игрок " + p + ": " + Territory.get(i));
                    System.out.println("Очистите поле!");
                }
    }
}    
