package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;    // durch die Random Funktion wird durch zufalls Prinzip eine belibige Zahl zwischen 1 und 0 ausgewählt.

      int zahlen =  Integer.parseInt(JOptionPane.showInputDialog("bitte geben sie eine Zahl zwischen 1 und 10 ein!"));

        if (zahlen == zufallszahl) {

            JOptionPane.showMessageDialog(null, "Ihre Zahl stimmt mit der Zufallszahl überein! Glükwunsch");

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Ihre Zahl stimmt mit der Zufallszahl leider nicht überein!");

        }
        if ((zufallszahl - zahlen)>=-2 && (zufallszahl - zahlen)<=2 ) {

            JOptionPane.showMessageDialog(null, "Sie sind knapp an der richtigen Zahl drann!");
        }

        else
        {
            JOptionPane.showMessageDialog(null, "Ihre Zahl stimmt mit der Zufallszahl leider nicht überein!");

        }
        // Es schlägt fehl weil auf Auf Strings keine Operatoren angewand werden können.


      /* if (zufallszahl % 2 ==0)
        {
            JOptionPane.showMessageDialog(null, "Die zufällig ausgewählte Zahl ist gerade!");

        } else {
            JOptionPane.showMessageDialog(null, "Die zufällig ausgewählte Zahl ist gerade!");
        } */
    }
}
