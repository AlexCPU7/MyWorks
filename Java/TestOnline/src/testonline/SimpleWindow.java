/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testonline;

import java.awt.*;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author Alex
 */
public class SimpleWindow extends JFrame {
    SimpleWindow(){
super("Пробное окно");
setDefaultCloseOperation(EXIT_ON_CLOSE);
Box box = Box.createVerticalBox();
box.add(new JButton("Кнопка"));
box.add(Box.createVerticalStrut(10));
box.add(new JButton("+"));
box.add(Box.createVerticalGlue());
box.add(new JButton("-"));
box.add(Box.createVerticalStrut(10));
box.add(new JButton("Кнопка с длинной надписью"));
setContentPane(box);
setSize(250, 100);
    }
}
