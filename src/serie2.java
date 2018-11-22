import javax.swing.*;

public class serie2
{

public static void main (String [] args)
    {

    String name = JOptionPane.showInputDialog("bitte Namen eingeben");
    int alter =   Integer.parseInt(JOptionPane.showInputDialog("Bitte alter eingeben"));

    if (alter >=18)
    {
        JOptionPane.showMessageDialog(null, "Du bist über 18!");
    }
    else
        {
            JOptionPane.showMessageDialog(null, "Du bist unter 18!");
        }
    }
}

