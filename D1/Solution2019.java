import java.util.Scanner;

public class Solution2019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        int num=1;
        for (int test_case = 0; test_case < T+1; test_case++) {
            System.out.print((num<<test_case)+" ");
        }
    }
}
