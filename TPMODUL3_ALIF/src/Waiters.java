public class Waiters implements Runnable {

    private final int orderQty;
    private final int customerID;
    static int Price = 25000;

    public Waiters(int customerID, int orderQty) {
        this.customerID = customerID;
        this.orderQty = orderQty;
    }
    @Override
    public void run() {
        
        while (true) {
            getCoffee();
            try {
                Thread.sleep(15000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void orderInfo() {
        System.out.println("==========================================================");
        System.out.println("Customer ID : " + this.customerID);
        System.out.println("Numbeer of Coffee: " + this.orderQty);
        System.out.println("Total Price: " + this.orderQty * Price);
        System.out.println("==========================================================");
    }
    

    public void getCoffee() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter: Coffee is ready to deliver");
            Restaurant coffeeMachine = new Restaurant();
            coffeeMachine.setWaitingForPickup(false);
            if (Restaurant.getCoffeeNumber() == this.orderQty + 1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the coffee machine to make another coffee\n");

        }
    }
}
