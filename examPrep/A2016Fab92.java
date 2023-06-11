
public class A2016Fab92
{
    //Q1
    public static int minPath(char[][] minChess, int i, int j){

        int min = minPath(minChess, i ,j, 0);
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        else return min;

    }
    
    private static int minPath(char[][] minChess, int i, int j, int sum){
        //validation out of lim
        if ((i < 0 || j < 0) ||
            (i > minChess.length -1 || j > minChess[0].length -1  )
            || (minChess[i][j] == 'X')){
            return Integer.MAX_VALUE;
        }
        
        if (minChess[i][j] == 'K'){
            return sum;
        }
        
        //recurstion
        minChess[i][j] = 'X';
        int opt1 = minPath(minChess, i + 2, j + 1, sum + 1);
        int opt2 = minPath(minChess, i + 1, j + 2, sum +1);
        int opt3 = minPath(minChess, i -1 , j + 2, sum +1);
        int opt4 = minPath(minChess, i - 2, j + 1, sum +1);
        int opt5 = minPath(minChess, i -2, j -1 , sum +1);
        int opt6 = minPath(minChess, i -1 , j - 2, sum +1);
        int opt7 = minPath(minChess, i + 1, j - 2, sum +1);
        int opt8 = minPath(minChess, i + 2, j - 1, sum +1);
        minChess[i][j] = 'O';
        
        int minOpt12 = Math.min(opt1, opt2);
        int minOpt34 = Math.min(opt3, opt4);
        int minOpt56 = Math.min(opt5, opt6);
        int minOpt78 = Math.min(opt7, opt8);
        
        return Math.min(Math.min(minOpt12,minOpt34),Math.min(minOpt56,minOpt78));
    }
    public static void main(String[] args) {
        
        //Q1
        char[][] minChess  = {
            {'O','O','O','O'},
            {'O','O','H','O'},
            {'O','O','O','O'},
            {'O','O','O','O'},
        };
        System.out.println(minPath(minChess, 1, 2));
    }

}
