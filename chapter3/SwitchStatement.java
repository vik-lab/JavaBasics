package chapter3;
/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */

import java.util.Scanner;

public class SwitchStatement
{
    public static void main (String args[])
    {
        //get the test score with a letter grade
        System.out.println("Please enter the grade ");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();

        String msg = new String();

        switch(grade)
        {
            case "A":
                msg = "Excellent job";
                break;
            case "B":
                msg = "great job";
                break;
            case "C":
                msg = "you can do better";
                break;
            case "D":
                msg = "You need to work harder";
                break;
            default:
                msg = "Error. Invalid grade";
                break;
        }

        System.out.println(msg);
    }

}
