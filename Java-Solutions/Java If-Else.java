import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String a = "";
        if(N % 2 == 1){
            a = "Weird";
        }
        else{
            if(N >= 6 && N <= 20){
                a = "Weird";
            }
            else{
                a = "Not Weird";
            }
        }
        System.out.println(a);
        scanner.close();
    }
}
