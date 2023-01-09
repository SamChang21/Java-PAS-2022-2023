import java.util.Scanner;

import java.util.Random;
public class MathGameProject {
    public static void main(String[] args) {
    display_intro();
        //call display_menu function
        display_menu();
        int choice =get_user_input();
        int HPofDragon =10;
        //System.out.println("Your choice is "+choice);
        //call menu option function
        //System.out.println(menu_option(choice,count)); 
        //test get_user_solution
        //System.out.println(get_user_solution("2+45"));
        int total=0;
        while(choice !=5){
            total = total+1;
            HPofDragon = menu_option(choice, HPofDragon);
            if (HPofDragon==0) {
                System.out.print("Congratulation!!! You defeat the Dragon");
                System.exit(0);
            }
            choice = get_user_input();
        }
        display_function(total,HPofDragon);
        System.out.println("Exit the game");
        
    } 
    public static void display_function(int total_of_question, int total_of_correct){
        double accuracy =0.0;
        if(total_of_question > 0 && total_of_correct >0){
            accuracy = total_of_question/total_of_correct;
            System.out.println("You are answer "+ total_of_question + " questions");
            System.out.println("Your accuracy is "+ accuracy );
        }
    }
    //create a function get_user_solution
    public static int get_user_solution(String prob){
        System.out.println(prob+ "=");
        System.out.println("Complete the spell");
        Scanner kb2 = new Scanner(System.in);
        int userSolution = kb2.nextInt();
        return userSolution;
    }
    //create a function get_user_input
    //Ask player's answer 
    public static int get_user_input(){
        //create a scanner object
        Scanner kb= new Scanner(System.in);
        //ask user to key in 
        int userChoice = kb.nextInt();
        //create a while loop to control the user inpit 
        while (userChoice >5 || userChoice <=0){
            System.out.println("Your imput number is invalidtotal_of_correct Please enter a value from 1 to 5!");

            System.out.println("Enter your choice");
            userChoice = kb.nextInt();
        }
        //return the userChoice 
        return userChoice;
    }
    //creat a function menu_option
    public static int menu_option(int index,int HPofDragon){
        //create two random number 
        Random r = new Random();
        int min =0;
        int max =100;
        int number_one= r.nextInt(max-min)+min;
        int number_two= r.nextInt(max-min)+min;
        //System.out.println("Random number1 = "+ number_one);
        //System.out.println("Random number2 = "+ number_two);
        
        if(index ==1){
            String prob= number_one+ "+" +number_two;
            int true_solution = number_one + number_two;
            int user_silution = get_user_solution(prob);
            HPofDragon = check_solution(user_silution, true_solution,HPofDragon);
            //add in a line here
            System.out.println("Enter your choice!");
        }
        else if(index ==2){
            System.out.println("You are Selecting Subtraction");
            String prob= number_one+ "-" +number_two;
            int true_solution = number_one - number_two;
            int user_silution = get_user_solution(prob);
            HPofDragon = check_solution(user_silution, true_solution,HPofDragon);
            //add in a line here
            System.out.println("Enter your choice!");
        }else if (index ==3){
            System.out.println("Multiplication");
            String prob= number_one+ "*" +number_two;
            int true_solution = number_one * number_two;
            int user_silution = get_user_solution(prob);
            HPofDragon = check_solution(user_silution, true_solution,HPofDragon);
            //add in a line here
            System.out.println("Enter your choice!");
        }else if (index ==4){
            System.out.println("Division!");
            String prob= number_one+ "/" +number_two;
            int true_solution = number_one / number_two;
            int user_silution = get_user_solution(prob);
            HPofDragon = check_solution(user_silution, true_solution,HPofDragon);
            //add in a line here
        }
        return HPofDragon;
    }
    public static int check_solution (int my_user_solution,int my_true_solution, int HPofDragon){
        if(my_user_solution== my_true_solution){
            System.out.println("Attack!!!");
            HPofDragon = HPofDragon-1;
            
            System.out.println("HP of Dragon: "+HPofDragon);
        }
        else{
            System.out.println("Addition is not your friend! do more praactice" );
        }
        return HPofDragon;
    }
    public static void display_intro(){
        System.out.println("welcome wizard! Our mission is to defeat the Dragon! Here are the spells that can cause effective damage to the Dragon. Please complete the spells in order to attack");
        System.out.println("Chooce one kind of spell below and start attack");
    } 
    //create a display menu function
    public static void display_menu(){
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Runaway!!!");
    }
}
