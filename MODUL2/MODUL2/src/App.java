public class App {
    public static void main(String[] args) throws Exception {
        
        TransportasiAir trans = new TransportasiAir(4,20000);
        trans.informasi();
        trans.berlayar();
        trans.berlabu();

        System.out.println("\n");
        Sampan sa = new Sampan(20,50000, 2);
        sa.informasi();
        sa.berlayar();
        sa.berlabu();
        System.out.println("\n");
        Kapal pal = new Kapal(50,10000,"Diesel");
        pal.informasi();
        pal.berlabu();
        pal.berlayar();
        pal.berlayar(20);

    }
}
