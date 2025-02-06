package Latihan;

import java.io.*;
import java.util.*;

public class complex {
    private static final String FILE_NAME = "data_ujian.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Membaca data dari file jika ada
            List<String> fileData = readFile();

            // Menampilkan menu
            int pilihan;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Lihat Data Peserta dan Kunci Jawaban");
                System.out.println("2. Tambah Data Peserta");
                System.out.println("3. Tambah Kunci Jawaban");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                scanner.nextLine(); // Clear buffer

                switch (pilihan) {
                    case 1 -> tampilkanData(fileData);
                    case 2 -> tambahPeserta(fileData, scanner);
                    case 3 -> tambahKunciJawaban(fileData, scanner);
                    case 4 -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 4);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    private static List<String> readFile() throws IOException {
        File file = new File(FILE_NAME);
        List<String> fileData = new ArrayList<>();

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                fileData.add(line);
            }
            reader.close();
        }

        return fileData;
    }

    private static void writeFile(List<String> fileData) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (String line : fileData) {
            writer.write(line);
            writer.newLine();
        }
        writer.close();
    }

    private static void tampilkanData(List<String> fileData) {
        if (fileData.isEmpty()) {
            System.out.println("Tidak ada data untuk ditampilkan.");
            return;
        }

        System.out.println("\nData Ujian:");
        for (String line : fileData) {
            if (line.startsWith("Peserta:")) {
                String[] parts = line.substring(9).split(",", 3); // Ambil data setelah "Peserta:"
                String noTes = parts[0];
                String nama = parts[1];
                String jawaban = parts.length > 2 ? parts[2] : "-";
                System.out.println("Nomor Tes : " + noTes);
                System.out.println("Nama      : " + nama);
                System.out.println("Jawaban   : " + jawaban);
                System.out.println();
            } else if (line.startsWith("KunciJawaban:")) {
                String kunci = line.substring(13); // Ambil data setelah "KunciJawaban:"
                System.out.println("Kunci Jawaban : " + kunci);
                System.out.println();
            } else {
                System.out.println("Data tidak dikenal: " + line);
            }
        }
    }

    private static void tambahPeserta(List<String> fileData, Scanner scanner) throws IOException {
        System.out.print("Masukkan nomor tes: ");
        String noTes = scanner.nextLine();
        System.out.print("Masukkan nama peserta: ");
        String nama = scanner.nextLine();

        StringBuilder jawabanBuilder = new StringBuilder();
        System.out.println("Masukkan jawaban peserta satu per satu:");
        while (true) {
            System.out.print("Masukkan jawaban soal (A-E, atau 'selesai' untuk selesai): ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("SELESAI")) {
                break;
            }
            if (input.matches("[A-E]")) {
                if (jawabanBuilder.length() > 0) {
                    jawabanBuilder.append(",");
                }
                jawabanBuilder.append(input);
            } else {
                System.out.println("Input tidak valid! Masukkan antara A sampai E atau 'selesai'.");
            }
        }

        String dataPeserta = "Peserta:" + noTes + "," + nama + "," + jawabanBuilder.toString();
        fileData.add(dataPeserta);
        writeFile(fileData);
        System.out.println("Data peserta berhasil ditambahkan!");
    }

    private static void tambahKunciJawaban(List<String> fileData, Scanner scanner) throws IOException {
        StringBuilder kunciBuilder = new StringBuilder();
        System.out.println("Masukkan kunci jawaban satu per satu:");
        while (true) {
            System.out.print("Masukkan kunci soal (A-E, atau 'selesai' untuk selesai): ");
            String input = scanner.nextLine().toUpperCase();
            if (input.equals("SELESAI")) {
                break;
            }
            if (input.matches("[A-E]")) {
                if (kunciBuilder.length() > 0) {
                    kunciBuilder.append(",");
                }
                kunciBuilder.append(input);
            } else {
                System.out.println("Input tidak valid! Masukkan antara A sampai E atau 'selesai'.");
            }
        }

        String dataKunci = "KunciJawaban:" + kunciBuilder.toString();
        fileData.add(dataKunci);
        writeFile(fileData);
        System.out.println("Kunci jawaban berhasil ditambahkan!");
    }
}
