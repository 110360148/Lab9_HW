import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField tf1, tf2, tf3;
    Button btnAdd, btnSub, btnMul, btnDiv;

    SimpleCalculator() {
        tf1 = new TextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new TextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new TextField();
        tf3.setBounds(50, 150, 150, 20);
        tf3.setEditable(false);

        btnAdd = new Button("+");
        btnAdd.setBounds(50, 200, 50, 50);
        btnSub = new Button("-");
        btnSub.setBounds(120, 200, 50, 50);
        btnMul = new Button("*");
        btnMul.setBounds(190, 200, 50, 50);
        btnDiv = new Button("/");
        btnDiv.setBounds(260, 200, 50, 50);

        btnAdd.addActionListener(this);
        btnSub.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(btnAdd);
        add(btnSub);
        add(btnMul);
        add(btnDiv);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        double a = Double.parseDouble(s1);
        double b = Double.parseDouble(s2);
        double result = 0;

        if (e.getSource() == btnAdd) {
            result = a + b;
        } else if (e.getSource() == btnSub) {
            result = a - b;
        } else if (e.getSource() == btnMul) {
            result = a * b;
        } else if (e.getSource() == btnDiv) {
            result = a / b;
        }

        tf3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
