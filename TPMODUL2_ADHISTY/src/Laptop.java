public class Laptop extends Perangkat {
    protected boolean webcam;
    protected String email;
    protected String game;
    public Laptop(String drive, int ram, float processor, boolean
    webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    
    // method overriding
    @Override
    public void informasi(){
        System.out.println("Laptop ini memiliki driver tipe "+drive+" dengan ram sebesar " +ram+" GB dan processor secepat " + processor +"0 Ghz. Selain itu laptop ini juga "+ (webcam == false ?" TIDAK Memiliki Webcam":" memiliki Webcam"));
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGame(String game){
        this.game = game;
    }
    public String getGame(){
        return this.game;
    }
    public String getEmail(){
        return this.email;
    }
    public void bukaGame(String nama_game){
            System.out.println("laptop berhasil membuka game " + nama_game);
    }
    //overloading
    public void sendEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }
    public void sendEmail(String email1,String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 +" dan ke " + email2);
    }
}

