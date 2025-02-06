
package Latihan;

import java.io.*;
import java.util.*;

public class wstrg {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data_ujian.txt"));

            int jumlahPeserta = Integer.parseInt(reader.readLine().split(":")[1].trim());
            int jumlahSoal = Integer.parseInt(reader.readLine().split(":")[1].trim());

            int[] noTes = new int[jumlahPeserta];
            String[] namaPeserta = new String[jumlahPeserta];
            char[][] jawabanPeserta = new char[jumlahPeserta][jumlahSoal];
            char[] kunciJawaban = new char[jumlahSoal];

            reader.readLine();
            for (int i = 0; i < jumlahPeserta; i++) {
                String[] data = reader.readLine().split(",");
                noTes[i] = Integer.parseInt(data[0].trim());
                namaPeserta[i] = data[1].trim();
                for (int j = 0; j < jumlahSoal; j++) {
                    jawabanPeserta[i][j] = data[j + 2].trim().charAt(0);
                }
            }
            reader.readLine();
            String[] kunci = reader.readLine().split(",");
            for (int i = 0; i < jumlahSoal; i++) {
                kunciJawaban[i] = kunci[i].trim().charAt(0);
            }
            int[] jumlahBenar = new int[jumlahPeserta];
            double[] nilai = new double[jumlahPeserta];
            for (int i = 0; i < jumlahPeserta; i++) {
                int benar = 0;
                for (int j = 0; j < jumlahSoal; j++) {
                    if (jawabanPeserta[i][j] == kunciJawaban[j]) {
                        benar++;
                    }
                }
                jumlahBenar[i] = benar;
                nilai[i] = (benar / (double) jumlahSoal) * 100;
            }
            tampilkanJawabanPeserta(noTes, namaPeserta, jawabanPeserta);
            tampilkanKunciJawaban(kunciJawaban);
            tampilkanHasilUjian(noTes, namaPeserta, jumlahBenar, nilai);

            reader.close(); 
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }

    public static void tampilkanJawabanPeserta(int[] noTes, String[] namaPeserta, char[][] jawabanPeserta) {
        System.out.println("\nJawaban Peserta Ujian");
        System.out.printf("%-8s %-8s", "NO.TES", "NAMA");
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
