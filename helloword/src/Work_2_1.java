import java.util.Scanner;

public class Work_2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生成绩");
        int i = sc.nextInt();
        String s=(i>=60)?"及格":"不及格";
        System.out.println(s);
    }
}
