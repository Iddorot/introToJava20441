
public class A2016Fab83
{
    //Q1
    public static int minPoints(int [][] m){
        int min = Math.abs(m[0][0]);
        int temp = Math.abs(m[0][0]);
        int before = Math.abs(m[0][0]);
        return minPoints(m, 0, 0, min , temp, before);
    }

    private static int minPoints(int [][]m, int i, int j, int min, int temp, int before){
        if (i > m.length -1 || j > m[0].length -1){
            return Integer.MAX_VALUE;
        }
        if (i == m.length -1 && j ==m[0].length -1 ){
            if(temp + m[i][j] > 0){
                return (Math.abs(temp + m[i][j])+1);
            }
        }
        if (temp < 0){
            min += Math.abs(before);
        }
        int down = minPoints(m, i + 1,j, min, temp +m[i][j],m[i][j]);
        int right = minPoints(m, i, j+1, min, temp +m[i][j],m[i][j]);
        return Math.min(down, right);
    }

    public static void main(String[] args) {
        //Q1
        int[][] m = {
                {-2, -3, 3},
                {-5, -10, 1},
                {10, 30, -5}
            };
        System.out.println(minPoints(m));
    }
}
