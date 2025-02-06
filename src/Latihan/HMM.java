/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

public class HMM {
    public static void main
        (String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah pemain
        System.out.print("Masukkan jumlah pemain: ");
        int jumlahPemain = input.nextInt();

        // Matriks untuk menyimpan data pemain
        String[][] dataPemain = new String[jumlahPemain][3]; // USER ID, Nama, Misi
        int[] totalSkor = new int[jumlahPemain]; // Total skor setiap pemain

        // Input data pemain
        for (int i = 0; i < jumlahPemain; i++) {
            input.nextLine(); // Consume newline
            System.out.println("\nData pemain ke-" + (i + 1));

            System.out.print("Masukkan USER ID: ");
            dataPemain[i][0] = input.nextLine();

            System.out.print("Masukkan Nama: ");
            dataPemain[i][1] = input.nextLine();

            System.out.print("Masukkan jumlah misi: ");
            int jumlahMisi = input.nextInt();

            int total = 0;
            StringBuilder misiDetail = new StringBuilder();
            for (int j = 0; j < jumlahMisi; j++) {
                System.out.print("Masukkan jumlah aksi untuk misi ke-" + (j + 1) + ": ");
                int aksi = input.nextInt();

                System.out.print("Masukkan skor per aksi untuk misi ke-" + (j + 1) + ": ");
                int skorPerAksi = input.nextInt();

                // Hitung skor misi
                int skorMisi = aksi * skorPerAksi;
                total += skorMisi;

                // Simpan detail misi
                misiDetail.append(aksi).append(",");
            }

            // Simpan data misi ke matriks
            dataPemain[i][2] = misiDetail.toString().replaceAll(",$", ""); // Hapus koma terakhir
            totalSkor[i] = total;
        }

        // Output data pemain
        System.out.println("\nHasil Gameplay:");
        System.out.printf("%-10s %-10s %-15s %-10s\n", "USER ID", "NAMA", "MISI", "TOTAL SKOR");
        for (int i = 0; i < jumlahPemain; i++) {
            System.out.printf("%-10s %-10s %-15s %-10d\n", dataPemain[i][0], dataPemain[i][1], dataPemain[i][2], totalSkor[i]);
        }
    }
}
