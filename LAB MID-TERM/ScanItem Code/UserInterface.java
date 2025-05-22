import javax.swing.*;
import java.awt.event.*;

public class UserInterface {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Shopping Assistance");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter item name:");
        JTextField inputField = new JTextField(20);
        JButton scanButton = new JButton("Scan Item");
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(inputField);
        panel.add(scanButton);
        panel.add(new JScrollPane(resultArea));

        frame.add(panel);
        frame.setVisible(true);

        // Set up controller
        ScanController controller = new ScanController();

        scanButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = inputField.getText();
                String result = controller.scanItemWithReturn(input);
                resultArea.setText(result);
            }
        });
    }
}
