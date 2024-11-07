import java.util.Scanner;

public class Solution2050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String T= sc.next();
        for (int test_case = 0; test_case < T.length(); test_case++) {
            System.out.print(T.charAt(test_case)-64+" ");
        }
    }
}
