public class addtwocomplexnumbers {
    //classifies real and imaginary parts
    private double real, imag;

    //initializes the complex number
    private addtwocomplexnumbers(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    private static addtwocomplexnumbers sum(addtwocomplexnumbers c1, addtwocomplexnumbers c2)
    {
        //creates temp complex number to hold sum of two numbers
        addtwocomplexnumbers temp = new addtwocomplexnumbers(0, 0);

        //adds temp real and imaginary numbers for return
        temp.real = c1.real + c2.real;
        temp.imag = c1.imag + c2.imag;

        //return temporary complex number
        return temp;
    }
    //adds the new complex numbers together and prints them out
    public static void main(String[] args) {
        addtwocomplexnumbers c1 = new addtwocomplexnumbers(5.5, 4);
        addtwocomplexnumbers c2 = new addtwocomplexnumbers(1.2, 3.5);
        addtwocomplexnumbers temp = sum(c1, c2);
        System.out.print("Sum is: " + temp.real + " + " + temp.imag + "i");
    }
}
