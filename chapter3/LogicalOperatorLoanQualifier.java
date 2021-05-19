package chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier
{
    public static void main (String args[])
    {
        // initialise what we  know
        int reqSalary = 30000;
        int reqEmpYrs = 2;

        //get what we don't
        System.out.println("please enter your salary for the loan");
        Scanner scan = new Scanner(System.in);
        int currentSal = scan.nextInt();
        System.out.println("please enter your years of experience for the loan");
        int exp = scan.nextInt();
        scan.close();

        //output the decision after getting the input from the user
        if(currentSal>=reqSalary && exp>=reqEmpYrs)
        {
            System.out.println("Congratulations you qualify for the loan");
        }
        else
        {
            System.out.println("please try again when you meet the criteria");
        }
    }

}
