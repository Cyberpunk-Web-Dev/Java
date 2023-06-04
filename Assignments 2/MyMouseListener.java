import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyMouseListener implements MouseListener {
    private JLabel outputLabel;

    public MyMouseListener(JLabel outputLabel) {
        this.outputLabel = outputLabel;
    }

    public void mouseClicked(MouseEvent event) {
        outputLabel.setText("Mouse Clicked");
    }

    public void mousePressed(MouseEvent event) {
        outputLabel.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent event) {
        outputLabel.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent event) {
        outputLabel.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent event) {
        outputLabel.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Events Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel outputLabel = new JLabel("Move the mouse");
        frame.add(outputLabel);

        MyMouseListener mouseListener = new MyMouseListener(outputLabel);
        frame.addMouseListener(mouseListener);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}