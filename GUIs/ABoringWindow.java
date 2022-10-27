import javax.swing.*;

public class ABoringWindow extends JFrame
{
    public static void main( String[] arsg )
    {
        JFrame f = new ABoringWindow ();
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}