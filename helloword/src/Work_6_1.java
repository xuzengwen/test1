import java.util.Scanner;

public class Work_6_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生成绩：");
        int grade = sc.nextInt();
        if(grade<60 && grade>=0){
            System.out.println("不及格");
        }else if (grade<70 && grade>=60){
            System.out.println("及格");
        }
        else if (grade<80 && grade>=70){
            System.out.println("良");
        }else if (grade<90 && grade>=80){
            System.out.println("好");
        }else if (grade<=100 && grade>=90){
            System.out.println("优秀");
        }else {
            System.out.println("你输入的成绩有误");
        }
    }
}
