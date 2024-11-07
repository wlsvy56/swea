public class Solution2027 {
    public static void main(String[] args) {
        int num=0;
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(num==j) {
                    System.out.print("#");
                }else {
                    System.out.print("+");
                }
            }num++;
            System.out.println();
        }
    }
}
