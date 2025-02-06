
package Kelas;
import java.util.Scanner;
public class UTSSem1 {
    public static void main(String[] args) {
        String Total="";
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("#####################");
        System.out.println("Aplikasi Kasir Toko");
        System.out.println("#####################");
        
        System.out.println("Masukkan ID Pengguna: ");
        String userID = scanner.next();
        System.out.println("Masukkan PIN: ");
        String PIN = scanner.next();
        
        
        System.out.println("#####################");
        System.out.println("Menu Utama");
        System.out.println("#####################");
        System.out.println("[T] Tambah Transaksi Pembelian");
        System.out.println("[D] Daftar Transaksi Pembelian");
        System.out.println("[X] Keluar");
        System.out.println("Pilih menu: ");
        
        String Tambah = scanner.nextLine();
     
        String Daftar = scanner.nextLine();
        String Keluar = scanner.nextLine();
            
            for (int i=1; i<=1;i++){
                System.out.println("##########################");
                System.out.println("Tambah Transaksi Pembelian");
                System.out.println("##########################");
                
                System.out.println("Masukan nama pelanggan: ");
                String nama = scanner.next();
                
                System.out.println("[1] Buku Tulis @Rp. 10.000");
                System.out.println("[2] Pulpen @Rp. 3.000");
                System.out.println("[3] Penghapus @Rp. 1.000");
                System.out.println("[4] Pensil @Rp. 10.000");
                System.out.println("Pilih Nomor Barang: ");
                int Barang = scanner.nextInt();
                
                
                 if (Barang == 1){
                     System.out.println("Masukan Jumlah Buku: ");
                     int JlBuku = scanner.nextInt();
                 } if (Barang == 2){
                     System.out.println("Masukan Jumlah Pulpen: ");
                     int JlPulpen = scanner.nextInt();
                  
                 } if (Barang == 3){
                     System.out.println("Masukkan Jumlah Panghapus: ");
                     int JlPenghapus = scanner.nextInt();
                    
                 } if (Barang == 4){
                     System.out.println("Masukkan Jumlah Pensil: ");
                     int JlPensil = scanner.nextInt();
                 } 
                 
                 System.out.println("-----------------------");
                 System.out.println("Tambah Barang?");
                 System.out.println("[Y] Ya");
                 System.out.println("[T] Tidak");
                 String tambahan = scanner.next();
                 
                 if (tambahan=="Y"){
                     return;
                 }
               
            } 
        
    }
    
}
