/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpoly.demoawt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Kali
 */
public class Demo1AWT extends Frame implements ActionListener {
    
    Button btnYellow, btnRed;
    Label lblInfo = new Label();
    
    public Demo1AWT(String msg) {
        setTitle(msg);
        //setLayout(new FlowLayout());
        
        btnYellow = new Button("Yellow");
        btnRed = new Button("Red");
        lblInfo.setSize(100, 20);
        
        add(btnYellow);
        add(btnRed);
        add(lblInfo);
        
        btnYellow.addActionListener(this);
        btnRed.addActionListener(this);
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                //dispose();
                System.exit(0);
            }
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //String str = e.getActionCommand();
        //lblInfo.setText(str);
        
        if (e.getSource()== btnYellow) {
            lblInfo.setText("OK");
        } else {
            lblInfo.setText("NO");
        }
    }
    
    public static void main(String[] args) {
        Demo1AWT demo = new Demo1AWT("AWT FPoly");
        demo.setSize(450, 200);
        
        demo.setVisible(true);
        
    }
    
}
