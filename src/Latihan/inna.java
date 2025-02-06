package Latihan;

import java.util.Scanner;

public class inna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah peserta: ");
        int peserta = scanner.nextInt();
        System.out.print("Masukkan jumlah soal: ");
        int soal = scanner.nextInt();

        int[] noTes = new int[peserta];
        String[] namaPeserta = new String[peserta];
        char[][] jawabanPeserta = new char[peserta][soal];
        char[] kunciJawaban = new char[soal];

        data(peserta, soal, scanner, noTes, namaPeserta, jawabanPeserta);
        KunciJawaban(soal, scanner, kunciJawaban);
        JawabanPeserta(noTes, namaPeserta, jawabanPeserta);
        KunciJawaban(kunciJawaban);
        HasilUjian(peserta, soal, noTes, namaPeserta, jawabanPeserta, kunciJawaban);
    }

    public static void data(int peserta, int soal, Scanner scanner, int[] noTes, String[] namaPeserta, char[][] jawabanPeserta) {
        for (int i = 0; i < peserta; i++) {
            System.out.print("Nomor Tes Peserta ke-" + (i + 1) + ": ");
            noTes[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Nama Peserta ke-" + (i + 1) + ": ");
            namaPeserta[i] = scanner.nextLine();
            for (int j = 0; j < soal; j++) {
                System.out.print("Jawaban soal " + (j + 1) + ": ");
                jawabanPeserta[i][j] = scanner.next().toUpperCase().charAt(0);
            }
            System.out.println();  // Menambah jarak setelah memasukkan data peserta
        }
    }

    public static void KunciJawaban(int soal, Scanner scanner, char[] kunciJawaban) {
        for (int i = 0; i < soal; i++) {
            System.out.print("Kunci jawaban soal " + (i + 1) + ": ");
            kunciJawaban[i] = scanner.next().toUpperCase().charAt(0);
        }
    }

    public static void JawabanPeserta(int[] noTes, String[] namaPeserta, char[][] jawabanPeserta) {
        System.out.println("\nJawaban Peserta Ujian");
        System.out.println("\tNO.TES"+"\tNAMA"+    "\tJAWABAN");
        for (int i = 0; i < noTes.length; i++) {
            System.out.print(noTes[i] + "    " + namaPeserta[i] + "    ");
            for (char c : jawabanPeserta[i]) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void KunciJawaban(char[] kunciJawaban) {
        System.out.println("\nKunci Jawaban");
        System.out.print("         ");
        for (char c : kunciJawaban) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void HasilUjian(int peserta, int soal, int[] noTes, String[] namaPeserta, char[][] jawabanPeserta, char[] kunciJawaban) {
        System.out.println("\nNilai Peserta Ujian");
        System.out.println("NO.TES" +  "\tNAMA" +   "\tBENAR"   + "\tNILAI");
        for (int i = 0; i < peserta; i++) {
            int benar = 0;
            for (int j = 0; j < soal; j++) {
                if (jawabanPeserta[i][j] == kunciJawaban[j]) {
                    benar++;
                }
            }
            float nilai = (benar / (float) soal) * 100; 
            System.out.printf("%d\t%s\t%d\t%.2f\n", noTes[i], namaPeserta[i], benar, nilai);

        }
    }
}
