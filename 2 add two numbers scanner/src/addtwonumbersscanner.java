import java.util.Scanner;
public class addtwonumbersscanner {
    public static void main(String[]args) {

        //sets integer status for numbers and allows scanning
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);

        //asks user input for number 1
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        //asks user input for number 2
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        //function to add num1 and num2 together then prints out sum
        sc.close();
        sum = num1 + num2;
        System.out.println("Sum of these numbers: " + sum);
    }
}

