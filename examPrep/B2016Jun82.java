
public class B2016Jun82
{
    //Q1.1
    public static int where(int [] vec){
        int left = 0;
        int right = vec.length - 1;
        return where(vec, left,0, right);
    }

    private static int where(int [] vec, int left, int p, int right){

        if(p > right){
            return -1;
        }

        int sumLeft = sum(vec, 0, p-1);
        int sumRight = sum (vec, p, vec.length - 1);
        if (sumLeft == sumRight){
            return p;
        }

        return where(vec,left, p +1, right);
    }

    private static int sum(int[] vec, int low, int high){
        if (low > high){
            return 0;
        }
        else if (low == high){
            return vec[low];
        }
        else{
            int mid = (low + high) / 2; 
            int leftSum = sum(vec, low, mid); 
            int rightSum = sum(vec, mid + 1, high); 
            return leftSum + rightSum; 
        }
    }

    //Q1.2
    public static boolean isBalanced(int []vec, int k){
        return isBalanced(vec, k, 0,vec.length);
    }

    private static boolean isBalanced(int []vec, int k, int low, int high){
        if (k == 0 ){
            return true;
        }
        
        int p = where(vec, low,0, high);
        if (p == -1){
            return false;
        }
        return (isBalanced(vec, k-1,low, p) &&
                isBalanced(vec,k-1,p,high ));
    }

    //Driver
    public static void main(String[] args) {
        //Q1.1
        int [] vec = {5,6,1,2,8};
        System.out.println(where(vec));
        //Q1.2
        int [] vec2 = {1,2,2,1,3,2,1,3,4,-1,3,3};
        System.out.println(isBalanced(vec2,3));

    }
}