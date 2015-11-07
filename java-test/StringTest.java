import java.util.Date;

/**
 * Created by Administrator on 2015/11/6.
 */
public class StringTest {
    public static void main(String[] args) {
       /* int a = 100;
        while (a == 60) {

            System.out.println("OK1");
            a--;
        }
        do {
            System.out.println("OK2");
            a--;
        } while (a == 60);
        int sum = 0;
        for (int i = 2; i <= 100; i += 2)

        {
            sum += i;
        }

        System.out.println("sum=" + sum);
        int foreach = 2;
        System.out.println(foreach);

        int arr[] = {7, 10, 11};
        System.out.println("一位数组中的元素为：");
        for (int x : arr) {
            System.out.println(x);
        }
        String stet = null;
        int xs[];
//        stet = "fe";
        System.out.println(stet);
        String geg = new String("good");
        char a1[] = {'a', 'b', 'c'};
        String fefg = new String(a1, 1, 2);
        System.out.println(fefg);
        String mfe = "m";
        String s1 = new String("Hello");
        String s2 = new String("world");
        String s = s1 + " " + s2;
        System.out.println(s);
        System.out.println("I Like " +
                "Java"
        );
        System.out.println(s.length());

        String strf = "We family";
        int size = strf.lastIndexOf("");
        char mychar = strf.charAt(3);
        System.out.println(mychar);
        String gg = "fwjkwgjj";
        String subgg = gg.substring(2, 4);
        System.out.println(subgg);
        String str = "Java  Javacd";
        System.out.println(str.length());
        System.out.println(str.trim().length());
        String newstr = str.replace("av", "A1");
//        String newstr2=str.replace("A");
        System.out.println(newstr);
        boolean b1 = str.startsWith("Ja");
        boolean b2 = str.endsWith("cd1");
        System.out.println(b1 + " " + b2);
        String h1 = "ff";
        String h2 = "ff";
        if (h1 == h2) System.out.println("h1=h2");
        String j1 = new String("fF");
        String j2 = new String("ff");
        if (j1 == j2) {
            System.out.println("true");
        } else System.out.println("false");

        if (j1.equalsIgnoreCase(j2)) System.out.println("j1=j2");

        String bj1 = new String("b");
        String bj2 = new String("a");
        String bj3 = new String("c");
        String bj4 = "c";
        String bj5 = "c";
        byte re1 = (byte) bj1.compareTo(bj2);
        int re2 = bj2.compareTo(bj1);
        int re3 = bj3.compareTo(bj4);
        int re4 = bj4.compareTo(bj5);
        boolean re5 = bj4.equals(bj5);
        System.out.println(re1 + " " + re2 + " " + re3 + " " + re4 + " " + re5);

        String i1 = new String("abc DEF");
        String i2 = i1.toLowerCase();
        String i3 = i1.toUpperCase();
        System.out.println(i1 + "\n" + i2 + "\n" + i3);
*/
       /* String str1 = new String("abc,def,ghi.jkl");
        String[] newstr2 = str1.split(",|\\.");
        for (int i = 0; i < newstr2.length; i++) {
            System.out.println(newstr2[i]);
        }*/
        /*
        System.out.println();
        for (String i : newstr2) System.out.println(i);
        System.out.println();
        String[] newstr3 = str1.split(",", 2);

        for (String i : newstr3)
            System.out.println(i);
        Date date = new Date();
        String s5 = String.format("%tj",date);
        System.out.println(s5);*/

      /*  Date date = new Date();
        String year = String.format("%tY", date);
        String month = String.format("%tB",date);
        String day = String.format("%td",date);
        System.out.println("今年是："+year+"年"+"\n"+"现在是："+month+"\n"+"今天是："+day+"号");*/

 /*   Date date = new Date();
        System.out.println(date);
        String h = String.format("%tH",date);
        String m = String.format("%tM",date);
        String s = String.format("%tS",date);
        System.out.println(h+" "+m+" "+s);
        String o = String.format("%tF",date);
        System.out.println(o);*/
      /*  int $1=1;
        System.out.println($1);*/
       /* String regex = "\\w+(\\.\\w)*@\\w+(\\.\\w{2,3}){1,3}";
        String[] str1 = {"aaa@","aa.b@qq.com","1123@163.com","113fe$@11.com","han. @sohu.com.cn","han.c@sohu.com.cn.cm.cm"};
        for (String str:str1){
            System.out.println(str+" \\\\. "+str.matches(regex));
        }*/
       /* String s=new String("f");
        s="fe";
        System.out.println(s);
        System.out.println(s instanceof String);
        */
        /*String str1 = "";
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1 = str1 + i;
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - starTime;
        System.out.println("1. " + time);

        starTime =System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("");
        for (int j = 0; j < 10000; j++) {
            builder.append(j);
        }
        endTime = System.currentTimeMillis();
        time = endTime - starTime;
        System.out.println("2. " + time);*/

        String s = "abcde";
        String s2 = s.substring(s.length() - 1);
        String s3 = s.substring(s.length() - 1, s.length());
        String s4 = s.substring(1, 2);
        System.out.println(s4);

        StringBuilder bf = new StringBuilder("hello");
        bf.insert(5, " world");
        System.out.println(bf);

//        bf.delete(2,5);
        bf.delete(2, 23);
        System.out.println(bf);
    }

}
