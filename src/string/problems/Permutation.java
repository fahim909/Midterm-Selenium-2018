package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void permute(String s)
    {
        permute("", s);
    }
    private static void permute(String pre, String s)
    {
        int x = s.length();
        if(x==0)
        {
            System.out.println(pre);
        }
        else
        {
            for(int i = 0; i < x; i++)
            {
                permute(pre + s.charAt(i), s.substring(0,i) + s.substring(i+1, x));
            }
        }
    }
    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        permute("NFL");
    }
}
