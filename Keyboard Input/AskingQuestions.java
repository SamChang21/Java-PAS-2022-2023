import java.util.Scanner;
public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age= 17;
		int feets= 5;
		int inches= 6;	
		double weight= 53;
		

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.next();

		System.out.print( "And how many inches " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feets+ " ' " +inches+ " tall and " + weight + " heavy." );
	}
}
