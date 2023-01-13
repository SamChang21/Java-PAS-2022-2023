
import java.util.Scanner;
public class MoreUserInputofData {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        String firstname;
        String lastname;
        int grade;
        int studentidnumber;
        String loginname;
        String GPA;

        System.out.print( "First name:" );
        firstname= keyboard.nextLine();
        System.out.print( "Last name:" );
        lastname= keyboard.nextLine();
        System.out.print( "Grade (9-12):" );
        grade= keyboard.nextInt();
        System.out.print( "Student ID:" );
        studentidnumber= keyboard.nextInt();
        System.out.print("Login:");
        loginname= keyboard.nextLine();
        System.out.print("GPA (0.0-4.0):");
        GPA= keyboard.nextLine();
        keyboard.close();

        System.out.print("Your information:");
        System.out.print("  Login:" +loginname+".");
        System.out.print("  ID:" + studentidnumber+ ".");
        System.out.print("  Name:" + firstname +"," + lastname+ ".");
        System.out.print("  GPA:" + GPA +".");
        System.out.print("  Grade:" + grade +".");
        
    }
}
