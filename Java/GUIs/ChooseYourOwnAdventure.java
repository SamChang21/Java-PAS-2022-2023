package gui;
import java.util.Scanner;

public class ChooseYourOwnAdventure 
{
    public static void main( String[] args )
	{

        Scanner scanner = new Scanner(System.in);
		
        System.out.println( "WELCOME TO MITCHELL'S TINY ADVENTURE! " );   
        System.out.println( "You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"? " );   
        String room = scanner.next();
        if (room.equals("kitchen"))
        {
            System.out.print( "There is a long countertop with dirty dishes everywhere.  Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\". " );   
            String furniture = scanner.next();
            if (furniture.equals("refrigerator"))
            {
                System.out.print( "Inside the refrigerator you see food and stuff.  It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\") " );
                String choice = scanner.next();
                if (choice.equals("yes"))
                {
                    System.out.println( "You survived" ); 
                }
                else
                {
                    System.out.println( "You die of starvation... eventually." ); 
                }
            }
            else
            {
                System.out.print( "Inside the cabinet. you see jam. Would you like to eat some of the jam? (\"yes\" or \"no\")" );   
                String choice = scanner.next();
                if (choice.equals("yes"))
                {
                    System.out.println( "You survived" ); 
                }
                else
                {
                    System.out.println( "You die of starvation... eventually." ); 
                }
            }
        }
        else
        {
            System.out.print( "Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like to go?" );   
            String room2 = scanner.next();
            if (room2.equals("bedroom"))
            {
                System.out.print( "You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\") " );
                String choice = scanner.next();
                if (choice.equals("yes"))
                {
                    System.out.println( "good... " ); 
                }
                else
                {
                    System.out.println( "Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements." ); 
                }
            }
            else
            {
                System.out.print( "You are in a bathroom, would you like to open door? (\"yes\" or \"no\")" );   
                String choice = scanner.next();
                if (choice.equals("yes"))
                {
                    System.out.println( "very good..." ); 
                }
                else
                {
                    System.out.println( "Well, then I guess you'll never know what was in there.  Thanks for playing, I'm tired of making nested if statements. " ); 
                }
            }
        }
        scanner.close();
    }
} 
