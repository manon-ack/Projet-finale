package projet.pkgfinal;


import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author namre
 */
public class CelluleGraphique extends JButton{
    Cellule celluleassociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/image/vide.png"));
    
    public CelluleGraphique (Cellule uneCellule) {
        celluleassociee = uneCellule;
    }
    
    @Override
    public void paintComponent (Graphics G) {
        super.paintComponent(G);
        setIcon(img_vide);
    }
}
