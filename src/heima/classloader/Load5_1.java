package heima.classloader;

/**
 * @author chenlufeng
 * @date 2022/7/6
 */
public class Load5_1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("heima.classloader.F");
        System.out.println(aClass.getClassLoader());
    }
}
