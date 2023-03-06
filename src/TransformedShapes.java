import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class TransformedShapes extends JFrame {

    private TransformedShapes() {
        setTitle("Transformed Shape");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        var g2 = (Graphics2D) g;

        var circle = new Ellipse2D.Double(50, 50, 300, 300);
        g2.setColor(Color.BLACK);
        g2.fill(circle);

        var square = new Rectangle2D.Double(125, 125, 150, 150);
        g2.setColor(Color.YELLOW);
        g2.fill(square);
    }

    public static void main(String[] args) {
        new TransformedShapes();
    }
}