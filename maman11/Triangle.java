/*
 * The Triangle class takes 3 integers
 * Then it checks if they can create a triangle, if yes which kind of triangle
 */
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	// Read numbers from user input
        System.out.println("Please enter 3 integers ");
        System.out.println("The first number: ");
        int num1 = sc.nextInt();   
        System.out.println("The second number: ");
        int num2 = sc.nextInt();
        System.out.println("The third number: ");
        int num3 = sc.nextInt();

	// output sentences variables
	String finalSentence = new String("The numbers: "+ num1 + ", " + num2 + " and " + num3);
	String rightAngleTriangleSentence = new String(finalSentence+ " represent a right-angle triangle ");
	String commonTriangleSentence = new String(finalSentence + " represent a common triangle");

        int largest = Math.max(Math.max(num1, num2), num3); //check which number is the hypotenuse
        double num1Pow =Math.pow(num1, 2);
        double num2Pow =Math.pow(num2, 2);
        double num3Pow =Math.pow(num3, 2);

        if (num1 + num2 > num3 && num2 + num3 > num1 && num3 + num1 > num2){ //check if it is triangle
            if(num1 == num2 && num2 == num3){
                System.out.println(finalSentence+ " represent an equilateral triangle  ");
            }
            else if(num1 == num2 || num2 == num3 || num1 ==num3){
                System.out.println(finalSentence+ " represent an isosceles triangle");
            }
            else if(largest == num1){ // if num1 is the hypotenuse, check if it's right-angle
                if(num1Pow == num2Pow + num3Pow){
                    System.out.println(rightAngleTriangleSentence); 
                }
                else{
                    System.out.println(commonTriangleSentence);
                }
            }
            else if(largest == num2){  // if num2 is the hypotenuse, check if it's right-angle
                if(num2Pow == num1Pow + num3Pow){
                    System.out.println(rightAngleTriangleSentence); 
                }
                else{
                    System.out.println(commonTriangleSentence);
                }
            } 
            else if(largest == num3){  // if num3 is the hypotenuse, check if it's right-angle
                if(num3Pow == num1Pow + num2Pow){
                    System.out.println(rightAngleTriangleSentence); 
                }
                else{
                    System.out.println(commonTriangleSentence);
                }
            }
        } // end if
        else{
            System.out.println(finalSentence + " can not represent a triangle ");
        }

    } // end of method main
} // end of class Triangle