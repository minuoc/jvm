package heima;

//StringTable ["a","b","ab"] hashtable 结构，不能扩容
public class StringTableTest {
    public static void main(String[] args) {

        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s1.equals(s4));

        String s5 = "a" + "b";

        System.out.println(s3.equals(s5));

    }
}
