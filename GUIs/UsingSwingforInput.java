import javax.swing.JOptionPane;

public class UsingSwingforInput 
{
    public static void main( String[] arg )
    {
        String name = JOptionPane.showInputDialog("What is yout name?");
        String input = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(input);

        System.out.println( "Hello, " + name + "." );
        System.out.println( "Next year, you'll be " + (age+1) );
        System.exit(0);
    }

}