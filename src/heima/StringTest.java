package heima;

/**
 * 字符串字面量
 */

/**
 * 1.8
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b"; //ab
        String s4 = s1 + s2;  //new String("ab") 堆中的对象
        String s5 = "ab";

        String s6 = s4.intern();


        System.out.println(s3 == s4); // false 常量池 堆
        System.out.println(s3 == s5); // true 都是常量池
        System.out.println(s3 == s6); // s6 常量池


        String x2 = new String("c") + new String("d");  //new String("cd") heap
        String x1 = "cd"; //"cd"
        //将字符串 放入 StringTable 没有入池成功 已经存在了
        x2.intern();

        System.out.println(x1 == x2); //false


    }

}
