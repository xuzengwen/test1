public class Work_3_1 {
    public static void main(String[] args) {
        int a=534;
        int bai=a/100%10;
        int shi=a/10%10;
        int ge=a%10;
        System.out.println("个位："+ge+",十位："+shi+",百位："+bai);
    }
}
