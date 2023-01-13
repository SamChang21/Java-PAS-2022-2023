//import library gere 
//import library random number  
import java.util.Random;
import java.util.Scanner;
public class MathGame3{
    public static void main(String[] args) {
        display_intro();
        //call display_menu function
        display_menu();
        int choice =get_user_input();
        int count =0;
        //System.out.println("Your choice is "+choice);
        //call menu option function
        //System.out.println(menu_option(choice,count)); 
        //test get_user_solution
        //System.out.println(get_user_solution("2+45"));
        int total=0;
        int correct_ans=0;
        while(choice !=5){
            total = total+1;
            correct_ans = menu_option(choice, correct_ans);
            choice = get_user_input();
        }
        display_function(total,correct_ans);
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
        System.out.println(prob+ " ");
        System.out.println("Enter your solution");
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
            System.out.println("Your imput number is invalid! Please enter a value from 1 to 5!");

            System.out.println("Enter your choice");
            userChoice = kb.nextInt();
        }
        //return the userChoice 
        return userChoice;
    }
    //creat a function menu_option
    public static int menu_option(int index,int count){
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
            count = check_solution(user_silution, true_solution,count);
            //add in a line here
            System.out.println("Enter your choice!");
        }
        else if(index ==2){
            System.out.println("You are Selecting Subtraction");
        }else if (index ==3){
            System.out.println("Multiplication");
        }else if (index ==4){
            System.out.println("Division!");
        }
        return count;
    }
    public static int check_solution (int my_user_solution,int my_true_solution, int count){
        if(my_user_solution== my_true_solution){
            System.out.println("You are CORRECT!");
            count = count+1;
        }
        else{
            System.out.println("Addition is not your friend! do more praactice" );
        }
        return count;
    }
    public static void display_intro(){
        System.out.println("welcome ti Jennifer's math game");
        System.out.println("###############################");
        System.out.println("Game rules");
    } 
    //create a display menu function
    public static void display_menu(){
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }
}
