import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        scan.close();
        String[] tokens = s.split("[^\\p{Alpha}]+");
        int length = (s.isEmpty()) ? 0 : tokens.length;
        System.out.println(length);
        for(String token : tokens){
            System.out.println(token);
        }
    }
}
