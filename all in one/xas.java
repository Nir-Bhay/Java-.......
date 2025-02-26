import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class xas extends Frame {
    private TextField displayField;
    private double currentInput;
    private String selectedOperator;
    private boolean startNewInput;

    public xas() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setLayout(new BorderLayout());

        displayField = new TextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : buttonLabels) {
            Button button = new Button(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);

        startNewInput = true;
        currentInput = 0.0;
        selectedOperator = "";

        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button source = (Button) e.getSource();
            String buttonText = source.getLabel();

            switch (buttonText) {
                case "=":
                    calculateResult();
                    break;
                case ".":
                    handleDot();
                    break;
                default:
                    handleDigitOrOperator(buttonText);
                    break;
            }
        }

        private void calculateResult() {
            try {
                double input = Double.parseDouble(displayField.getText());
                switch (selectedOperator) {
                    case "+":
                        currentInput += input;
                        break;
                    case "-":
                        currentInput -= input;
                        break;
                    case "*":
                        currentInput *= input;
                        break;
                    case "/":
                        if (input != 0) {
                            currentInput /= input;
                        } else {
                            displayField.setText("Error");
                            return;
                        }
                        break;
                    default:
                        currentInput = input;
                        break;
                }

                displayField.setText(Double.toString(currentInput));
                startNewInput = true;
            } catch (NumberFormatException ex) {
                displayField.setText("Error");
            }
        }

        private void handleDot() {
            if (startNewInput) {
                displayField.setText("0.");
                startNewInput = false;
            } else if (displayField.getText().indexOf('.') == -1) {
                displayField.setText(displayField.getText() + ".");
            }
        }

        private void handleDigitOrOperator(String buttonText) {
            if (startNewInput) {
                displayField.setText(buttonText);
                startNewInput = false;
            } else {
                displayField.setText(displayField.getText() + buttonText);
            }

            if (!buttonText.equals("=") && !buttonText.equals(".")) {
                selectedOperator = buttonText;
            }
        }
    }

    public static void main(String[] args) {
        new xas();
    }
}
