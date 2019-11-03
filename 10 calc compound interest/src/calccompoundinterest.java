// formula for calculating compound interest: P (1 + R/n (nt) - P
// P is principal amount
// R is the annual interest rate
// n is the number of times that interest is compounded per unit t
// if interest is compounded monthly then it would be 12
// if interest is compounded quarterly then it would be 4

// Ex: An amount of $2,000 is deposited into a bank account as a fixed deposit
// At an annual interest rate of 8% monthly, calc compound interest after 5 years
// 2000 (1 + 0.08/12 (12 * 5) - 2000 = $979.69

public class calccompoundinterest {
    //initialize integers and doubles
    public void calculate(int p, int t, double r, int n) {
        // calculates compound interest
        double amount = p * Math.pow(1 + (r / n), n * t);
        double cinterest = amount - p;

        //prints out compound interest
        System.out.println("Compound interest after " + t + "years: " + cinterest);
        System.out.println("Amount after" + t + "Years: " + amount);
    }
    public static void main(String[]args){
        calccompoundinterest obj = new calccompoundinterest();

        //inserts values to calculate compound interest
        obj.calculate(2000, 5, .08, 12);
    }
}
