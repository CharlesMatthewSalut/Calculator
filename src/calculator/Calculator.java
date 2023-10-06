/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Salut
 */
public class Calculator extends JFrame {
    private JTextField displayField;
    private JButton[] digitButtons;
    private JButton[] operationButtons;

    public Calculator() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        displayField = new JTextField(10);
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        displayField.setEditable(false);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 10;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5);
        panel.add(displayField, gbc);

        digitButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(Integer.toString(i));
            gbc.gridx = i % 3;
            gbc.gridy = 3 - (i / 3);
            gbc.gridwidth = 1;
            panel.add(digitButtons[i], gbc);
        }

        operationButtons = new JButton[4];
        String[] operations = {"+", "-", "*", "/"};
        for (int i = 0; i < 4; i++) {
            operationButtons[i] = new JButton(operations[i]);
            gbc.gridx = 3;
            gbc.gridy = i + 1;
            panel.add(operationButtons[i], gbc);
        }

        JButton equalsButton = new JButton("=");
        gbc.gridx = 2;
        gbc.gridy = 4;
        panel.add(equalsButton, gbc);

        JButton resetButton = new JButton("C");
        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(resetButton, gbc);

        JButton deleteButton = new JButton("Del");
        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(deleteButton, gbc);

        add(panel);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Calculator();
        });
}
}
