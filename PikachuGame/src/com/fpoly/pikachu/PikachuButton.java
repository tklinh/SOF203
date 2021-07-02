/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpoly.pikachu;

import javax.swing.JButton;

/**
 *
 * @author Kali
 */
public class PikachuButton {
    
    private JButton btnPikachu;
    private int colIndex;
    private int rowIndex;
    private int iconIndex;

    public PikachuButton(JButton btnPikachu, int colIndex, int rowIndex, int iconIndex) {
        this.btnPikachu = btnPikachu;
        this.colIndex = colIndex;
        this.rowIndex = rowIndex;
        this.iconIndex = iconIndex;
    }

    public JButton getBtnPikachu() {
        return btnPikachu;
    }

    public int getColIndex() {
        return colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getIconIndex() {
        return iconIndex;
    }

    
    
}
