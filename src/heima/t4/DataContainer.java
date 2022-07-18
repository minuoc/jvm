package heima.t4;

import sun.misc.Unsafe;

import javax.xml.crypto.Data;
import java.lang.reflect.Field;

/**
 * @author chenlufeng
 * @date 2022/7/18
 */
public class DataContainer {
    private volatile int data;
    static final Unsafe unsafe;
    static final long DATA_OFFSET;

    static {
        try {
            //Unsafe 对象不能直接调用，只能通过反射获得
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new Error(e);
        }
        try {
            // data 属性在 DataContainer 对象中的偏移量，用于 Unsafe 直接访问该属性
            DATA_OFFSET = unsafe.objectFieldOffset(DataContainer.class.getDeclaredField("data"));
        } catch (NoSuchFieldException e) {
            throw new Error(e);
        }
    }

    public void increase() {
        int oldValue;
        while(true) {
            // 获取共享变量的旧值，可以在这一行加入断点，修改 data 调试 来加深理解
            oldValue = data;
            // cas 尝试修改 data 为 旧值 + 1， 如果期间旧值被别的线程改了，返回false
            if (unsafe.compareAndSwapInt(this,DATA_OFFSET,oldValue,oldValue + 1)) {
                return;
            }
        }
    }

    public void decrease() {
        int oldValue;
        while(true) {
            // 获取共享变量的旧值，可以在这一行加入断点，修改 data 调试 来加深理解
            oldValue = data;
            // cas 尝试修改 data 为 旧值 - 1， 如果期间旧值被别的线程改了，返回false
            if (unsafe.compareAndSwapInt(this,DATA_OFFSET,oldValue,oldValue - 1)){
                return;
            }
        }
    }

    public int getData() {
        return data;
    }
}
