import java.util.Scanner;
public class ADumbCalculator {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int result= (n1+n2+n3)/2;

        System.out.println("What is your first number?");
        n1= keyboard.nextInt();
        System.out.println("What is your second number?");
        n2= keyboard.nextInt();
        System.out.println("What is your third number?");
        n3= keyboard.nextInt();


        System.out.println(+n1+ "+" +n2+"+" + n3 + "/2 is" +result+ ".");
        keyboard.close();
    }
}
