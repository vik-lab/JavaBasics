package chapter3;
import javax.swing.*;
import java.util.Scanner;
/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResults
{
    //Get the test score
    public static void main (String args[])
    {
    System.out.println("how much did you score in the test, please enter your marks:");
    Scanner scan = new Scanner(System.in);
    Double marks = scan.nextDouble();
    scan.close();

    //Determine the letter grade
    char grade;

    //output

        if(marks< 50)
        {
            grade = 'F';
        }
        else if(marks< 70)
        {
            grade = 'C';
        }
        else if(marks< 80)
        {
            grade = 'B';
        }
        else
        {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }

}


