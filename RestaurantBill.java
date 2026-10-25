import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RestaurantBill extends JFrame implements ActionListener {

    JTextField q1, q2, q3;
    JLabel total;
    JButton bill;

    RestaurantBill() {
        setTitle("Restaurant Bill");
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Burger (150 Tk):"));
        q1 = new JTextField("0");
        add(q1);

        add(new JLabel("Pizza (250 Tk):"));
        q2 = new JTextField("0");
        add(q2);

        add(new JLabel("Coffee (80 Tk):"));
        q3 = new JTextField("0");
        add(q3);

        bill = new JButton("Generate Bill");
        total = new JLabel("Total Bill: 0 Tk");

        add(bill);
        add(total);

        bill.addActionListener(this);

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int b = Integer.parseInt(q1.getText()) * 150;
        int p = Integer.parseInt(q2.getText()) * 250;
        int c = Integer.parseInt(q3.getText()) * 80;

        int totalBill = b + p + c;
        total.setText("Total Bill: " + totalBill + " Tk");
    }

    public static void main(String[] args) {
        new RestaurantBill();
    }
}
