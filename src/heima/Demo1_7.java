package heima;

/**
 * StringTable 也能够垃圾回收
 *
 * [GC (Allocation Failure) [PSYoungGen: 2048K->504K(2560K)] 2048K->708K(9728K), 0.0009488 secs]
 * [Times: user=0.00 sys=0.00, real=0.00 secs]
 */
public class Demo1_7 {
    public static void main(String[] args) {
        int  i = 0;
        try {
            for (int j = 0; j < 10000; j++) {
                String.valueOf(j).intern();
                i++;
            }
        }catch (Throwable e){
            e.printStackTrace();
        }finally {
            System.out.println(i);
        }
    }
}
