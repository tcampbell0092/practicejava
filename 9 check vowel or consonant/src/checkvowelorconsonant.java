// imports scanner for user entry
import java.util.Scanner;
public class checkvowelorconsonant
{
    public static void main(String[]args) {
        // declares initial false value
        boolean isVowel = false;

        // ask for user input of character
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char ch=scanner.next().charAt(0);
        // ends scanning use
        scanner.close();
        //start switch case for vowels (upper & lower)
        switch (ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': isVowel = true;
        }
        if (isVowel){
        System.out.println(ch+ " is a Vowel.");
        }
        else {
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                System.out.println(ch + " is a Consonant.");
            else
                System.out.println("input is not a character.");
        }
    }
}
