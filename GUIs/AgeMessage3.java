package gui;
import java.util.Scanner;

public class AgeMessage3 
{
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.print( "Your name:" );   
        String name = scanner.next();
        System.out.print( "Your age:" );   
        int age = scanner.nextInt();

        if (age < 16)
        {
            System.out.print( "You can't drive " +name+ "." );   
        }
        if (age >= 16 && age <= 17 )
        {
            System.out.print( "You can drive but not vote " +name+ "." );   
        }
        if (age >= 18 && age <= 24 )
        {
            System.out.print( "You can vote but not rent a car "+name+ ".");  
        }
        if (age >= 24 )
        {
            System.out.print( "You can do pretty much anything" +name+ ".");  
        }
        scanner.close();
    }
}
