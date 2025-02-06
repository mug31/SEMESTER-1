
package Kelas;
import java.util.Scanner;
public class LatSolB4UTS {
    public static void main(String[] args) {
        String tampil="";
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Menu Inventaris Barang");
        System.out.println("[1]tambah barang");
        System.out.println("[0]keluar");
        System.out.println("silakan pilih menu: ");
        int next = scanner.nextInt();
        int keluar = scanner.nextInt();
        
        if (next==1){
            System.out.println("=================");
            System.out.println("TAMBAH BARANG CUY");
            System.out.println("=================");
            System.out.println("Masukan Nama Supplier: ");
            String nama = scanner.next();
            System.out.print("Jumlah data yang akan dimasukan: ");
            int indata = scanner.nextInt();
            System.out.println("--------------");
             
                for (int j = 1; j<=indata; j++){
                System.out.println("Masukkan data barang ke-" + j );
                System.out.println("Kode Barang: ");
                String kode = scanner.next();
                System.out.println("Nama Barang: ");
                String name = scanner.next();
                System.out.println("Jumlah Harga: ");
                int jumlah = scanner.nextInt();
                System.out.println("Harga Barang: ");
                int harga = scanner.nextInt();
                System.out.println("-----------------");
                tampil+="kode barang: " + kode + " | Nama barang: "+name + " |Jumlah Barang "+ jumlah + " | Harga barang: " + harga+ "\n";
                                     
                }       
                        System.out.println("===================");
                        System.out.println("Cetak Harga Barang");
                        System.out.println("===================");
                        
                        System.out.println("Nama Supplier: "+ nama);
                       
                        System.out.println(tampil);
                       
            } 
                
        } 
    }

