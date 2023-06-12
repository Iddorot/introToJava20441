
public class B2017June84
{

    // Q1
    public static int ways(int k, int n){
        if (k == n ){
            return 1;
        }
        else if (n > k){
            return 0;
        }
        
        return ways(k, n,0);
    }

    private static int ways(int k, int n, int sidewalk){
        if (k == 0 ){
            if (sidewalk == n){
                return 1;
            }
            else{
                return 0;
            }
        }
        int rSteps = ways(k-1, n, sidewalk + 1);
        int lSteps = ways(k-1, n, sidewalk -1);
        return rSteps + lSteps;

    }
    //Driver
    public static void main(String[] args) {
        // Q1
        System.out.println(ways(4,2));

    }

}
