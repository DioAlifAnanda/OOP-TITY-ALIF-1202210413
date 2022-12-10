public class Kapal extends TransportasiAir {
    protected String mesin;
    public Kapal(int jumlahKursi,int biaya,String mesin){
        super(jumlahKursi,biaya);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi air jenis Kapal diketahui dengan kursi berjumlah "+
        this.jumlahKursi+" ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin" +
        this.mesin + " dengan kecepatan tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi air jenis kapal sedang berlayar menggunakan mesin" +
        this.mesin + " dengan kecepatan kecepatan stabil di kisaran " + kecepatan + " knot");
    }
    
    @Override
    public void berlabu(){
        System.out.println("Transportasi air jenis kapal berlabuh di pantai");
    }

    
}
