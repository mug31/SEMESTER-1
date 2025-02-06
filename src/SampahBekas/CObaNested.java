
package SampahBekas;
import java.util.Scanner;

class BuatTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaPelanggan;
        int totalHarga = 0;
        boolean tambahBarang = true;

        // Menu Utama
        System.out.println("########################################");
        System.out.println("           APLIKASI KASIR TOKO          ");
        System.out.println("########################################");
        System.out.print("Masukkan Nama Pelanggan: ");
        namaPelanggan = scanner.nextLine();
        
        while (tambahBarang) {
            System.out.println("\nPilih barang yang ingin dibeli:");
            System.out.println("[1] Buku Tulis - Rp. 10,000");
            System.out.println("[2] Bolpoin - Rp. 2,000");
            System.out.println("[3] Pensil - Rp. 3,000");
            System.out.println("[4] Penghapus - Rp. 1,000");
            System.out.print("Masukkan nomor barang: ");
            int pilihanBarang = scanner.nextInt();

            int hargaBarang = 0;
            String namaBarang = "";
            switch (pilihanBarang) {
                case 1:
                    hargaBarang = 10000;
                    namaBarang = "Buku Tulis";
                    break;
                case 2:
                    hargaBarang = 2000;
                    namaBarang = "Bolpoin";
                    break;
                case 3:
                    hargaBarang = 3000;
                    namaBarang = "Pensil";
                    break;
                case 4:
                    hargaBarang = 1000;
                    namaBarang = "Penghapus";
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    continue;
            }

            System.out.print("Masukkan jumlah " + namaBarang + ": ");
            int jumlahBarang = scanner.nextInt();
            int subTotal = hargaBarang * jumlahBarang;
            totalHarga += subTotal;

            System.out.println(namaBarang + " @" + hargaBarang + " x " + jumlahBarang + " = " + subTotal);

            System.out.print("Tambah barang lain? (Y/T): ");
            char pilihan = scanner.next().charAt(0);
            tambahBarang = (pilihan == 'Y' || pilihan == 'y');
        }

        // Menampilkan total belanja pelanggan
        System.out.println("\n======================================");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Total harga belanja: Rp. " + totalHarga);
        System.out.println("======================================");
        
        scanner.close();
    }
}
