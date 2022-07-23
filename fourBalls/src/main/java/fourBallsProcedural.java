import processing.core.PApplet;

public class fourBallsProcedural extends PApplet {

    public static final int width = 640;
    public static final int height = 480;
    public static final int diameter = 20;
    public static final int Y_positionOne = height/ 5;
    public static final int Y_positionTwo = height * 2/ 5;
    public static final int Y_positionThree = height * 3/ 5;
    public static final int Y_positionFour = height * 4 / 5;
    int firstBallSpeed = 0;
    int secBallSpeed = 0;
    int thirdBallSpeed = 0;
    int fourBallSpeed = 0;


    public void settings() {
        super.settings();
        size(width, height);
    }

    public void setup() {
        super.setup();
    }

    public void draw() {
        ellipse(firstBallSpeed++, Y_positionOne, diameter, diameter);
        ellipse(secBallSpeed+=2, Y_positionTwo, diameter, diameter);
        ellipse(thirdBallSpeed+=3, Y_positionThree, diameter, diameter);
        ellipse(fourBallSpeed+=4, Y_positionFour, diameter, diameter);
    }

    public static void main(String[] args) {
        PApplet.main("fourBallsProcedural", args);
    }
}