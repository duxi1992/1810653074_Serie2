package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();
        int zufallszahl = rnd.nextInt(max - min + 1) + min;    // durch die Random Funktion wird durch zufalls Prinzip eine belibige Zahl zwischen 1 und 0 ausgewählt.

        if (zufallszahl % 2 ==0)
        {
            JOptionPane.showMessageDialog(null, "Die zufällig ausgewählte Zahl ist gerade!");

        } else {
            JOptionPane.showMessageDialog(null, "Die zufällig ausgewählte Zahl ist gerade!");
        }
    }
}
