
public class Ex13StudentTester2023b
{
    public static void main(String[] args) {

        System.out.println("----------------------------------------");
        System.out.println("***       Q1  - shortestRoad         ***");
        System.out.println("----------------------------------------");
        System.out.println("Road1:[5,4,5,8,12,9,9,3]");
        System.out.println("Road2:[7,3,3,12,10,2,10,7]");
        int[] road1={5,4,5,8,12,9,9,3};
        int[] road2={7,3,3,12,10,2,10,7};
        int result1=Ex13.shortestRoad(road1, road2);
        if (result1==49)
            System.out.println("Passed, result is 49");
        else
            System.out.println("Failed,  expected: 49   student's result: "+result1);

        System.out.println("----------------------------------------");
        System.out.println("***     Q2  - missingValue           ***");
        System.out.println("----------------------------------------");        
        {
            int []arr = {7,10,13,16,22,25};
            System.out.println("arr: [7,10,13,16,22,25]");
            int result2=Ex13.missingValue(arr);
            if (result2==19)
                System.out.println("Passed, result is 19");
            else
                System.out.println("Failed,  expected: 19  student's result: "+result2);
        }

        System.out.println("----------------------------------------");
        System.out.println("***     Q3  - longestPalindrome      ***");
        System.out.println("----------------------------------------");

        {
            int[] arr = {1, 2, 3, 2, 1, 2, 3, 2, 1};
            System.out.println("arr: [1, 2, 3, 2, 1, 2, 3, 2, 1]");
            int result3=Ex13.longestPalindrome(arr);
            if(result3== 9)
                System.out.println("Passed, result is  9");
            else
                System.out.println("Failed,  expected:  9  student's result: "+result3);
        }

        System.out.println("----------------------------------------");
        System.out.println("***       Q4  - isSum                ***");
        System.out.println("----------------------------------------");

        {
            int[] arr = {5, 4, 2, 1, 3};
            int num = 8;
            System.out.println("arr: [5, 4, 2, 1, 3]  num: 8");
            boolean result4 = Ex13.isSum(arr, num);
            if (result4)
                System.out.println("Passed, result is true");
            else
                System.out.println("Failed,  expected: true   student's result: " + result4);
            System.out.println("----------------------------------------");
        }

        {
            int[] arr = {1, 2, 3, 4, 5};
            int num = 10;
            System.out.println("arr: [1, 2, 3, 4, 5]  num: 10");
            boolean result5 = Ex13.isSum(arr, num);
            if (result5)
                System.out.println("Passed, result is true");
            else
                System.out.println("Failed,  expected: true   student's result: " + result5);
            System.out.println("----------------------------------------");
        }

        {
            int[] arr = {2, 4, 6, 8, 10};
            int num = 15;
            System.out.println("arr: [2, 4, 6, 8, 10]  num: 15");
            boolean result6 = Ex13.isSum(arr, num);
            if (!result6)
                System.out.println("Passed, result is false");
            else
                System.out.println("Failed,  expected: false   student's result: " + result6);
            System.out.println("----------------------------------------");
        }

    }
}
