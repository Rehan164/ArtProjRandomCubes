import java.awt.*;

public class RandomCubes {

    public void cube(Graphics2D g2){

        int[] xListSideOne = {};
        int[] yListSideOne = {};
        int[] xListSideTwo = {};
        int[] yListSideTwo = {};
        int[] xListSideThree = {};
        int[] yListSideThree = {};

        Color blackRGB = new Color(58, 58, 61);
        g2.setStroke(new BasicStroke(2));
        //Color Palette
        Color frontCyan = new Color(104, 216, 254);
        Color sideCyan = new Color(120, 200, 236);

        Color frontBlue = new Color(30, 29, 104);
        Color sideBlue = new Color(48, 65, 182);

        Color frontPurple = new Color(62, 34, 109);
        Color sidePurple = new Color(102, 57, 174);

        Color frontPink = new Color(123, 105, 165);
        Color sidePink = new Color(136, 115, 168);

        Color frontTurquoise = new Color(38, 93, 132);
        Color sideTurquoise = new Color(18, 45, 64);

        int w = 11;
        int h = 10;

        for (int i = 0; i < 300; i++) {
            int x = (int)(Math.random()*400) + 150;
            int y = (int)(Math.random() * 650) + 150;
            int SF = (int)(Math.random()*6) + 1;


            int angle = (int)(Math.random() * 360) + 1;

            g2.translate(x+(SF * w)/2,    y+(SF * h)/2);
            g2.rotate(Math.toDegrees(angle));

            int x1 = -(SF * w)/2;
            int y1 = -(SF * h)/2;

            //Side One
            xListSideOne = new int[]{x1, x1, x1 + SF * (8), x1 + SF * (8)};
            yListSideOne = new int[]{y1, y1 + SF * (8), y1 + SF * (8), y1};

            //Side Two
            xListSideTwo = new int[]{x1 + SF * (8), x1 + SF * (8), x1 + SF * (11), x1 + SF * (11)};
            yListSideTwo = new int[]{y1, y1 + SF * (8), y1 + SF * (6), y1 - SF * (2)};

            //Side Three
            xListSideThree = new int[]{x1, x1 + SF * (8), x1 + SF * (11), x1 + SF * (3)};
            yListSideThree = new int[]{y1, y1, y1 - SF * (2), y1 - SF * (2)};

            Color randomColorFront;
            Color randomColorSide;
            int randomColorGen = (int)(Math.random()*5)+1;
            if (randomColorGen == 1){
                randomColorFront = frontCyan;
                randomColorSide = sideCyan;
            }
            else if (randomColorGen == 2){
                randomColorFront = frontBlue;
                randomColorSide = sideBlue;
            }
            else if (randomColorGen == 3){
                randomColorFront = frontPurple;
                randomColorSide = sidePurple;
            }
            else if (randomColorGen == 4){
                randomColorFront = frontPink;
                randomColorSide = sidePink;
            }
            else{
                randomColorFront = frontTurquoise;
                randomColorSide = sideTurquoise;
            }


            g2.setColor(randomColorFront);
            g2.fillPolygon(xListSideOne, yListSideOne, 4);
            g2.setColor(blackRGB);
            g2.drawPolygon(xListSideOne, yListSideOne, 4);
            g2.setColor(randomColorSide);
            g2.fillPolygon(xListSideTwo, yListSideTwo, 4);
            g2.setColor(blackRGB);
            g2.drawPolygon(xListSideTwo, yListSideTwo, 4);
            g2.setColor(randomColorSide);
            g2.fillPolygon(xListSideThree, yListSideThree, 4);
            g2.setColor(blackRGB);
            g2.drawPolygon(xListSideThree, yListSideThree, 4);




            g2.rotate(-Math.toDegrees(angle));
            g2.translate(-(x+(SF * w)/2), -(y+(SF * h)/2));
        }



    }

}
