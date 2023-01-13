package ForLoop;
import java.util.Scanner;

public class CountingMachine {
    public static void main( String[] args ){
        Scanner keyboard = new Scanner(System.in);5
        System.out.print( "How many times? " );
        int num = keyboard.nextInt();
        for(int i=0; i<=num; i++){
            System.out.print(i);
        }
    }
}
