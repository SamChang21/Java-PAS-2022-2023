import java.util.Random;

public class FortuneCookie
{
	public static void main( String[] args )
	{
		Random r = new Random();
		
		int num1 = 1 + r.nextInt(54);
		int num2 = 1 + r.nextInt(54);
		int num3 = 1 + r.nextInt(54);
		int num4 = 1 + r.nextInt(54);
		int num5 = 1 + r.nextInt(54);
		int num6 = 1 + r.nextInt(54);
		
		int fortune_val = 1 + r.nextInt(6);
		String fortune_msg;
		
		if ( fortune_val == 1 )
			fortune_msg = "You are going to find lots of money in the parking lot.";
		else if ( fortune_val == 2 )
			fortune_msg = "Don't drive home tonight. Take a walk!";
		else if ( fortune_val == 3 )
			fortune_msg = "Mirrors only lead to vanity. Smash them all.";
		else if ( fortune_val == 4 )
			fortune_msg = "When the wind blows west and the crow flies east. That is when you should head to the bathroom.";
		else if ( fortune_val == 5 )
			fortune_msg = "Stop eating so much Chinese food. It's full of MSG.";
		else if ( fortune_val == 6 )
			fortune_msg = "Help! Trapped in fortune cookie factory!!";
		else
			fortune_msg = "You have no fortune...lmao";
		
		System.out.println( " Fortune cookie says: " + fortune_msg );
		System.out.println( "\t" + num1 + " - " + num2 + " - " + num3 + " - " + num4 + " - " + num5 + " - " + num6 );
	}
}
