import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyKeyListener implements KeyListener {
    private JLabel outputLabel;

    public MyKeyListener(JLabel outputLabel) {
        this.outputLabel = outputLabel;
    }

    public void keyPressed(KeyEvent event) {
        outputLabel.setText("Key Pressed: " + event.getKeyChar());
    }

    public void keyReleased(KeyEvent event) {
        outputLabel.setText("Key Released");
    }

    public void keyTyped(KeyEvent event) {
        outputLabel.setText("Key Typed");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Key Events Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel outputLabel = new JLabel("Press a key");
        frame.add(outputLabel);

        MyKeyListener keyListener = new MyKeyListener(outputLabel);
        frame.addKeyListener(keyListener);
        frame.setFocusable(true);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}