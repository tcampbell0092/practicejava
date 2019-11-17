//formula for calculating simple interest: (P x R x T)/100
//P is the Principal amount
//R is the rate per annum
//T is time in years

//ex. Someone deposits 2000 INR in bank account at interest rate of
//6% per annum for 3 years
//Simple interest = 2000*6*3/100 = 360 INR


public class calcsimpleinterest {
    public void calculate(int p, int r, int t){
        //calculates simple interest
        int amount = (p * r * t / 100);

        //print simple interest
        System.out.println("Simple interest after " + t + " years: " + amount);
    }
    public static void main(String[]args){
        calcsimpleinterest obj = new calcsimpleinterest();

        //inserts values to calculate simple interest
        obj.calculate(2000, 6, 3);
    }
}
