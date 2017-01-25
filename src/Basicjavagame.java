/**
 * Created by supreet on 2017-01-25.
 */

import javax.swing.*;
import java.awt.*;

public class Basicjavagame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setBackground(Color.BLACK); // NOT WORKING

        JPanel panel = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(0, 0, 400, 400);
            }
        };
        frame.add(panel);

        frame.validate();
        frame.repaint();
    }
}
