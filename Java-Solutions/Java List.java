import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(sc.next().equals("Insert"))
                list.add(sc.nextInt(), sc.nextInt());
            else
                list.remove(sc.nextInt());
        }
        sc.close();
        
        for(Integer i : list){
            System.out.print(i + " ");
        }
    }
}
