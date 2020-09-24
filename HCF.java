package Horsy.com.company;
import java.util.Scanner;
public class HCF {
    /*
     * Find the HCF of two numbers
     */
    public static void main(String[] args) {
        //Declarations & Scanner
        int number1, number2, calculateFirstInteger, calculateSecondInteger, firstIntegerMultiples, secondIntegerMultiples;
        Scanner input = new Scanner(System.in);

        //Instructions
        System.out.println("This program will output the Highest Common Factor between two numbers");
        System.out.print("Input the first integer: ");
        number1 = input.nextInt();
        System.out.print("Input the second integer: ");
        number2 = input.nextInt();


        System.out.println("The first 12 multiples of " + number1);
        //Calculate first Integer
        calculateFirstInteger = number1 * number1;
        //For Loop for First Integer & Output
        for (calculateFirstInteger = 0; calculateFirstInteger <= 12; calculateFirstInteger++){
            firstIntegerMultiples = number1 * calculateFirstInteger;
            System.out.print(firstIntegerMultiples + " ");
        }
        System.out.println();
        System.out.println("The first 12 multiples of " + number2);
        //Calculate second Integer
        calculateSecondInteger = number2 * number2;
        //For Loop: Second Integer
        for (calculateSecondInteger = 0; calculateSecondInteger <=12; calculateSecondInteger++){
            secondIntegerMultiples = number2 * calculateSecondInteger;
            System.out.print(secondIntegerMultiples + " ");
        }



    }
}
