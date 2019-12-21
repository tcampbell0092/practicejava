public class chartostring {
    public static void main(String []args)
    {
        // method 1: Using toString() method
        char ch = 'a';
        String str = Character.toString(ch);
        System.out.println("String is: " + str);

        // method 2: Using valueOf() method
        String str2 = String.valueOf(ch);
        System.out.println("String is: " + str2);
    }
}
