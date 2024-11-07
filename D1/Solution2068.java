import java.util.Scanner;

public class Solution2068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int num;
        int max=0;
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            for (int i=1;i<=10;i++){
                num=sc.nextInt();
                if(max<=num)
                    max=num;
            }
            System.out.println("#"+test_case+" "+max);
            max=0;
        }
    }
}
