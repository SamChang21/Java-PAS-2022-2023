import java.util.Scanner;
public class TheForgetfulMachine {
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		String firstword;
		String secondword;
		int firstnumber;	
		double secondnumber;
		
		System.out.print( "Give me a word!" );
		firstword = keyboard.nextLine();

		System.out.print( "Give me a second word!" );
		secondword = keyboard.nextLine();

		System.out.print( "Great, now your favorite number?" );
		firstnumber = keyboard.nextInt();

		System.out.print( "And your second-favorite number..." );
		secondnumber = keyboard.nextDouble();

		System.out.println( "Whew!  Wasn't that fun?" );
		keyboard.close();
	}
}
