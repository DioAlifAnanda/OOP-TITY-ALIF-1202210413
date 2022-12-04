public class Handphone extends Perangkat {
    protected boolean fingerprint;
    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }
    //overriding
    @Override
    public void informasi(){
        System.out.println("Handphone ini memiliki driver tipe "+drive+" dengan ram sebesar " +ram+" GB dan processor secepat " + processor +"0 Ghz. Selain itu handphone ini "+ (fingerprint == false ?" TIDAK Memiliki Fingerprint":" memiliki Fingerprint"));
    }
    public void call(int no_hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke No "+no_hp);
    }
    //method overloading
    public void sendSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp);
    }
    public void sendSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No "+no_hp1+" dan ke No "+ no_hp2);
    }
}

