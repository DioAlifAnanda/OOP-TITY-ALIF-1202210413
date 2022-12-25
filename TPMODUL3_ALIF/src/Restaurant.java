public class Restaurant implements Runnable {

    private boolean waiting = false;
    private static final Object lock = new Object();
    private static int Number = 1;

    @Override
    public void run() {
        while (true) {
            Coffee();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup(boolean waitingForPickup) {
        this.waiting = waitingForPickup;
    }

    public static int getCoffeeNumber() {
        return Number;
    }

    public void Coffee() {
        synchronized(Restaurant.lock) {
            
            if (this.waiting) {
                try {
                    System.out.println("Coffee Machine: Waiting for the Waiter to deliver the coffee");
                    Restaurant.lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            
            waiting = true;
            System.out.println("Coffee Machine:  Making Coffee Number " + Number++);
            Restaurant.lock.notifyAll();
            System.out.println("Coffee Machine: Telling the waiter to get the coffee\n");
        }
    }

    public static Object getLock() {
        return lock;
    }
}