import com.sun.org.apache.xml.internal.res.XMLErrorResources_tr;

import java.util.Scanner;

public class work_4_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入长方形的长：");
        int length = sc.nextInt();
        System.out.println("请输入长方形的宽：");
        int width=sc.nextInt();
        int perimeter=(length+width)*2;
        System.out.println(perimeter);
    }
}
