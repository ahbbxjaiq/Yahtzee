import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class YahtzeeGuiScoreCard implements YahtzeeScoreCard
{
    public YahtzeeGuiScoreCard()
    {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        YahtzeeGuiScoreCard.createAndShowGUI();
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Yahtzee!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Yahtzee!");
        label.setFont(new Font("Arial", Font.BOLD, 32));
        label.setBounds(0,0, 400,48);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setBackground(new Color(0));
        label.setBorder(new EmptyBorder(5, 5, 5, 0));
        label.setLocation(0, 0);

        JSeparator line = new JSeparator();
        line.setOrientation(SwingConstants.HORIZONTAL);

        frame.getContentPane().add(label);
        frame.getContentPane().add(line);
        frame.setPreferredSize(new Dimension(400, 700));
        frame.pack();
        frame.setVisible(true);
    }
    
    public void scoreHand(YahtzeeHand yahtzee, int game) {
    	// Needs to be completed
    }
}
