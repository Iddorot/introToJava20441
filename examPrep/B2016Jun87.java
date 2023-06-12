
public class B2016Jun87
{
    // Q1
    public static int count(int sum) {
        return count(sum, 1);
    }

    private static int count(int remainingSum, int currentNumber) {


        if (remainingSum == 0) {
            return 1;
        }

        if (remainingSum < currentNumber) {
            return 0;
        }

        int counter = 0;

        // Recursive case 1: Include the current number in the series
        counter += count(remainingSum - currentNumber, currentNumber + 1);

        // Recursive case 2: Do not include the current number in the series
        counter += count(remainingSum, currentNumber + 1);

        return counter;
    }

    //Driver
    public static void main(String[] args) {
        // Q1
        System.out.println(count(7));

    }
}
