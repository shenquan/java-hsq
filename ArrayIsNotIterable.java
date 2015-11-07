import java.util.Arrays;

/**
 * Created by Hsq on 2015/11/5.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }
    static final double PI=3.14;
    static int age =23;
    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
//        Integer[]  a= new Integer[4];
//        test(Arrays.asList(a));
        System.out.println();
        Integer[] array = new Integer[]{4, 5};
        Integer[] a2 = new Integer[1];
        a2[0] = 7;
        for (int i : a2) {
            System.out.println(i);
        }
        test(Arrays.asList(array));
        String[] strings = {"A", "B", "C"};
//        test(strings);
        test(Arrays.asList(strings));
        long a = 2147483648l;
        System.out.println(a);
        byte mybyte = 124;
        short myshort = 32564;
        int myint = 4677544;
        long mylong = 2556364;
        long result = mybyte + myshort + myint + mylong;
        System.out.println(result);

        double f1 = (double) (13.23f);
        double d1 = 4562.12d;
        double d2 = 45678.1564;
        System.out.println((double) (f1 + d1 + d2));

        char x = 'a';
        char x3 = 97;
        char word1 = 100;
        char word2 = '@';
        System.out.println((char) word1 + " " + (int) word2);
        int p = 23045, p2 = 45213;
        System.out.println((char) p + " " + (char) p2);
        char 年龄 = '\\';
        System.out.println(年龄);
        char constant = 9733;
        System.out.println(constant);
        final double PI = 3.14D;
        final boolean BOOL = true;
        final int number;
        number =1236;
        age =22;
        System.out.println(PI);
        System.out.println(number);
        System.out.println(age);
//        c = b =a+4;
    }
}
