import java.util.Scanner;

public class Solution2056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int arr[]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            String str=sc.next();
            int y=Integer.parseInt(str.substring(0,4));
            int m=Integer.parseInt(str.substring(4,6));
            int d=Integer.parseInt(str.substring(6));
            if((m<1 || m>12)||(d<1 || d>arr[m])){
                System.out.println("#"+test_case+" -1");
                continue;
            }
            System.out.println("#"+test_case+" "+str.substring(0,4)+"/"+str.substring(4,6)+"/"+str.substring(6));
            }
        }
    }

