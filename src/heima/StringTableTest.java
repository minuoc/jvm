package heima;

//StringTable ["a","b","ab"] 串池 hashtable 结构,不能扩容

/**
 * jdk 1.8
 */
public class StringTableTest {
    public static void main(String[] args) {
        //常量池中的信息,都会被加载到运行时常量池中,这是 a b ab 都是常量池中的符号,还没有变为 java 字符串对象
        //ldc #2 会把 a 符号变为 "a" 字符串对象
        //ldc #3 会把 b 符号变为 "b" 字符串对象
        //ldc #4 会把 ab 符号变为 "ab" 字符串对象


        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        //new StringBuilder().append("a").append("b").toString(); new String("ab")
        String s4 = s1 + s2;

//        System.out.println(s3 == s4);

        //javac 在编译器间的优化,结果已经在编译器确定为ab
        String s5 = "a" + "b";

        System.out.println(s3 == s5);

    }
}
