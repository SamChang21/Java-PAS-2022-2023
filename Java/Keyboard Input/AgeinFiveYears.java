import java.util.Scanner;
public class AgeinFiveYears {
        public static void main( String[] args )
    {
    Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        int younger;
        int older;

        System.out.print( "Hello.  What is your name?" );
		name = keyboard.nextLine();
        System.out.print( "Hi, " + name + "!  How old are you?" );
		age = keyboard.nextInt();

        older= age+5;
        System.out.print( "Did you know that in five years you will be" + older + "years old?" );
        younger= age-5;
        System.out.print( "And five years ago you were" + younger + "! Imagine that!" );
        keyboard.close();
    }

}
