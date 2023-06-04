import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DelegationEventExample {
    private JFrame frame;
    private JButton button;

    public DelegationEventExample() {
        frame = new JFrame("Delegation Event Example");
        button = new JButton("Click Me");

        // Register an ActionListener to the button
        button.addActionListener(new ButtonClickListener());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.add(button);
        frame.setVisible(true);
    }

    // ActionListener implementation for handling button click events
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            // This method will be called when the button is clicked
            JOptionPane.showMessageDialog(frame, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        // Create an instance of the DelegationEventExample class
        DelegationEventExample example = new DelegationEventExample();
    }
}