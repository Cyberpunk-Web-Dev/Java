import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterClassExample extends JFrame {
    public AdapterClassExample() {
        setTitle("Adapter Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addWindowListener(new MyWindowAdapter()); // Using the custom adapter class

        setVisible(true);
    }

    // Custom WindowAdapter class
    private static class MyWindowAdapter extends WindowAdapter {
       // @Override
        public void windowClosing(WindowEvent e) {
            // Display a confirmation dialog when the window is being closed
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdapterClassExample::new);
    }
}