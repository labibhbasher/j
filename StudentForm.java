import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentForm extends JFrame implements ActionListener {

    JTextField name, id;
    JComboBox<String> dept;
    JRadioButton male, female;
    JButton submit;
    JLabel result;

    StudentForm() {
        setTitle("Student Form");
        setLayout(new GridLayout(5, 2));

        add(new JLabel("Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Student ID:"));
        id = new JTextField();
        add(id);

        add(new JLabel("Department:"));
        String d[] = {"CSE", "EEE", "CE", "ICE", "URP"};
        dept = new JComboBox<>(d);
        add(dept);

        add(new JLabel("Gender:"));
        JPanel p = new JPanel();
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        p.add(male);
        p.add(female);
        add(p);

        submit = new JButton("Submit");
        result = new JLabel("");
        add(submit);
        add(result);

        submit.addActionListener(this);

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String g = "Not selected";

        if (male.isSelected())
            g = "Male";
        if (female.isSelected())
            g = "Female";

      result.setText("Submitted: " + name.getText()
        + ", ID: " + id.getText()
        + ", Dept: " + dept.getSelectedItem()
        + ", " + g);
    }

    public static void main(String[] args) {
        new StudentForm();
    }
}
