//SALSA SABIELA ROSYADA 
import java.util.Scanner;

 
public class BismillahSukses {
    static int packaging(String pack){
        int biaya=0;
        if(pack.equalsIgnoreCase("Tidak Ada")){
            biaya = 0;
        }else if(pack.equalsIgnoreCase("Bubble Wrap")){
            biaya = 2000;
        }else if(pack.equalsIgnoreCase("Kayu")){
            biaya = 10000;
        }else if(pack.equalsIgnoreCase("Kardus")){
            biaya = 5000;
        }
        return biaya;
    }
    
    static double berat(double bb){
        int biaya = 0;
        if(bb<=1){
            biaya = 0;
                       
        }else if(bb>1 && bb<=7){
            biaya = 3000;
            
        }else if(bb>7 && bb<=15){
            biaya = 5000;
        }
        return biaya;
    }
    
    static int layanan(String jp){
        int ongkos = 0;
        
        if(jp.equalsIgnoreCase("HIS")){
            ongkos = 250000;
        }else{
            ongkos = 12000;
        }
        return ongkos;
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String kotkab [] = {"Halmahera Barat","Halmahera Utara","Halmahera Selatan","Halmahera Timur"
            ,"Halmahera Tengah","Kepulauan Sula","Pulau Morotai","Pulau Talibu","Ternate","Tidore Kepulauan"};
        String kotkab1 [] = {"Buru","Buru Selatan","Kepulauan Aru","Maluku Barat Daya"
            ,"Maluku Tengah","Maluku Tenggara","Kepulauan Tanimbar","Seram Bagian Barat"
            ,"Seram Bagian Timur","Ambon"," Tual"};
        
        int[] tarif = {12000,12000,12000,12000,12000,14000,14000,14000,8000,8000};
        int [] tarif1 = {20000,20000,25000,28000,28000,28000,30000,30000,30000,35000,35000};
       
        System.out.println("*********************SISTEM EKSPEDISI SI FAST**********************");
        System.out.println("--------------------------Asal Pengiriman--------------------------");
        System.out.println("Provinsi \t: MALUKU UTARA ");
        System.out.println("Kota \t\t: TERNATE ");
        System.out.print("Pengirim \t: ");
        String pengirim = sc.nextLine();
        System.out.print("No. Telepon \t: ");
        String tlp =  sc.nextLine();
        System.out.print("Kecamatan \t: ");
        String kec = sc.nextLine(); 
        System.out.print("Alamat Lengkap  : ");
        String alamat = sc.nextLine();
        System.out.println("");
        
        int harga = 0;
        int i =0;
        String kota = null;
        String kode = null;
        System.out.println("-------------------------Tujuan Pengiriman-------------------------");
        System.out.print("Provinsi \t: ");
        String prov = sc.nextLine();
        if(prov.equalsIgnoreCase("MALUKU UTARA")){
            kode = "MLKUT";
            System.out.print("Kota \t\t: ");         
            kota = sc.nextLine();
            for( i=0; i<kotkab.length; i++){
                if(kota.equalsIgnoreCase(kotkab[i])){
                    harga=tarif[i];
                }
            }                               
        }else if(prov.equalsIgnoreCase("MALUKU")){
            kode = "MLK";
            System.out.print("Kota \t\t: ");         
            kota = sc.nextLine();
            for( i=0; i<kotkab1.length; i++){
                if(kota.equalsIgnoreCase(kotkab1[i])){
                    harga=tarif1[i];
                }
            }                    
        }else{
            System.out.println("\t\t\t +++ SOMETHING WAS MISSING +++");
        }
        
        System.out.print("Penerima \t: ");
        String penerima = sc.nextLine();
        System.out.print("No. Telepon \t: ");
        String tlpn = sc.nextLine();
        System.out.print("Kecamatan \t: ");
        String kecp = sc.nextLine();
        System.out.print("Alamat Lengkap  : ");
        String address = sc.nextLine();
        System.out.println("");
        
        System.out.println("==========================Informasi Barang=========================");
        System.out.println("-------------------------Pilih Jenis Barang------------------------");
        System.out.println("1. Regular ");
        System.out.println("2. Fragile ");
        System.out.print("Jenis Barang : ");
        String jenis = sc.nextLine();
        System.out.print("Deskripsi Barang : ");
        String des = sc.nextLine();
        System.out.println("");
        
        System.out.println("------------------------Pilih Jenis Layanan------------------------");
        System.out.println("1. HIS");//250000
        System.out.println("2. BHS");//12000
        System.out.print("Jenis Layanan : ");
        String jp = sc.nextLine();
        System.out.println("Biaya : " +"Rp. "+ layanan(jp));
        System.out.println("");
        
        System.out.println("--------------------------Jenis Packaging--------------------------");
        System.out.println("1. Bubble Wrap");
        System.out.println("2. Kayu");
        System.out.println("3. Kardus");
        System.out.println("4. Tidak Ada");
        System.out.print("Pacakging : ");
        String pack = sc.nextLine();
        System.out.println("Biaya Packaging : "+"Rp. " + packaging(pack));
        
        System.out.print("Jumlah Barang : ");
        int jmlbrg = sc.nextInt();
        
        System.out.print("Berat Barang (Kg) : ");
        double bb = sc.nextDouble();
        
        System.out.println("Biaya Tambahan : "+"Rp. " + (int)berat(bb));
        
        System.out.println("Biaya Kirim : Rp. " + harga);
                 
        System.out.println("");
      
        int total = layanan(jp) + packaging(pack) + (int)berat(bb) + harga;
        System.out.println("Total Biaya yang Harus Dibayarkan : "+"Rp. " + total);
        
        
        
        
        for(i = 0; i<3; i++){
            System.out.println("");
        }
        System.out.print("Cetak Resi (Y/T)?");
        String cetak = sc.next();
        if(cetak.equalsIgnoreCase("Y")){
            System.out.println("________________________________________________________________________________");
            System.out.println("");
            System.out.println("========================E-CONSIGNMENT NOTE(E-CONNOTE)===========================");
            System.out.println("SI FAST MALUKU & MALUKU UTARA");
            System.out.println("Jalan Hasan Busoiri 124 Pantai Sagu Pulau Batang Dua");
            System.out.println("Maluku Utara");
            System.out.println("Kode Pos : 97751");
            System.out.println("Telepon : 0812 3456 7890");
            System.out.println("================================================================================");     
            System.out.println("-------------Asal Pengiriman------------------Tujuan Pengiriman-----------------");
            System.out.println("Provinsi \t: MALUKU UTARA \t\t Provinsi \t : " + prov);
            System.out.println("Kota \t\t: TERNATE    \t\t Kota \t\t : " + kota);
            System.out.println("");

            System.out.println("Pengirim : ---------------------------------------------------------------------");
            System.out.println(pengirim + "\t\t\t\t\t" + "No. Telp: " + "\n" + kec + "\t\t\t\t" +  tlp + "\n" + alamat);
            System.out.println("");
            System.out.println("Penerima : ---------------------------------------------------------------------");
            System.out.println(penerima + "\t\t\t\t\t" + "No. Telp: " + "\n" + kec + "\t\t\t\t" +  tlpn + "\n" + address);
            System.out.println("................................................................................");
            System.out.println("\t\t    No. e-cannote \t" + kode + "12462" + tlp + jmlbrg + (int)bb);
            System.out.println("................................................................................");
            System.out.println("");
            System.out.println("DETAIL BARANG                                                    Biaya ");
            System.out.println("Jenis Barang  : " + jenis);
            System.out.println("Deskripsi     : " + des);
            System.out.println("Jumlah Barang : " + jmlbrg + " Buah");
            System.out.println("Packaging     : " + pack + "\t\t\t\t\t\tRp." + packaging(pack));        
            System.out.println("Berat Barang  : " + bb + " Kg" + "\t\t\t\t\t\tRp." + (int)berat(bb));
            System.out.println("Service       : " + jp + "\t\t\t\t\t\tRp." + layanan(jp));
            System.out.println("Biaya Kirim   : " + "\t\t\t\t\t\tRp." + harga);
            System.out.println("Pembayaran    : Cash ");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Total Biaya   :                                                 " + "Rp." + total);
            System.out.println("--------------------------------------------------------------------------------");

            System.out.println("================================================================================");
            System.out.println("________________________________________________________________________________");
        }else{
            System.out.println("%%%%%%%%% THANK YOU :):) %%%%%%%%%");
        }
       
    }
         
}