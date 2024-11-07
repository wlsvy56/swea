import java.util.Scanner;

public class Solution2071 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T;
        int temp;
        double avg=0;
        T=sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            for (int i=1;i<=10;i++){
                temp=sc.nextInt();
                avg+=temp;
            }
            if(avg%10>=5){
                avg+=10;
            }
            avg=avg/10;
            System.out.println("#"+test_case+" "+(int)avg);
            avg=0;
        }
    }
}
