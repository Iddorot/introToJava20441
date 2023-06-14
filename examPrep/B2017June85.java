
public class B2017June85
{

    // Q1
    public static int oneFiveSeven(int n){
        if (n < 0 ){
            return Integer.MAX_VALUE;
        }
        if (n == 0){
            return 0;
        }
        
        int opt1 = 1 + oneFiveSeven(n-1);
        int opt5 = 1 + oneFiveSeven(n-5);
        int opt7 = 1 + oneFiveSeven(n-7);
        int minSum = opt1;

        if (opt5 < minSum && opt5 > 0){
            minSum = opt5;
        }
        if (opt7 < minSum && opt7 > 0){
            minSum = opt7;
        }
        return minSum;
    }

    //Driver
    public static void main(String[] args) {
        // Q1
        System.out.println(oneFiveSeven(10));

    }

}
