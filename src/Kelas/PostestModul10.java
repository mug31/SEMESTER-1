
package Kelas;

import java.io.*;
import java.util.Scanner;

public class PostestModul10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String fileName = "E:\\BelajarJavaPraktikum\\Baskara\\src\\UserLogin.txt";

        
        System.out.println("=== REGISTRASI ===");
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(username + ";" + password);
            writer.newLine();
            System.out.println("Registrasi berhasil!");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan data: " + e.getMessage());
        }

        
        System.out.println("\n=== LOGIN ===");
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] userData = line.split(";");
                    if (userData[0].equals(inputUsername) && userData[1].equals(inputPassword)) {
                        isLoggedIn = true;
                        break;
                    }
                }
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
            }

            if (isLoggedIn) {
                System.out.println("Login berhasil! Selamat datang, " + inputUsername);
            } else {
                System.out.println("Username atau password salah. Silakan coba lagi.");
            }
        }
    }
    
}
