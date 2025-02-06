package Liburan;

import java.util.Scanner;

public class SemiFix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Jumlah bahan yang Diperlukan: ");
        int jumlahBahan = scanner.nextInt();

        for (int i = 1; i <= jumlahBahan; i++) {
            System.out.println("\nBahan ke-" + i + ":");

            String namaBahan = inputNamaBahan(scanner);
            double hargaBarang = inputHargaBahan(scanner);
            double volumeBahan = inputVolumeBahan(scanner);
            double perSajian = inputPerSajian(scanner);

            double hargaPerSajian = hitungHargaPerSajian(hargaBarang, volumeBahan, perSajian);

            tampilkanHasil(namaBahan, hargaPerSajian);
        }
    }
    public static String inputNamaBahan(Scanner scanner) {
        System.out.print("Nama Bahan: ");
        return scanner.next();
    }
    public static double inputHargaBahan(Scanner scanner) {
        System.out.print("Harga Bahan: ");
        return scanner.nextDouble();
    }
    public static double inputVolumeBahan(Scanner scanner) {
        System.out.print("Volume Bahan (dalam mL/gr): ");
        return scanner.nextDouble();
    }
    public static double inputPerSajian(Scanner scanner) {
        System.out.print("Bahan Per sajian (dalam mL/gr): ");
        return scanner.nextDouble();
    }
    public static double hitungHargaPerSajian(double hargaBarang, double volumeBahan, double perSajian) {
        return (hargaBarang / volumeBahan) * perSajian;
    }
    public static void tampilkanHasil(String namaBahan, double hargaPerSajian) {
        System.out.println("Harga Bahan " + namaBahan + " Per Sajian: Rp " + hargaPerSajian);
    }
}
