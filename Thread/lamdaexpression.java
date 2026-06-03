package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class lamdaexpression {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        pool.execute(() -> System.out.println(Thread.currentThread().getName() + " handling Task A"));
        pool.execute(() -> System.out.println(Thread.currentThread().getName() + " handling Task B"));
        pool.shutdown();
    }
}
