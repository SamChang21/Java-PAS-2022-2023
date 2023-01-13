package ForLoop;
import java.util.Scanner;

public class CountingWithaForLoop {
    

public class CountingFor
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times." );
        System.out.print( "Message: " );
        String message = keyboard.nextLine();

        for ( int n = 1 ; n <= 10 ; n = n+1 )
        {
            if(n%2==0)
            System.out.println( n + ". " + message );
        }

    }
}

}
