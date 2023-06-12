
public class A2016Fab87
{
    //Q1
    public static int minDiff(int[] arr){
        return minDiff(arr, 0, 0, 0);
    }

    private static int minDiff(int[] arr, int i, int setA, int setB) {

        if (i == arr.length ){
            return Math.abs(setA - setB);
        }
        
        int sum1 = minDiff(arr, i + 1, setA + arr[i],setB);
        int sum2 = minDiff(arr, i +1, setA, setB +arr[i]);
        
        return Math.min(sum1, sum2);
    }

    public static void main(String[] args) {
        //Q1
        int arr [] = {5,2,4};
        System.out.println(minDiff(arr));
    }
}