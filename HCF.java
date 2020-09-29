package Horsy.com.company;
import java.util.Scanner;
public class HCF {
    /*
     * Find the HCF of two numbers
     */
    public static void main(String[] args) {
        
        //Declarations & Scanner
        short numberOne, numberTwo;
        int HCF = 0;
        Scanner input = new Scanner(System.in);
        
        //Input the first number
        System.out.print("Enter the first integer: ");
        numberOne = input.nextShort();
        //Input the second number
        System.out.print("Enter the second integer: ");
        numberTwo = input.nextShort();

        //Display the factors of integer 1 and integer 2
        for (int counter = 1; counter <= numberOne ||
                counter <= numberTwo; counter++) {
            //Check if the number from the counter is divisible by integer 1 and Integer 2
            if (numberOne % counter == 0 && numberTwo % counter == 0)
                //update the HCF to the number divisible by both integer 1 and integer 2
                HCF = counter;
            }
        //Output
            System.out.println("The highest common factor of " + numberOne + " and " + numberTwo +
                    " is " + HCF);
   }
}
