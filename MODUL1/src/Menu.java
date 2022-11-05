public class Menu {
        public String[] nama = {"Bakso","es teh","brownies"};
        public String[] categories = {"(makanan)","(minuman)","(dessert)"};
        public String[] price = {"10000","5000","15000"};

        public void tampilMenu(){
            System.out.println("1"+ nama[0]+categories[0]+" : "+price[0]);
            System.out.println("2"+ nama[1]+categories[1]+" : "+price[1]);
            System.out.println("3"+ nama[2]+categories[2]+" : "+price[2]);

    }
    public void detailMenu(String a){
        switch(a){
            case "Bakso":
            System.out.println(nama[0]+categories[0]+" : "+price[0]);
            break;
            case "es teh":
            System.out.println(nama[1]+categories[1]+" : "+price[1]);
            break;
            case " brownies":
            System.out.println(nama[2]+categories[2]+" : "+price[2]);
            break;
            default:
            System.out.println("Tidak ada menu pilihan ");
            break;
        }   
    } 
}
