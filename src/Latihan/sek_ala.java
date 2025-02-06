package Latihan;

import java.io.*;
import java.util.Scanner;

public class sek_ala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "data.txt";

        while (true) {
            System.out.println("=== Menu ===");
            System.out.println("1. Pendaftaran");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            switch (pilihan) {
                case 1:
                    // Pendaftaran
                    System.out.print("Masukkan username baru: ");
                    String newUsername = scanner.nextLine();
                    System.out.print("Masukkan password baru: ");
                    String newPassword = scanner.nextLine();
                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
                        writer.write(newUsername + ":" + newPassword);
                        writer.newLine();
                        writer.close();
                        System.out.println("Data berhasil disimpan.");
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
                    }
                    break;

                case 2:
                    // Login
                    System.out.print("Masukkan username: ");
                    String username = scanner.nextLine();
                    System.out.print("Masukkan password: ");
                    String password = scanner.nextLine();
                    boolean loginBerhasil = false;

                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(fileName));
                        String line;
                        while ((line = reader.readLine()) != null) {
                            String[] parts = line.split(":");
                            if (parts[0].equals(username) && parts[1].equals(password)) {
                                loginBerhasil = true;
                                break;
                            }
                        }
                        reader.close();
                    } catch (IOException e) {
                        System.out.println("Terjadi kesalahan saat membaca data: " + e.getMessage());
                    }

                    if (loginBerhasil) {
                        System.out.println("Login berhasil! Selamat datang, " + username + "!");
                    } else {
                        System.out.println("Login gagal. Username atau password salah.");
                    }
                    break;

                case 3:
                    // Keluar
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
