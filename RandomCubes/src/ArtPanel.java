import javax.swing.*;
import java.awt.*;

public class ArtPanel extends JPanel {

    public ArtPanel(int width, int height) {
        setSize(width, height);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;

        RandomCubes randomCubes = new RandomCubes();
        Portal portal = new Portal();
        Gradient gradient = new Gradient();

        gradient.LineGradient(g2);
        portal.drawPortal(g2);
        randomCubes.cube(g2);

    }

}