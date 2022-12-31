import java.util.Scanner;
import java.util.InputMismatchException;

public class App {

    public static void main(String[] args) throws Exception {
        boolean repeat = true;
        Calculation cation = new Calculation();
        Thread tread = new Thread(cation);
        Scanner sner = new Scanner(System.in);
        do{
            System.out.println("====MENU PROGRAM====");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3. Trapezoid");
            try{
                System.out.print("Select Menu : ");
                int pilih = sner.nextInt();
                switch (pilih){
                    case 1:
                        System.out.print("enter the length of the side of the square : ");
                        double s = sner.nextDouble();
                        if(s<=1){
                            throw new IllegalArgumentException("must be more than 1");
                        }
                        cation.set(s);
                        tread.start();
                        tread.join();
                        System.out.println("The Calculation result: "+cation.getSquare());
                        break;
                    case 2:
                        System.out.print("Enter the radius of the circle : ");
                        double radius = sner.nextDouble();
                        if(radius<=1){
                            throw new IllegalArgumentException("must be more than 1");
                        }
                        cation.setCircle(radius);
                        tread.start();
                        tread.join();
                        System.out.println("The Calculation result: "+cation.getCircle()); 
                        break;
                    case 3:
                        System.out.print("Insert the side of the baseof the trapezoid : ");
                        double a = sner.nextDouble();
                        System.out.print("Enter the upperside of the trapezoid : ");
                        double b = sner.nextDouble();
                        System.out.print("Enter the height of the trapezoid : ");
                        double t = sner.nextDouble();
                        if(a<=1){
                            throw new IllegalArgumentException("must be more than 1");
                        }
                        cation.setTrapezoid(a, b, t);
                        tread.start();
                        tread.join();
                        System.out.println("The Calculation result: "+cation.getTrapezoid()); 
                        break;
                    default:
                        System.out.println("options not avaible");
                        continue;
                }
                repeat = false;
            }catch(InputMismatchException e){
                System.out.println("=== Error : Input Must be a number ===");
                break;
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            catch(IllegalArgumentException e){
                System.out.println(e);
            }
        }while(repeat);
            sner.close();
    }
}