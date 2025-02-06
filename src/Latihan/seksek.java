package Latihan;

import java.io.*;
import java.util.Scanner;

public class seksek {
    private static final String FILE_NAME = "data.txt"; 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== REGISTRASI ===");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: "); 
        String password = scanner.nextLine();

       
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(username + "," + password);
            writer.newLine();
            System.out.println("Registrasi berhasil!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
            return; 
        }
        
        
        System.out.println("\n=== LOGIN ===");
        System.out.print("Masukkan username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String loginPassword = scanner.nextLine();

        // Baca dari file dan verifikasi
        boolean isLoginSuccessful = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    if (storedUsername.equals(loginUsername) && storedPassword.equals(loginPassword)) {
                        isLoginSuccessful = true;
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca data: " + e.getMessage());
        }

        // Hasil login
        if (isLoginSuccessful) {
            System.out.println("Login berhasil! Selamat datang, " + loginUsername + "!");
        } else {
            System.out.println("Login gagal! Username atau password salah.");
        }
    }
}
