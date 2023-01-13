public class Main {
    public static void main(String[] args) {
        System.out.println("hihi");
        Rectangle rec1= new Rectangle(10, 15);
        Rectangle rec2= new Rectangle(4, 9);
        Rectangle rec3= new Rectangle(20, 29);
        System.out.println(rec1.getWidth()+" and "+rec1.getHeight());
        System.out.println(rec1);
        System.out.println(rec2);
        System.out.println(rec3);
        System.out.println("Pec1 area is: " +rec1.getArea());
        System.out.println("Pec1 area is: " +rec2.getArea());
        System.out.println("Pec1 area is: " +rec3.getArea());
    }
}
