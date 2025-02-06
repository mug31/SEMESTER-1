
package Latihan;

import java.util.Scanner;

public class scn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
    
        System.out.print("Masukkan jumlah peserta: ");
        int peserta = scanner.nextInt();  
        System.out.print("Masukkan jumlah soal: ");
        int soal = scanner.nextInt();  

        int[] NoTes = new int[peserta];  
        String[] NamaPeserta = new String[peserta];  
        char[][] JawabanPeserta = new char[peserta][soal]; 
        char[] KunciJawaban = new char[soal]; 

        System.out.println("\nInput data peserta:");
        for (int i = 0; i < peserta; i++) {
            System.out.print("Nomor Tes Peserta ke-" + (i + 1) + ": ");
            NoTes[i] = scanner.nextInt();  
            scanner.nextLine();
            System.out.print("Nama Peserta ke-" + (i + 1) + ": ");
            NamaPeserta[i] = scanner.nextLine(); 
            System.out.println("Jawaban Peserta ke-" + (i + 1) + ":");
            for (int j = 0; j < soal; j++) {
                while (true) { 
                    System.out.print("Jawaban soal " + (j + 1) + ": ");
                    char jawaban = scanner.next().toUpperCase().charAt(0);  
                    if (jawaban >= 'A' && jawaban <= 'E') {
                        JawabanPeserta[i][j] = jawaban;
                        break;
                    } else {
                        System.out.println("Input tidak valid! Masukkan jawaban antara A sampai E.");
                    }
                }
            }
        }
        System.out.println("\nInput kunci jawaban:");
        for (int i = 0; i < soal; i++) {
            while (true) { 
                System.out.print("Kunci jawaban soal " + (i + 1) + ": ");
                char kunci = scanner.next().toUpperCase().charAt(0);  
                if (kunci >= 'A' && kunci <= 'E') {
                    KunciJawaban[i] = kunci;
                    break;
                } else {
                    System.out.println("Input tidak valid! Masukkan jawaban antara A sampai E.");
                }
            }
        }

        int[] jumlahBenar = new int[peserta];
        double[] nilai = new double[peserta];
        for (int i = 0; i < peserta; i++) {
            int benar = 0;
            for (int j = 0; j < soal; j++) {
                if (JawabanPeserta[i][j] == KunciJawaban[j]) {
                    benar++;
                }
            }
            jumlahBenar[i] = benar;
            nilai[i] = (benar / (double) soal) * 100;
        }
        tampilkanJawabanPeserta(NoTes, NamaPeserta, JawabanPeserta);
        tampilkanKunciJawaban(KunciJawaban);
        tampilkanHasilUjian(NoTes, NamaPeserta, jumlahBenar, nilai);
    }
    public static void tampilkanJawabanPeserta(int[] NoTes, String[] NamaPeserta, char[][] JawabanPeserta) {
        System.out.println("\nJawaban Peserta Ujian");
        System.out.printf("%-8s %-8s", "NO.TES", "NAMA");
        for (int i = 1; i <= JawabanPeserta[0].length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 0; i < NoTes.length; i++) {
            System.out.printf("%-8d %-8s", NoTes[i], NamaPeserta[i]);
            for (int j = 0; j < JawabanPeserta[i].length; j++) {
                System.out.printf("%3c", JawabanPeserta[i][j]);
            }
            System.out.println();
        }
    }
    public static void tampilkanKunciJawaban(char[] KunciJawaban) {
        System.out.println("\nKunci Jawaban");
        System.out.printf("%-8s", "");
        for (int i = 1; i <= KunciJawaban.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.printf("%-8s", "");
        for (char c : KunciJawaban) {
            System.out.printf("%3c", c);
        }
        System.out.println();
    }
    public static void tampilkanHasilUjian(int[] NoTes, String[] NamaPeserta, int[] jumlahBenar, double[] nilai) {
        System.out.println("\nNilai Peserta Ujian");
        System.out.printf("%-8s %-8s %-15s %-10s\n", "NO.TES", "NAMA", "Jumlah Benar", "Nilai");
        for (int i = 0; i < NoTes.length; i++) {
            System.out.printf("%-8d %-8s %-15d %-10.2f\n", NoTes[i], NamaPeserta[i], jumlahBenar[i], nilai[i]);
        }
    }
}

