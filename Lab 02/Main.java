public class Main {
    public static void main(String[] args) {
        PointClass point1= new PointClass(5, 6);
        PointClass point2= new PointClass(15, 16);
        System.out.println(point1);
        System.out.println(point2);
        point1.move();
        point2.move();
        System.out.println(point1.getDX());
        System.out.println(point2.getDX());
    }
    
}