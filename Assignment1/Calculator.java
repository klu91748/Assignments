package Assignment1;

import java.util.Scanner;

public class Calculator
{
	public static void main(String args[])
	{
	    float a, b, res;
	    Scanner scan = new Scanner(System.in);
	    int choice = -1;
	    do
	    {
	        System.out.print("(1) Addition\n");
	        System.out.print("(2) Subtraction\n");
	        System.out.print("(3) Multiplication\n");
	        System.out.print("(4) Division\n");
	        System.out.print("(5) Exit\n\n");
	        System.out.print("Enter Your Choice : ");
	        try {
	        	choice = Integer.parseInt(scan.next());
		        switch(choice)
		        {
		            case 1 : System.out.print("Enter Two Number : ");
		                a = scan.nextFloat();
		                b = scan.nextFloat();
		                res = a + b;
		                System.out.println("Result = " + res);
		                break;
		            case 2 : System.out.print("Enter Two Number : ");
		                a = scan.nextFloat();
		                b = scan.nextFloat();
		                res = a - b;
		                System.out.println("Result = " + res);
		                break;
		            case 3 : System.out.print("Enter Two Number : ");
		                a = scan.nextFloat();
		                b = scan.nextFloat();
		                res = a * b;
		                System.out.println("Result = " + res);
		                break;
		            case 4 : System.out.print("Enter Two Number : ");
		                a = scan.nextFloat();
		                b = scan.nextFloat();
		                res = a / b;
		                System.out.println("Result = " + res);
		                break;
		            case 5 : System.exit(0);
		                break;
		            default : System.out.println("Wrong Choice!!!");
		        }
	        }
	        catch (Exception e){
	        	System.out.println("Invalid Input");
	        }
	    }
	    while(choice != 5);       
	}
}