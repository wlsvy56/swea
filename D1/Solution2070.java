import java.util.Scanner;

public class Solution2070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int num1,num2;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            num1=sc.nextInt();
            num2=sc.nextInt();
            if(num1>num2)
                System.out.println("#"+test_case+" "+">");
            if(num1==num2)
                System.out.println("#"+test_case+" "+"=");
            if(num1<num2)
                System.out.println("#"+test_case+" "+"<");
        }
    }
}
