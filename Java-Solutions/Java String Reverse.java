import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String reversed = new StringBuilder(S).reverse().toString();
        System.out.println(S.equals(reversed) ? "Yes" : "No");
    }
}
