public class App {
    public static void main(String[] args) throws Exception {
        TransportasiAir ta = new TransportasiAir(4,20000);
        ta.informasi();
        ta.berlayar();
        ta.berlabu();
        System.out.println("\n");
        Sampan sam = new Sampan(jumlahkursi : 20,biaya :50000,layar: 2);
        sam.informasi();
        sam.berlayar();
        sam.berlabu();
        sam.berlabu(2);
        System.out.println("\n");
        Kapal kap = new Kapal(50,10000,"Diesel");
        kap.informasi();
        kap.berlabu();
        kap.berlayar();
        kap.berlayar(20);
    }
}
