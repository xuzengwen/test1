import java.util.Scanner;

public class Work_1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = sc.nextInt();

        String s=(i%2==0) ? "偶数":"奇数";
        System.out.println(s);
    }
}
