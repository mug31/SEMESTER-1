
package Latihan;

import java.util.Scanner;

class Transaksi {
    int nominal;
    String jenis; // "Masuk" atau "Keluar"
    String tanggal; // Format "YYYY-MM-DD"

    Transaksi(int nominal, String jenis, String tanggal) {
        this.nominal = nominal;
        this.jenis = jenis;
        this.tanggal = tanggal;
    }
}

public class maklahbang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Data transaksi
        Transaksi[] transaksi = {
            new Transaksi(50000, "Masuk", "2024-11-01"),
            new Transaksi(20000, "Keluar", "2024-11-05"),
            new Transaksi(30000, "Masuk", "2024-11-10"),
            new Transaksi(10000, "Keluar", "2024-11-15"),
            new Transaksi(15000, "Masuk", "2024-11-20")
        };

        // Input filter jenis transaksi
        System.out.println("Masukkan jenis transaksi (Masuk/Keluar/semua):");
        String jenisFilter = scanner.next();
        
        // Input filter tanggal
        System.out.println("Masukkan tanggal mulai (YYYY-MM-DD):");
        String tanggalMulai = scanner.next();
        System.out.println("Masukkan tanggal akhir (YYYY-MM-DD):");
        String tanggalAkhir = scanner.next();

        // Filter transaksi
        boolean ditemukan = false;
        System.out.println("\nHasil pencarian:");
        for (Transaksi t : transaksi) {
            // Filter jenis transaksi
            boolean cocokJenis = jenisFilter.equalsIgnoreCase("semua") || t.jenis.equalsIgnoreCase(jenisFilter);
            
            // Filter tanggal transaksi
            boolean cocokTanggal = t.tanggal.compareTo(tanggalMulai) >= 0 && t.tanggal.compareTo(tanggalAkhir) <= 0;

            if (cocokJenis && cocokTanggal) {
                System.out.println("Nominal: " + t.nominal + ", Jenis: " + t.jenis + ", Tanggal: " + t.tanggal);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada transaksi yang sesuai dengan filter.");
        }

        scanner.close();
    }
}

