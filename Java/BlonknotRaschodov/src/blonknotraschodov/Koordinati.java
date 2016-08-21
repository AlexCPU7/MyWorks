/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blonknotraschodov;

/**
 *
 * @author Alex
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Koordinati {
  public static void main(String args[]) {
    Runnable runnable = new Runnable() {
      public void run() {
        JFrame frame = new JFrame("Mouse Position");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      JLabel label = new JLabel();
        label.setHorizontalAlignment(JLabel.CENTER);
        MouseMotionListener mouseMotionListener = new MouseMotionListener() {
          public void mouseDragged(MouseEvent e) {
            showMousePos(e);
          }

          public void mouseMoved(MouseEvent e) {
            showMousePos(e);
          }

          private void showMousePos(MouseEvent e) {
            JLabel src = (JLabel)e.getComponent();
            PointerInfo pointerInfo = MouseInfo.getPointerInfo();
            Point point = pointerInfo.getLocation();
            src.setText(point.toString());
          }
        };
        label.addMouseMotionListener(mouseMotionListener);
        frame.add(label, BorderLayout.CENTER);
        frame.setSize(300, 300);
        frame.setVisible(true);
      }
    };
    EventQueue.invokeLater(runnable);
  }
}
