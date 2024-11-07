import java.util.Scanner;

public class Solution2072 {
    public static void main(String[] args) {
        int T;
        int temp;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        int sum = 0;
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i = 1; i <= 10; i++) {
                temp = sc.nextInt();
                if (temp % 2 == 1) {
                    sum += temp;
                }
            }
            System.out.println("#" + test_case + " " + sum);
            sum = 0;
        }
    }
}
