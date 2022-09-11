import java.util.Scanner;
public class BMICalculator {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int height;
        int weight;
        int BMI;

        System.out.print( "Your height in m:" );
        height= keyboard.nextInt();
        System.out.print( "Your weight in kg:" );
        weight= keyboard.nextInt();

        BMI = weight/(height*height);

        System.out.print( "Your BMI is :" +BMI+".");
        
        keyboard.close();

    }
    

}
