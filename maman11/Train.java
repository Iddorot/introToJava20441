/*
 * The Train class takes 4 integers:
 * The speed in km and, time in minutes for 2 trains
 * Then, it's calculating and print to the user the distance between them.
 *
 */
import java.util.Scanner;

public class Train
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        final int HOUR = 60;
        
	    // read integers from user input and assign variables
        System.out.println("Please enter 4 integers ");
        System.out.println("Please  enter the speed of the first train: ");
        int train1Speed = sc.nextInt();
        System.out.println("Please enter the time of the first train");
        int train1Time = sc.nextInt();
        System.out.println("Please  enter the speed of the second train: ");
        int train2Speed = sc.nextInt();
        System.out.println("Please enter the time of the second train");
        int train2Time = sc.nextInt();

        double train1Distance = train1Speed * train1Time / HOUR; // Calculate the first train distance
        double train2Distance = train2Speed * train2Time/ HOUR; // Calculate the second train distance
        double betweenDistance = Math.abs(train1Distance - train2Distance) ; // Calculate the distance between the trains

        System.out.println("the distance between the trains is " + betweenDistance + " km.");
    } // end of method main
} // end of class train
