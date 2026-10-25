
//lab01

import javax.swing.*;
import java.awt.*;

public class DisplayImage extends JFrame {

    DisplayImage() {
        ImageIcon icon = new ImageIcon("IMG_20211222_164215.JPG");

        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(500, 400, Image.SCALE_SMOOTH);

        ImageIcon image = new ImageIcon(newImg);
        JLabel label = new JLabel(image);

        add(label);
        setTitle("Display Image");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DisplayImage();
    }
}

