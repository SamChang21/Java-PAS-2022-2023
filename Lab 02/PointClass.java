public class PointClass {
    private int dx;
    private int dy;
    public PointClass(int MyDX, int MyDY){
        dx=MyDX;
        dy=MyDY;
    }
    public void move(){
        dx=dx+5;
        dy=dy+10;
    }
    public String toString(){
        return "Location of point is "+dx+" and "+dy;
    }
    public int getDX(){
        return dx;
    }
    public int getDY(){
        return dx;
    }
}