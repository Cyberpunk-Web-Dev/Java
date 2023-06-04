import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ShapeApplet extends Applet {
    private Color shapeColor;

    public void init() {
        shapeColor = Color.RED;
    }

    public void paint(Graphics g) {
        g.setColor(shapeColor);

        g.fillOval(50, 50, 100, 100);

        g.fillRect(200, 50, 100, 150);

        g.fillArc(350, 50, 100, 100, 45, 270);
    }

    public void setColor(String color) {
        if (color.equalsIgnoreCase("red")) {
            shapeColor = Color.RED;
        } else if (color.equalsIgnoreCase("green")) {
            shapeColor = Color.GREEN;
        } else if (color.equalsIgnoreCase("blue")) {
            shapeColor = Color.BLUE;
        } else if (color.equalsIgnoreCase("yellow")) {
            shapeColor = Color.YELLOW;
        } else if (color.equalsIgnoreCase("cyan")) {
            shapeColor = Color.CYAN;
        } else if (color.equalsIgnoreCase("magenta")) {
            shapeColor = Color.MAGENTA;
        } else if (color.equalsIgnoreCase("orange")) {
            shapeColor = Color.ORANGE;
        } else if (color.equalsIgnoreCase("pink")) {
            shapeColor = Color.PINK;
        } else if (color.equalsIgnoreCase("gray")) {
            shapeColor = Color.GRAY;
        } else {
            shapeColor = Color.BLACK;
        }

        repaint(); 
    }
}