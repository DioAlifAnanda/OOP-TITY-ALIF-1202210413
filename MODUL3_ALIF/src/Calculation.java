import java.net.SocketImpl;

public class Calculation implements Runnable{
    protected double radius,side,area;
    protected double phi = 3.14;

    public void run(){
        int startt = 3;
        System.out.println("=====program will start in=====");
        while(startt>=1){
            try{
                System.out.println("Starting with thread "+startt);
                Thread.sleep(1000);
                startt = startt - 1;
            }catch(InterruptedException e){
                System.out.println("counting error");
            }
        }
    }
    public void set(double panjang){
        try{
            if(panjang<=1){
                throw new IllegalArgumentException("must be more than 1");
            }else{
                this.area = panjang*panjang;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public double getSquare(){
        return this.area;
    }
    public void setCircle(double sisi){
        try{
            this.radius = sisi;
            if(this.radius <=1){
                throw new IllegalArgumentException("must be more than 1");
            }else{
                this.area = phi * this.radius * this.radius;
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public double getCircle(){
        return this.area;
    }
    public void setTrapezoid(double alas1, double alas2, double tinggi){
        try{
            if(alas1 <=1){
                throw new IllegalArgumentException("must be more than 1");
            }else{
                this.area = 0.5*tinggi*(alas1+alas2);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public double getTrapezoid(){
        return this.area;
    }
}
