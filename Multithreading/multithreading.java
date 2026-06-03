package Multithreading;

public class multithreading {
    public static void main(String[] args) {
        System.out.println(" ---- Restaurant Kitchan ----");

        // 1. Define Task A (Cooking Rice) using a Lambda expression
        Runnable cookRiceTask = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Chef 1: Cooking rice step " + i);
                try {
                    Thread.sleep(400); // Simulates time taken to cook
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        // 2. Define Task B (Chipping Veggies)
        Runnable chopVeggiesTask = () -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Chef 2: Chopping vegetable " + i);
                try {
                    Thread.sleep(300); // Simulates time taken to chop
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        };

        // 3. Create the actual Thread workers and give them their tasks
        Thread chef1 = new Thread(cookRiceTask);
        Thread chef2 = new Thread(chopVeggiesTask);

        // 4. Start both workers at the exact same time!
        chef1.start();
        chef2.start();
    }
}
