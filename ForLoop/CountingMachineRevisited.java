package ForLoop;
import java.util.Scanner;

public class CountingMachineRevisited {
    public static void main( String[] args ){
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Count to? " );
        int num3 = keyboard.nextInt();
        System.out.print( "Count from? " );
        int num1 = keyboard.nextInt();
        System.out.print( "Count by? " );
        int num2 = keyboard.nextInt();
        for(int i=num1; i<=num3; i+=num2){
            System.out.print(i);
        }
    }
}