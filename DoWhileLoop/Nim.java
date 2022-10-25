import java.util.*;

public class Nim
{
    public static void main ( String[] args )
    {
        try (Scanner keyboard = new Scanner(System.in)) {
            int pileA = 3;
            int pileB = 4;
            int pileC = 5;
            int turns = 0;
            int removal = 0;
            String player1;
            String player2;
            String currentPlayer = "";

            System.out.println( "Player 1 enter your name" );
            player1 = keyboard.nextLine();
            System.out.println( "Player 2 enter your name" );
            player2 = keyboard.nextLine();

            while ( pileA > 0 || pileB > 0 || pileC > 0)
            {
                if (turns %2 == 0)
                {
                    currentPlayer = player1;
                }
                else if (turns %2 > 0)
                {
                    currentPlayer = player2;
                }
                System.out.println("\r\nA: ");
                for (int i = 0; i < pileA; i++)
                {
                    System.out.println("*");
                }
                System.out.println("\r\nB: ");
                for (int i = 0; i < pileB; i++)
                {
                    System.out.println("*");
                }
                System.out.println("\r\nC: ");
                for (int i = 0; i < pileC; i++)
                {
                    System.out.println("*");
                }
                System.out.println();
                System.out.println("\r\n" + currentPlayer + ", choose a pile: " );
                String choice = keyboard.nextLine();

                while (choice.equals("A") && pileA <= 0)
                {
                    System.out.println( "Nice try," + currentPlayer + ". That pile is empty. Choose again: " );
                    choice = keyboard.nextLine();
                }
                while (choice.equals("B") && pileB <= 0)
                {
                    System.out.println( "Nice try," + currentPlayer + ". That pile is empty. Choose again: " );
                    choice = keyboard.nextLine();
                }
                while (choice.equals("C") && pileC <= 0)
                {
                    System.out.println( "Nice try," + currentPlayer + ". That pile is empty. Choose again: " );
                    choice = keyboard.nextLine();
                }
                
                System.out.println( "How many to remove from pile " + choice + ": ");
                removal = keyboard.nextInt();
                if (choice.equals("A"))
                {
                    while(removal > pileA)
                    {
                        System.out.println( "Pile A doesn't have that many. Try again: ");
                        removal = keyboard.nextInt();
                    }
                        pileA = pileA - removal;
                }
                else if (choice.equals("B"))
                {
                    while(removal > pileB)
                    {
                        System.out.println( "Pile B doesn't have that many. Try again: ");
                        removal = keyboard.nextInt();
                    }
                        pileB = pileB - removal;
                }
                else if (choice.equals("C"))
                {
                    while(removal > pileC)
                    {
                        System.out.println( "Pile C doesn't have that many> try agian: ");
                        removal = keyboard.nextInt();
                    }
                        pileC = pileC - removal;
                }

                keyboard.nextLine();
                ++turns;

                if (pileA + pileB + pileC == 1 && currentPlayer.equals(player1))
                {
                   System.out.println("\r\nA: ");
                   for (int i =0; i < pileA; i++)
                   {
                    System.out.println("*");
                   }
                   System.out.println("\r\nB: ");
                   for (int i = 0; i < pileB; i++)
                   {
                    System.out.println("*");
                   }
                   System.out.println("\r\nC: ");
                   for (int i = 0; i < pileC; i++)
                   {
                    System.out.println("*");
                   }
                   System.out.println();
                   System.out.println();

                   System.out.println(player2 + ", you must take the last remaining counter, so you lose. " + player1 + "wins!");
                   break;
                }
                else if (pileA+pileB+pileC==1 && currentPlayer.equals(player2))
                {
            		System.out.print("\r\nA: ");
            		for (int i = 0; i<pileA;i++)
                    {
            			System.out.print("*");
            		}
            		System.out.print("\r\nB: ");
            		for (int i = 0; i<pileB;i++)
                    {
            			System.out.print("*");
            		}
            		System.out.print("\r\nC: ");
            		for (int i = 0; i<pileC;i++)
                    {
            			System.out.print("*");
            		}
            		System.out.println();
            		System.out.println();
                    
                    System.out.println(player1+", you must take the last remaining counter, so you lose. "+player2+" wins!");
                    break;
                }
                if(pileA<=0 && pileB <= 0 && pileC <= 0) 
                {
                    if (currentPlayer.equals(player1))
                    {
                        System.out.print("\r\n"+player1+", there are no counters left, so you WIN!");
                    }
                    else if(currentPlayer.equals(player2))
                    {
                        System.out.print("\r\n"+player2+", there are no counters left, so you WIN!");
                    }
                }    
            }
        } 
    }
}