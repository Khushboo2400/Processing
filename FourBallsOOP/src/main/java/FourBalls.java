class Balls {
    int xAxisSpeed;
    int height;
    int radiusBall;

    Balls(int radius){
        this.radiusBall=radius;
    }
    public int getSpeed(int x){
        return xAxisSpeed+=x;
    }
    public int getHeight(int x,int windowHeight){
      return this.height=windowHeight *x/5;
    }
}