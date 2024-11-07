import java.util.Scanner;

public class Solution2058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int num1000,num100,num10,num1;
        int sum=0;
        T = sc.nextInt();
        num1=T%10;
        num10=(T%100)/10;
        num100=(T/100)%10;
        num1000=T/1000;
        sum=num1+num10+num100+num1000;
        System.out.println(sum);
    }
}
