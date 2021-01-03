/*
 * ACKERMANN Manon - BELLOD Vanina
 * Projet final
 * SPEED-CLICK
 */

package projet.pkgfinal;

/**
 *
 * @author vanin
 */
public class Grille {
    Cellule [][] Cellules = new Cellule [6][7]; //on a une grille de 6lignes et 7 colonnes


public Grille () { //on initialise la grille en créant les 42 cellules vides
       for (int i=0; i<6; i++) {
           for (int j=0; j<7; j++) {
               Cellules[i][j] = new Cellule();
           }
       }
   }

}