import java.util.List;
import java.util.ArrayList;

public class Database {
    public static void main(String[] args) throws Exception {
        User us = new User ();
        Server serv = new Server();
        Menu men = new Menu();
        Database data = new Database ();

        System.out.println("SELAMAT DATANG DI RESTORAN EAD");
        System.out.println("SILAHKAN REGISTRASI DAHULU");
        System.out.println("==========================");

        us.formNama();
        us.formNo();
        us.success();
        
        while(true){
            serv.formMenu();
            if(serv.pilih()==1){
                men.tampilMenu();
            }else if(serv.pilih()==2){
                data.insert();
                System.out.println("================");
                data.search();
                System.out.println("Terimakasih");
                break;
            }else if(serv.pilih()==3){
                break;

            }
        }

        
    }


}
