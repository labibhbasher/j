
//lab01
import javax.swing.*;

public class DisplayImage extends JFrame {
    DisplayImage() {
        ImageIcon image = new ImageIcon("IMG_20211222_164215.JPG");
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
