import java.util.Scanner;

public class evenorodd {
    public static void main(String[]args) {

        int number;
        //ask user for integer input
        System.out.println("Please enter a number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        //statement to determine evenness
        if (number % 2 == 0)
            System.out.println("The number you have entered is even.");

        //statement to determine oddness
        else
            System.out.println("The number you have entered is odd.");
    }
}
