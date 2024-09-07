package Practical2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class mouseEvent extends JFrame{
    
    public mouseEvent(){
        
        MovableMessagePanel p = new MovableMessagePanel("Welcome to Java");
        
        add(p);
        setTitle("Move Message Demo");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);
        setVisible(true);
        
    }  
    
    static class MovableMessagePanel extends JPanel{
        private String message = "Welcome to Java";
        private int x = 20;
        private int y = 20;
    
    
    public MovableMessagePanel(String s){
        message = s;
        addMouseMotionListener(new MouseMotionListener(){
            
        public void mouseDragged(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint();
        }
        public void mouseMoved(MouseEvent e){
            
        }
        
        });
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString(message, x, y);
    }
    }
    public static void main(String[] args){
        new mouseEvent();
        
    }
}