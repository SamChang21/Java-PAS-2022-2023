import java.util.Scanner;
public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age= 17;
		int height= "5'6";
		double weight= 53;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you? " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + height + " tall and " + weight + " heavy." );
	}
}
