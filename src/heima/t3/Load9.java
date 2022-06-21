package heima.t3;

public class Load9 {
    public static void main(String[] args) {
//        Singleton.test();
        Singleton.getInstance();
    }
}

class Singleton {
    // 测试访问外部的静态方法 是否会触发lazyholder 的初始化
    public static void test(){
        System.out.println("test");
    }

    //1. 使用私有方法
    private Singleton() {

    }

    //2.使用静态内部类 只要应用中不适用静态内部类 JVM就不会创建
    // 单例对象，从而实现懒汉式的延迟加载 也就是说同时保证延迟加载
    //  和线程安全
    private static class LazyHolder {
        private static final Singleton SINGLETON = new Singleton();
        static {
            System.out.println("lazy holder init");
        }
    }

    public static Singleton getInstance() {
        return LazyHolder.SINGLETON;
    }



}
