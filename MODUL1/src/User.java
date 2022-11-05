import java.util.Scanner;
public class User {
    public String nama;
    public String no;
    public Scanner sc = new Scanner (System.in);

    public void formNama(){
        System.out.println("Masukan nama : ");
        nama = sc.nextLine();
    }
    public void formNo(){
        System.out.println("Masukan no : ");
        no = sc.nextLine();
    }
    public void success(){
        System.out.println("Registrasi sukses ");
        System.out.println("nama :  " + nama);
        System.out.println("no handphone : "+ no);
            
    }

}
