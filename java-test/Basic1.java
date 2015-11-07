/**
 * Created by Administrator on 2015/11/5.
 */
public class Basic1 {
    public static void main(String[] args) {
        float number1 = 45.56f;
        int number2 = 152;
        int a = 3;
        int b = 6;
        boolean result = ((a < b) & (a != b));
        boolean result2 = ((a > b) || (a != b));
        int result3 = a | b;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

        boolean b1 = 20 < 45 ? true : false;
        long y = (long) 456.6f;
        byte b2 = (byte) 129;
        System.out.println(b2);
        if (a == 100) {
            System.out.println("if true");
        }
        if (a != 100) ;
        String str = "明日科技";
        switch (str) {
            case "明日":
                System.out.println("明日");
            case "明日科技":
                System.out.println("明日科技");
                break;
            default:
                System.out.println("以上都不是");
        }
        int week = 2;
        switch (week) {
            case 1:
                ;
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                ;
                break;
            default:
                ;
                break;
        }
        int x = 1;
        int sum = 0;
        while (x <= 10) {
            sum += x;
            x++;
        }
        System.out.println("sum=" + sum);
    }
}
