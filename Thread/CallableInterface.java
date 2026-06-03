package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableInterface {
    public static void main(String[] args) throws Exception{
        Callable<String> task = () -> "Data calculated by " + Thread.currentThread().getName();

        // 2. Wrap it in a FutureTask so a standard Thread can execute it
        FutureTask<String> futureTask = new FutureTask<>(task);
        Thread t1 = new Thread(futureTask);
        t1.start();

        // 3. Get and print the result (Main thread waits here until t1 finishes)
        String result = futureTask.get();
        System.out.println("Result from Thread: " + result);
    }
}
