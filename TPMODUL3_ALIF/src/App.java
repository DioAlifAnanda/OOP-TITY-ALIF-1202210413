import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant machine = new Restaurant();
        int ID, orderQty;
        try {

            System.out.println("Enter Customer id: ");
            ID = input.nextInt();

            System.out.println("Enter how much coffee to made: ");
            orderQty = input.nextInt();

            Thread a = new Thread(machine);
            Waiters pelayan = new Waiters(ID, orderQty);
            Thread b = new Thread(pelayan);

            a.start();
            b.start();
            a.join();
            b.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}

