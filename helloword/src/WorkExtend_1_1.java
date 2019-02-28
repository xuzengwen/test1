import java.util.Scanner;

public class WorkExtend_1_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("小明左手上的牌");
        int left = sc.nextInt();
        System.out.println("小明右手上的牌");
        int right = sc.nextInt();
        int temp=left;
        left=right;
        right=temp;
        System.out.println("交换后左手的牌 "+left+", 交换后右手的牌"+right);

    }
}
