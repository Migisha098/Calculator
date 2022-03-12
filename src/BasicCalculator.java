import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicCalculator {
    public static void main(String[] args) throws IOException {

        float firstNumberMigisha ;
        float secondNumberMigisha;
        Float sum;
        float product;
        float substraction;
        Float quotient;

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println( " The program calculates sum,difference,product and quotient for two numbers");
        System.out.println(" Enter the first number (and press Enter) : ");
        firstNumberMigisha = Float.parseFloat(br.readLine());
        System.out.println( " Enter the second number (and press Enter)");
        secondNumberMigisha = Float.parseFloat(br.readLine());

        sum = firstNumberMigisha + secondNumberMigisha;
        substraction = firstNumberMigisha -secondNumberMigisha;
        product = firstNumberMigisha * secondNumberMigisha;
        quotient = firstNumberMigisha / secondNumberMigisha;

        System.out.printf(" you entered two numbers , the first is :" + " %2.2f" , firstNumberMigisha);
        System.out.printf(" and the second is :" + " %2.2f",secondNumberMigisha);

        System.out.println(); // blank line

        System.out.printf(" Sum = " + "%2.2f , \n" ,+ sum);
        System.out.printf(" difference  = " + "%2.2f , \n" ,+ substraction);
        System.out.printf( " Product = " + " %2.2f , \n" ,+ product );
        System.out.printf ( " Quotient = " + " %2.2f ,\n " , + quotient);
    }
}