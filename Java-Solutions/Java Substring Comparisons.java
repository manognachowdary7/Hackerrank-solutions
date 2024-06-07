import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Solution {

    public static String getSmallestAndLargest(String S, int k) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        SortedSet<String> sets = new TreeSet<>();
        for(int i = 0; i <= S.length() - k; i++){
            sets.add(S.substring(i, i + k));
        }
        return sets.first() + "\n" + sets.last();
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(S, k));
    }
}
