import java.util.Scanner;
public class TwentyQuestions{
	public static void main(String[] args){
	try (Scanner keyboard = new Scanner(System.in)) {
		String answer="";
		String answer1="";
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it.");
		System.out.println();
		System.out.println("Question 1) Is it animal, vegetable, or mineral?");
		System.out.print("> ");
		answer=keyboard.next();
		System.out.println();
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		answer1=keyboard.next();
		System.out.println();
		if(answer1.equals("yes")){
			if(answer.equals("animal")){
				System.out.println("My guess is that you are thinking of a moose.");
			}else if(answer.equals("vegetable")){
				System.out.println("My guess is that you are thinking of a watermelon.");
			}else if(answer.equals("mineral")){
				System.out.println("My guess is that you are thinking of a Camaro.");
			}

		}else if(answer1.equals("no")){
			if(answer.equals("animal")){
				System.out.println("My guess is that you are thinking of a squirrel.");
			}else if(answer.equals("vegetable")){
				System.out.println("My guess is that you are thinking of a carrot.");
			}else if(answer.equals("mineral")){
				System.out.println("My guess is that you are thinking of a paper clip.");
			}
		}
	}
	System.out.println("I would ask you if I'm right, but I don't actually care.");
	}
}