
package Latihan;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class sepuluh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "E:\\BelajarJavaPraktikum\\Baskara\\src\\LoginCuy.txt"; 

        System.out.println("=== LOGIN ===");
        boolean isLoggedIn = false;

        while (!isLoggedIn) {
            System.out.print("Masukkan username: ");
            String inputUsername = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String inputPassword = scanner.nextLine();

            try {
                FileReader fileReader = new FileReader(fileName);
                StringBuilder fileContent = new StringBuilder();

                int ch;
                while ((ch = fileReader.read()) != -1) {
                    fileContent.append((char) ch); 
                }

                fileReader.close();

                String[] lines = fileContent.toString().split("\n");
                for (String line : lines) {
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
