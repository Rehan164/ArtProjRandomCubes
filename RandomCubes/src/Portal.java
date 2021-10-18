import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Portal {

    private final Shape oval = new Ellipse2D.Double(80, 110, 600, 100);

    public void drawPortal(Graphics2D g2){

        g2.setColor(new Color(33, 33, 33));
        g2.setStroke(new BasicStroke(12));
        g2.draw(oval);
        g2.setClip(oval);

        int blue = 0;
        int red = 0;
        int y = 100;


        for (int i = 0; i < 200; i++) {
            y += 4;
            blue += 4;
            red += 2;
            if (blue > 158) {
                blue = 158;
            }
            if (red > 99){
                red = 99;
            }
            g2.setColor(new Color(red, 0, blue));
            g2.fillRect(0 ,y,800,4);
        }

        RandomCubes randomCubes = new RandomCubes(75, 400, 50, 75);

        randomCubes.cube(g2);

        g2.setClip(0,0,800,800);

    }

}
