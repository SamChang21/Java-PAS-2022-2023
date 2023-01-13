import java.util.Random;
import java.util.Scanner;
public class MathGame{
    public static void main(String[] args) {
        display_intro();
        //no return 
        display_menu();
        //return a interget
        int choice = get_user_input();
        System.out.println("your choice is "+choice);
        System.out.println(menu_option(choice,0));
    }
    //print intro
    public static void display_intro() 
    {
        System.out.println( "Welcome to Sam's math game");
        System.out.println("****************************");
        System.out.println( "Game rules:");
        System.out.println( "Game rules:");
        System.out.println( "Game rules:");
        System.out.println( "Game rules:");
    }
    
    //create a menu of different calculation methodes
    public static void display_menu() 
    {
        System.out.println( "1. Addition");
        System.out.println( "2. Subtraction");
        System.out.println( "3. Multiplication");
        System.out.println( "4. Division");
        System.out.println( "5. Exit");
    }

    //get user's input
    public static int get_user_input(){
        try (Scanner kb = new Scanner(System.in)) {
            int UserChoice = kb.nextInt();
            while(UserChoice>5 || UserChoice<=0){
                System.out.println( "Your input number is invalid! Please enter a calue from 1 to 5!!!");
                System.out.println( "Enter yor choice again");
                UserChoice = kb.nextInt();
            }
            return UserChoice;
        }
    }

    //store type of question 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Exit
    public static int menu_option(int index, int count){
        Random r = new Random();
        int min = 0;
        int max = 100;
        int number_1 = r.nextInt(max-min)+min;
        int number_2 = r.nextInt(max-min)+min;
        return count;
    }

    // get user's solution
    public static int get_user_solution(String prob){
        System.out.println( prob+"");
        System.out.println( "Enter yor solution");
        Scanner kb2 = new Scanner(System.in);
        int usersolution = kb2.nextInt();
        return usersolution;
    }
}

