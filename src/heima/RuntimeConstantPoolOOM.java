package heima;

import java.util.HashSet;
import java.util.Set;

/**
 * @author chenlufeng
 * @date 2022/7/1
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while(true) {
            set.add(String.valueOf(i ++).intern());
        }
    }
}
