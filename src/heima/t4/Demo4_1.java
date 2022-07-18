package heima.t4;

/**
 * @author chenlufeng
 * @date 2022/7/15
 */
public class Demo4_1 {
    static int i = 0;
    static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()-> {
            for (int j = 0; j < 50000; j++) {
                synchronized (obj) {
                    i++;
                }
            }
        },"t1");

        Thread t2 = new Thread(()-> {
            for (int j = 0; j < 50000; j++) {
//                synchronized (obj) {
                    i--;
//                }
            }
        },"t2");

        t1.start();
        t2.start();
        // t1  和 t2 都执行完 再 打印
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
