import java.util.Scanner;

import java.util.Random;

public class MathGame2 {
    public static void main(String[] args) {
        display_intro();
        //no return 
        display_menu();
        //return a interget
        int numCorrect=0;
        int choice = get_user_input();
        int count =0 ;
        System.out.println("your choice is "+choice);
        System.out.println(menu_option(choice,count));
    }
    //print intro
    public static void display_intro() 
    {
        System.out.println( "Welcome to Sam's math game");
        System.out.println( "****************************");
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
        Scanner kb = new Scanner(System.in);
        
            int UserChoice = kb.nextInt();
            while(UserChoice>5 || UserChoice<=0){
                System.out.println( "Your input number is invalid! Please enter a calue from 1 to 5!!!");
                System.out.println( "Enter yor choice again");
                UserChoice = kb.nextInt();
            }
            return UserChoice;
        
    }

    //store type of question 1. Addition 2. Subtraction 3. Multiplication 4. Division 5. Exit
    public static int menu_option(int index, int count){
        Random r = new Random();
        int min = 0;
        int max = 100;
        int number_1 = r.nextInt(max-min)+min;
        int number_2 = r.nextInt(max-min)+min;
        System.out.println("random number1:"+number_1);
        System.out.println("random number2:"+number_2);
        
        if (index == 1) {
        String prob = number_1+ "+"+number_2;
        int true_solution = number_1+number_2;
        int user_solution = get_user_solution(prob);
        count= check_solution(user_solution,true_solution,count);
        return count;
        }
        else if (index == 2) {
            System.out.println("Subtraction");
        }
        else if (index == 3) {
            System.out.println("Multiplication");
        }
        else if (index == 4) {
            System.out.println("Division");
        }
        else{
            System.out.println("You should choose 1 to 5 only");
        }
        return count;
    }

    //function to return the count
    public static int check_solution(int my_user_solution, int my_true_solution, int count){
        if (my_user_solution==my_true_solution) {
            System.out.println("You are correct! Well doe!");
            count=count+1;
        }
        else{
            System.out.println("Wrong! Proctice more!");
        }
        return count; 
    }
    // get user's solution
    public static int get_user_solution(String prob){
        System.out.println( prob+"");
        Scanner kb2 = new Scanner(System.in);
        System.out.println( "Enter yor solution");
        int usersolution = kb2.nextInt();
        return usersolution;
    }
}