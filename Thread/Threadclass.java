package Thread;


class FirstThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is Running ");
    }
}
class SecondThread1 extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is Running");
    }
}

public class Threadclass {
    public static void main(String[] args) {
        FirstThread s1 = new FirstThread();
        SecondThread1 s2 = new SecondThread1();
        s1.start();
        s2.start();
    }
}
