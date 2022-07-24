import  processing.core.PApplet;

public class FourBallsChallenge extends PApplet {

    public  int HEIGHT = 640;
    public  int WIDTH = 640;
     int RADIUS1 = 25;
    Balls one = new Balls(RADIUS1);
    Balls two = new Balls(RADIUS1);
    Balls three = new Balls(RADIUS1);
    Balls four = new Balls(RADIUS1);

    public static void main(String[] args) {
        PApplet.main("FourBallsChallenge",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        ellipse(one.getSpeed(1), one.getHeight(1,HEIGHT), RADIUS1,RADIUS1);
        ellipse(two.getSpeed(2), two.getHeight(2,HEIGHT), RADIUS1,RADIUS1);
        ellipse(three.getSpeed(3), three.getHeight(3,HEIGHT), RADIUS1,RADIUS1);
        ellipse(four.getSpeed(4), four.getHeight(4,HEIGHT), RADIUS1,RADIUS1);
    }
    }
