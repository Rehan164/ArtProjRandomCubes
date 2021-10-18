import java.awt.*;

public class Gradient {

    public void LineGradient (Graphics2D g2){

        int blue = 232;
        int green = 232;
        int y = 0;


        for (int i = 0; i < 200; i++) {
            y += 4;
            blue -= (int)(1.5);
            green -= (int)(1.5);
            if (blue < 0 || green < 0){
                blue = 0;
                green = 0;
            }
            g2.setColor(new Color(8, green, blue));
            g2.fillRect(0,y,800,3);
        }

    }

}
