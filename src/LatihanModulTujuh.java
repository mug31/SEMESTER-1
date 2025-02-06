import java.util.Scanner;
public class LatihanModulTujuh {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 int[] angka = new int[5];
 // Mengisi array dengan input pengguna
 for (int i = 0; i < angka.length; i++) {
 System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
 angka[i] = scanner.nextInt();
 }
 int max = angka[0];
 int min = angka[0];
 // Menentukan nilai maksimum dan minimum
 for (int elemen : angka) {
 if (elemen > max) {
 max = elemen;
 }
 if (elemen < min) {
 min = elemen;
 }
 }
 System.out.println("Nilai maksimum: " + max);
 System.out.println("Nilai minimum: " + min);
 }
}