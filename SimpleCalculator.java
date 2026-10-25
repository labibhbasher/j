import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");
        f.setSize(300, 250);
        f.setLayout(new GridLayout(5, 2, 5, 5));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();

        f.add(new JLabel("First Number:"));
        f.add(t1);

        f.add(new JLabel("Second Number:"));
        f.add(t2);

        JButton add = new JButton("Add");
        JButton sub = new JButton("Subtract");
        JButton mul = new JButton("Multiply");
        JButton div = new JButton("Divide");

        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);

        JLabel result = new JLabel("Result: ");
        f.add(result);

        add.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a + b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a - b));
        });

        mul.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("Result: " + (a * b));
        });

        div.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());

            if (b == 0)
                result.setText("Cannot divide by zero");
            else
                result.setText("Result: " + (a / b));
        });

        f.setVisible(true);
    }
}