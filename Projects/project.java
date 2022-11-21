import java.util.Scanner;
    
import java.util.Random;
        
public class project {

    public static void main( String[] args ) {
        question();
    }
    public static void question()
	  {
        Scanner keyboard = new Scanner(System.in);

        Random r = new Random();

        int guess, number, tries;
        String answer;
        number = 1 + r.nextInt(100);
        System.out.println( "I have chosen a number between 1 and 100." );
        tries = 0;
        System.out.println( "Do you want to play NUmber Guessing game?" ); 
        answer = keyboard.next(); 
        if(answer.equals("yes")){
          do {
              System.out.print( "Your guess?" );
              guess = keyboard.nextInt();
              tries++;
              if  ( guess < number) {
                  System.out.println( "Number is bigger." );
              }
              else if  ( guess > number) {
                  System.out.println( "Number is smallar." );
              }
          } while ( guess != number );
          System.out.println( "That's right!" );
          System.out.println( "It took you " + tries + " tries." );
          keyboard.close();
        }
        else{
          System.out.println( "Thank you for answering" );
        }
        
	  }
}