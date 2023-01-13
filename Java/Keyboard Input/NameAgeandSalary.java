import java.util.Scanner;
public class NameAgeandSalary 
{
    public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String earn;

        System.out.print( "Hello. What is your name?" );
        name= keyboard.nextLine();
        System.out.print( "Hi, "+ name+ "!  How old are you?" );
        age= keyboard.nextInt();
        System.out.print( "So you're"+ age +", eh? That's not old at all! How much do you make,"+ name +"?" );
        earn= keyboard.nextLine();
        System.out.print(  " "+earn +"! I hope that's per hour and not per year! LOL!" );
        keyboard.close();
    }
    
}
