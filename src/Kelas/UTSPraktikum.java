
package Kelas;
import java.util.Scanner;
public class UTSPraktikum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int pelanggan = 0;
        
        String DaftarBarang = "";
        boolean a = true;
        
        
        System.out.println("#####################");
        System.out.println("aplikasi kasir toko bang");
        System.out.println("#####################");
        
        System.out.println("Masukkan ID Pengguna: ");
        String ID = scanner.nextLine();
        System.out.println("Masukkan PIN: ");
        int PIN = scanner.nextInt();
        scanner.nextLine();
        
        while (a){
            System.out.println("####################");
            System.out.println("Menu utama");
            System.out.println("####################");
            System.out.println("[T] Tambah Transaksi Pembelian");
            System.out.println("[D] Daftar Transaksi Pembelian");
            System.out.println("[X] Exit");
            System.out.print("Pilih Menu: ");
            String menu  = scanner.nextLine().toUpperCase();
            
            if(menu.equals("T")){
                pelanggan++;
                System.out.println("==================");
                System.out.println("Tambah Transaksi Pembelian");
                System.out.println("==================");
                
                System.out.print("Masukkan nama Pelanggan ke-"+ pelanggan + ": ");
                String namaPelanggan = scanner.nextLine();
                
                int TotalHarga = 0;
                String detail = "\n==============\n";
                detail += "Nama Pelanggan ke " + pelanggan + ": " + namaPelanggan + "\n";
                detail += "----------------\n";
                
                boolean b = true;
                int nomorBarang = 0;
                
                while(b){
                System.out.println("[1] Buku Tulis @Rp. 10.000");
                System.out.println("[2] Bolpoin @Rp. 5.000");
                System.out.println("[3] Pensil @Rp. 2.000");
                System.out.println("[4] Penghapus @Rp. 1.000");
                System.out.print("Pilih Nomor Barang: ");
                int barang = scanner.nextInt();
                scanner.nextLine();
                String namaBarang="";
                int hargaBarang=0;
                
                switch (barang){
                    case 1 :
                        namaBarang = "Buku Tulis";
                        hargaBarang = 10000;
                        break;
                    case 2 :
                        namaBarang = "Bolpoin";
                        hargaBarang = 3000;
                        break;
                    case 3 :
                        namaBarang = "Pensil";
                        hargaBarang = 2000;
                        break;
                    case 4 :
                        namaBarang = "Penghapus";
                        hargaBarang = 1000;
                        break;
                } 
                System.out.print("Masukkan jumlah " + namaBarang + ": ");
                int jumlah = scanner.nextInt();
                scanner.nextLine();
                
                int subtotal = hargaBarang*jumlah;
                TotalHarga += subtotal;
                nomorBarang++;
                    
                
                System.out.println("\nTambah Barang?");
                System.out.println("[Y] ya");
                System.out.println("[T] Tidak");
                String tambah = scanner.nextLine().toUpperCase();
                b = "Y".equals(tambah);
                detail+="("+ nomorBarang + ")" + namaBarang + "@Rp. " + hargaBarang + "\n"+ "Jumlah barang: "+ jumlah + "\n" + "Harga barang: "+ subtotal+ "\n"+ "------------------------\n";
                
                
            } 
                detail +="total harga barang: " + TotalHarga + "\n" + "============================";
                DaftarBarang += detail;
            } else if (menu.equals("D")){
                System.out.println(DaftarBarang);
                
            } else if (menu.equals("X")){
                a = false;
                
                System.out.println(DaftarBarang);
                System.out.println("\nTrimakasiii telah berbelanja");
            } else {
                System.out.println("menu tidak ada");
            }
        }
        scanner.close();
    }
}
