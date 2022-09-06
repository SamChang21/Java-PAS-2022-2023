import java.util.Scanner;
public class statistics {
    public static void main( String[] args )
    {
        Scanner kb= new Scanner(System.in);
        int g1, g2, g3, sum;
        double average,variance, StandardDeviation;
        
        System.out.println( "enter grade 1:" );
        g1=  kb.nextInt();
        System.out.println( "enter grade 2:" );
        g2=  kb.nextInt();
        System.out.println( "enter grade 3:" );
        g3=  kb.nextInt();
        sum= g1+g2+g3;
        average = (double) sum/3;
        variance = (Math.pow(grade1-average,2)+Math.pow(grade2-average,2)+Math.pow(grade3-average,2))/3;
        StandardDeviation = Math.sqrt(variance);
        System.out.println("Average = "+average);
        System.out.println("Variance = "+variance);
        System.out.println("Standard deviation = "+StandardDeviation);
        kb.close();

        kb.close();
    }
}
