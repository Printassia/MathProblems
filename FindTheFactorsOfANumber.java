package Horsy.com.company;

import java.util.Scanner;

//Find the factors of the given numbers
public class FindTheFactorsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Input the number you want the factors of
        System.out.print("Input a number to find its factors: ");
        int factor = input.nextInt();
        //Output 1
        System.out.print("The factors of " + factor + " are: ");
        //Loop count: Between 1 & the factor number
        for (int count = 1; count <= factor; count++){
            //If the "count" in the loop count is divisible by the number being factored. List those numbers
            if(factor % count == 0)
                //Output 2
                System.out.print(" " + count);
        }


    }
}
