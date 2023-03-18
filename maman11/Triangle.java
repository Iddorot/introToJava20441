/*
 * The Triangle class takes 3 integers
 * Then it checks if they can create a triangle, if yes which kind of triangle
 */
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	    
	// read numbers from user input and assign variables
        System.out.println("Please enter 3 integers ");
        System.out.println("The first number: ");
        int num1 = sc.nextInt();   
        System.out.println("The second number: ");
        int num2 = sc.nextInt();
        System.out.println("The third number: ");
        int num3 = sc.nextInt();

	// output sentence
	String finalSentence = new String("The numbers: "+ num1 + ", " + num2 + " and " + num3);
	    
	//calculate the power of each number
        double num1Pow =Math.pow(num1, 2);
        double num2Pow =Math.pow(num2, 2);
        double num3Pow =Math.pow(num3, 2);

        if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2){ //check if it is triangle
            if(num1 == num2 && num2 == num3){ //check if it is equilateral triangle
                System.out.println(finalSentence+ " represent an equilateral triangle  ");
            }
            else if(num1 == num2 || num2 == num3 || num1 ==num3){ //check if it is isosceles triangle
                System.out.println(finalSentence+ " represent an isosceles triangle");
            }
            else if(num1Pow == num2Pow + num3Pow || num2Pow == num1Pow + num3Pow || num3Pow == num1Pow + num2Pow){ //check if it's right-angle triangle
		System.out.println(finalSentence+ " represent a right-angle triangle "); 
            }
	    else{
                System.out.println(finalSentence + " represent a common triangle");
            }
        } // end if
        else{
            System.out.println(finalSentence + " cannot represent a triangle");
        }
    } // end of method main
} // end of class Triangle
