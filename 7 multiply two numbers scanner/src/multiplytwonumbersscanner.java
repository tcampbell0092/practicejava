import java.util.Scanner;

public class multiplytwonumbersscanner {
    public static void main(String[]args) {

        //set status and allow for scanning
        Scanner scan = new Scanner(System.in);

        //user input for first number
        System.out.print("Enter first number: ");
        double num1 = scan.nextDouble();

        //user input for second number
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();

        //close scanner after use
        scan.close();

        //calculate product of two numbers
        double product = num1 * num2;

        //print out product
        System.out.println("Product: " + product);
    }
}
