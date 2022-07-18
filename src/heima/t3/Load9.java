package heima.t3;

public class Load9 {
    public static void main(String[] args) {
//        Singleton.test();
        Singleton.getInstance();
    }
}

class Singleton {

    public static void test() {
        System.out.println("test");
    }

    //构造函数 private
    private Singleton() {

    }

    private static class LazyHolder {
        private static Singleton SINGLETON = new Singleton();
        static  {
            System.out.println("lazy holder init");
        }

    }

    public static Singleton getInstance() {
        return LazyHolder.SINGLETON;
    }
}