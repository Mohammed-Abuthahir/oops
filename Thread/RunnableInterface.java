package Thread;

class simpleThread implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " is Excecuting");
    }
}
public class RunnableInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(new simpleThread());
        t1.start();
    }
}
