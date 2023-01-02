public class Rectangle {
    private int Width;
    private int Height;

    public Rectangle(int myWidth, int myHeight ){
        Width=myWidth;
        Height=myHeight;
    }
    public int getWidth() {
        return Width;
    }
    public int getHeight() {
        return Height;
    }
    public String toString(){
        return "the Width: "+Width+" the Height: "+ Height;
    }
    public int getArea() {
        return Width*Height;
    }
}