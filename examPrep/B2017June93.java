
public class B2017June93
{

    // Q1
    public static int cntTrueReg(boolean [][] mat){
        return cntTrueReg(mat, 0, 0);
    }

    private static int cntTrueReg(boolean [][] mat, int i, int j){
        if (j == mat[0].length ){
            return 0;
        }
        if (i == mat.length){
            return cntTrueReg(mat, 0, j+1);
        }

        if (mat[i][j] == true){
            markFalse(mat, i, j);
            
            return 1 + cntTrueReg(mat, i+1, j);
        }
        
        return cntTrueReg(mat, i+1, j);
    }

    private static void markFalse(boolean [][] mat, int i ,int j){
        mat[i][j] = false;

        if( i-1 >= 0 && mat[i-1][j]){ //mark and move  up 
            markFalse(mat, i-1, j);
        }
        if( i+1 < mat.length && mat[i+1][j]){ //mark and move down
            markFalse(mat, i+1, j);
        }
        
        if(j + 1 < mat.length && mat[i][j+1]){ // mark and move right
            markFalse(mat, i, j +1 );
        }
        
        if(j -1 >=0 && mat[i][j-1]){ // mark and move left
            markFalse(mat, i, j -1 );
        }
    }
    //Driver
    public static void main(String[] args) {
        boolean mat[][] = {
            {false,false,false,false,true},
            {false,true,true,true,false},
            {false,false,true,true,false},
            {true,false,false,false,false},
            {true,true,false,false,false}
        };
        System.out.println(cntTrueReg(mat));

    }

}
