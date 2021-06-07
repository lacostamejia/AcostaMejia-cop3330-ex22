/*
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Luis Andres Acosta Mejia
*/

import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //Here is the scanner method used.

        //Variables used.
        int number_1;
        int number_2;
        int number_3;
        int actual_max;

        System.out.print("Enter the first number: ");
        number_1 = in.nextInt();

        System.out.print("Enter the second number: ");
        number_2 = in.nextInt();

        System.out.print("Enter the thrid number: ");
        number_3 = in.nextInt();

        if(number_1 == number_2 && number_1 == number_3)
        {
            System.out.print("All number are equal");
            return;
        }
        else{
            if(number_1 > number_2 && number_1 > number_3){
                actual_max = number_1;
            }
            else if(number_2 > number_1 && number_2 > number_3){
                actual_max = number_2;
            }
            else{
                actual_max = number_3;
            }
        }
        System.out.println("The largest number is " + actual_max);



    }
}
