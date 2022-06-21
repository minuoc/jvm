package heima;

/**
 * 字符串字面量
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b";
        String s4 = s1 + s1;  //new String("ab")
        String s5 = "ab";
        String s6 = s4.intern();

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);


        String x2 = new String("c") + new String("d"); //new String("cd") heap
        String x1 = "cd"; //"cd"
        x2.intern();

        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));

    }

}
