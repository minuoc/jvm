package heima.t3;

public class Load4 {
    public static void main(String[] args) {
//        System.out.println(E.a);
//        System.out.println(E.b);
        System.out.println(E.c); //包装类型 Integer.valueOf(20)


    }
}

class E {
    public static final int a = 10;
    public static final String b = "hello";
    public static final Integer c = 20;
    static {
        System.out.println("init E");
    }
}