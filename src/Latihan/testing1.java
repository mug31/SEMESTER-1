
package Latihan;

import java.util.Scanner;

public class testing1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] noTes = {24901, 24902, 24901, 24901};
        String[] namaPeserta = {"RUDI", "HERU", "AGUS", "HILMI"};
        char[][] jawabanPeserta = {
            {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
            {'B', 'A', 'A', 'A', 'A', 'A', 'A', 'A'},
            {'A', 'B', 'A', 'A', 'C', 'A', 'A', 'A'},
            {'A', 'B', 'C', 'A', 'C', 'A', 'D', 'A'}
        };
        
        char[] kunciJawaban = {'A', 'A', 'A', 'A', 'A', 'A', 'A', 'A'};

        int[] jumlahBenar = new int[namaPeserta.length];
        double[] nilai = new double[namaPeserta.length];
        for (int i = 0; i < namaPeserta.length; i++) {
            int benar = 0;
            for (int j = 0; j < kunciJawaban.length; j++) {
                if (jawabanPeserta[i][j] == kunciJawaban[j]) {
                    benar++;
                }
            }
            jumlahBenar[i] = benar;
            nilai[i] = (benar / (double) kunciJawaban.length) * 100;
        }
        tampilkanJawabanPeserta(noTes, namaPeserta, jawabanPeserta);
        tampilkanKunciJawaban(kunciJawaban);
        tampilkanHasilUjian(noTes, namaPeserta, jumlahBenar, nilai);
    }
    public static void tampilkanJawabanPeserta(int[] noTes, String[] namaPeserta, char[][] jawabanPeserta) {
        System.out.println("Jawaban Peserta Ujian");
        System.out.println("NO TES\tNAMA\tJAWABAN");
        for (int i = 1; i <= jawabanPeserta[0].length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        for (int i = 0; i < noTes.length; i++) {
            System.out.printf("%-8d %-8s", noTes[i], namaPeserta[i]);
            for (int j = 0; j < jawabanPeserta[i].length; j++) {
                System.out.printf("%3c", jawabanPeserta[i][j]);
            }
            System.out.println();
        }
    }
    public static void tampilkanKunciJawaban(char[] kunciJawaban) {
        System.out.println("\nKunci Jawaban");
        System.out.printf("%-8s", "");
        for (int i = 1; i <= kunciJawaban.length; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.printf("%-8s", "");
        for (char c : kunciJawaban) {
            System.out.printf("%3c", c);
        }
        System.out.println();
    }
    public static void tampilkanHasilUjian(int[] noTes, String[] namaPeserta, int[] jumlahBenar, double[] nilai) {
        System.out.println("\nNilai Peserta Ujian");
        System.out.printf("%-8s %-8s %-15s %-10s\n", "NO.TES", "NAMA", "Jumlah Benar", "Nilai");
        for (int i = 0; i < noTes.length; i++) {
            System.out.printf("%-8d %-8s %-15d %-10.2f\n", noTes[i], namaPeserta[i], jumlahBenar[i], nilai[i]);
        }
    }
}
