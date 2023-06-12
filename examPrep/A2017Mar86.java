
public class A2017Mar86
{
    // Q1
    public static int edit(String str1, String str2){
        return edit(str1, str2, 0, 0 ,0 );
    }

    private static int edit(String str1, String str2, int i,int j, int counter){
        if(i == str1.length() && j < str2.length()){
            return counter += (str2.length() - j );
        }

        if (j ==str2.length() && i < str1.length()){
            return counter += (str1.length() - i );

        }

        if(i == str1.length() && j == str2.length()){
            return counter;
        }
        if (str1.charAt(i)== str2.charAt(j)){
            return edit(str1, str2, i +1, j +1 ,counter);
        }
        else{
            return Math.min(edit(str1, str2, i +1, j ,counter + 1), edit(str1, str2, i, j +1 ,counter + 1));
        }

    }
    
    //Driver
    public static void main(String[] args) {
        // Q1
        String str1 = "geek";
        String str2 = "gesek";
        System.out.println(edit(str1,str2));
    }
}
