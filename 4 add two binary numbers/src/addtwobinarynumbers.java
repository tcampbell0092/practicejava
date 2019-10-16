import java.util.Scanner;

public class addtwobinarynumbers {
    public static void main(String[]args)
    {
        //storage for binary integers
        long bin1, bin2;
        int i = 0, carry = 0;

        //binary number for output
        int[] sum = new int[10];

        //scanner to read input from user
        Scanner scanner = new Scanner(System.in);

        //user input for 1st binary number
        System.out.println("Enter first binary number: ");
        bin1 = scanner.nextLong();

        //user input for 2nd binary number
        System.out.println("Enter second binary number: ");
        bin2 = scanner.nextLong();

        //avoiding memory leak for resource management
        scanner.close();

        //carry out adding operations
        while (bin1 !=0 || bin2 !=0)
        {
            sum[i++] =  (int)((bin1 % 10 + bin2 % 10 + carry) % 2);
            carry = (int)((bin1 % 10- + bin2 % 10 + carry) / 2);
            bin1 = bin1 / 10;
            bin2 = bin2 / 10;
        }
        //carry over the sum if the carry does not equal 0
        if (carry != 0)
        {
            sum[i++] =  carry;
        }
        i--;

        //output addition of the two binary numbers
        System.out.print("Output: ");
        while (i >=0)
        {
            System.out.print(sum[i--]);
    }
        System.out.print("\n");
    }
}

