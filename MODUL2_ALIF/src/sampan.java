public class sampan {
    public class Sampan extends TransportasiAir{
        protected Integer layar;
        public Sampan(int jumlahKursi, int biaya, int layar){
            super(jumlahKursi,biaya);
            this.layar = layar;
        }
        @Override
        public void informasi(){
            System.out.println("Transportasi air jenis Sampan diketahui dengan kursi berjumlah "+
            this.jumlahKursi+" ditetapkan dengan biaya sebesar Rp. " + this.biaya);
        }
        @Override
        public void berlayar(){
            System.out.println("Transportasi air jenis sampan sedang berlayar menggunakan " +this.layar + " layar");
        }
        @Override
        public void berlabu(){
            System.out.println("Transportasi air jenis sampan pantai tanpa jangkar");
        }
        public void berlabu(int jangkar){
            System.out.println("ransportasi air jenis sampan pantai berlabuh di pantai menggunakan " + jangkar);
        }
        
    }
    
    
}
