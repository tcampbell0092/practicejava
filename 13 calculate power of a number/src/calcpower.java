//calculate power of a number w/ for loop.
//number is the base and p is the power(exponent)
//calculate the result of number^p

public class calcpower {
    public static void main(String[]args) {
        //number is base, p is exponent
        int number = 5, p = 2;
        long result = 1;

        //copy exponent value to loop counter
        int i = p;
        for(;i !=0; --i)
        {
            result *= number;
        }

        //display output
        System.out.println(number+"^"+p+"= " + result);
    }
}
