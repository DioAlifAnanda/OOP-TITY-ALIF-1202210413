public class App {
    public static void main(String[] args) throws Exception {
        Perangkat me = new Perangkat("Adata",2,1.80F);
        me.informasi();
        System.out.print("\n");

        Laptop device1  = new Laptop("Seagate",8,2.40F,true);
        device1.setEmail("alip@gmail.com");
        device1.setGame("Dota2");
        device1.informasi();
        device1.bukaGame(device1.getGame());
        device1.sendEmail(device1.getEmail());
        device1.sendEmail("annarji@gmail.com","rusmangc@gmail.com");

        System.out.print("\n");
        Handphone device2 = new Handphone("Sandisk",3,2.20F,false); 
        device2.informasi();
        device2.call(628122122);
        device2.sendSMS(62852112);
        device2.sendSMS(628121212,629292211);
    }
}
