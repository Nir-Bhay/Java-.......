import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcu {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple Calculator");
        frame.setSize(300, 200);
        frame.setLayout(null);

        TextField num1Field = new TextField();
        num1Field.setBounds(30, 30, 80, 20);

        TextField num2Field = new TextField();
        num2Field.setBounds(120, 30, 80, 20);

        Button addButton = new Button("+");
        addButton.setBounds(30, 60, 50, 30);

        Button subtractButton = new Button("-");
        subtractButton.setBounds(90, 60, 50, 30);

        Button multiplyButton = new Button("*");
        multiplyButton.setBounds(150, 60, 50, 30);

        Button divideButton = new Button("/");
        divideButton.setBounds(210, 60, 50, 30);

        Label resultLabel = new Label("Result:");
        resultLabel.setBounds(30, 100, 200, 20);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultLabel, '+');
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultLabel, '-');
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultLabel, '*');
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performOperation(num1Field, num2Field, resultLabel, '/');
            }
        });

        frame.add(num1Field);
        frame.add(num2Field);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);

        // frame.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(3);
        // Corrected line
        frame.setVisible(true);
    }

    private static void performOperation(TextField num1Field, TextField num2Field, Label resultLabel, char operator) {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultLabel.setText("Error: Division by zero");
                        return;
                    }
                    break;
            }

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Error: Invalid input");
        }
    }
}
