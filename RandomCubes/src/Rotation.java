import java.awt.*;

public class Rotation {
    private int x, y, w, h, angle;

    public Rotation(int x, int y, int w, int h, int angle) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.angle = angle;
    }

    public void draw(Graphics2D g2){

        //Rotates around the center of the rectangle.
        g2.translate(x+w/2, y+h/2); //shift the origin to the center of our rect
        g2.rotate(Math.toDegrees(angle));   //rotate the entire panel.
        g2.drawRect(-w/2,-h/2, w, h);   //draw our shape (note NOT at x, y)
        g2.rotate(-Math.toDegrees(angle));  //put the panel back
        g2.translate(-(x+w/2), -(y+h/2));   //put the origin back
        g2.translate(x+w/2, y+h/2); //shift the origin to the center of our rect
        g2.rotate(Math.toDegrees(angle + 20));   //rotate the entire panel.
        g2.drawRect(-w/2,-h/2, w, h);   //draw our shape (note NOT at x, y)
        g2.rotate(-Math.toDegrees(angle + 20));  //put the panel back
        g2.translate(-(x+w/2), -(y+h/2));   //put the origin back
    }


}
