package heima.t3;

public class Demo3_8_2 {
    private String a = "s1";
    {
        b = 20;
    }
    private int b = 20;
    {
        a = "s2";
    }

    public Demo3_8_2(String a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Demo3_8_2 d = new Demo3_8_2("s3",30);
        System.out.println(d.a);
        System.out.println(d.b);
    }
}
