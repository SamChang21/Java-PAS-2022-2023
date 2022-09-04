import java.util.Scanner;
public class TheForgetfulMachine {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String firstword= "lorry!";
		String secondword= "deoxyribonucleic?";
		int firstnumber= 42;	
		double secondnumber= 1;
		

		System.out.print( "How old are you? " );
		age = keyboard.nextSting();

		System.out.print( "How many feet tall are you? " );
		height = keyboard.next();

		System.out.print( "And how many inches " );
		height = keyboard.next();

		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feets+ " ' " +inches+ " tall and " + weight + " heavy." );
	}
}
