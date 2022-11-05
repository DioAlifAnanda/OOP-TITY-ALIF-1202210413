package MODUL1;

import java.util.Scanner;

public class Server {

    public Integer pilihan;
    public Scanner sc = new Scanner(System.in);

    public void formMenu(){
        System.out.println("================");
        System.out.println("1. Menu \n2. Pilih Menu \n3. keluar \n");
        System.out.println("================");
        System.out.print("Masukan pilihan : ");
        pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
            System.out.println("menu");
            break;
            case 2:
            System.out.println("Pilih Mneu");
            break;
            case 3:
            System.out.println("keluar");
            break;
            default:
            break;

        }
    }
    public Integer pilih(){
        return pilihan;
    }

}
        
