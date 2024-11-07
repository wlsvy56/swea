import java.util.Scanner;

public class Solution1933 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            if(T%test_case==0)
                System.out.print(test_case+" ");
        }
    }
}
