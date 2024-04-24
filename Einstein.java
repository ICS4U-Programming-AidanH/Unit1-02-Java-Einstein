
/***

 A program to calculate user input to determine how much energy is released from an object.

* @author  Aidan H

* @version 1.0

* @since   04/22/2024

*/

import java.util.Scanner;
//Imports scanner 

public class Einstein {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Creates a new scanner

        final float speedOfLightMathOne = 2.998f;
        final int speedOfLightMathTwo = 108;
        final float speedOfLight = speedOfLightMathOne * speedOfLightMathTwo;
        //Constant for the speed of light

        try{
        System.out.println("Please enter a value for the mass of your object:");
        float userInput = sc.nextFloat();
        //Input: Asks user for a value and then receives said value from user

        if (userInput < 0) {
            System.out.println("Please enter a valid value for mass.");
        }
        
        else {
            float answer = userInput * speedOfLight;
            //Process: Calculates the user input with the constant of the speed of light created earlier
            System.out.println("The answer is:" + answer + "m/s");
        }
        
        sc.close();
        //Closes scanner
   
    } catch (Exception e) {
        System.out.println("Please enter a valid value for mass.");
        }

    }
    
}
