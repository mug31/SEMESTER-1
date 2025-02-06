package Kelas;
import java.util.Scanner;
public class matriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Panjang Matriks1: ");
        int panjang = input.nextInt();
        System.out.print("Masukan lebar Matriks1: ");
        int tinggi = input.nextInt();
        System.out.print("Masukan Panjang Matriks2: ");
        int panjang2 = input.nextInt();
        System.out.print("Masukan lebar Matriks2: ");
        int tinggi2 = input.nextInt();
        int[][] matriksA = matrik(panjang, tinggi, "A");
        int[][] matriksB = matrik(panjang, tinggi, "B");
        int[][] matriks3 = perkalian(matriksA, matriksB, panjang, tinggi, tinggi2);
        cetak(matriks3, panjang, tinggi);
    }
    public static int[][] matrik(int panjang,int lebar,String nama) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Matriks "+nama+": ");
        int[][] m1 = new int[panjang][lebar];
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print("Masukkan nilai untuk baris :" + i + ", kolom " + j + ": ");
                m1[i][j]= input.nextInt();
            }
        }
        return m1;
    }
    public static int[][] perkalian(int[][] a,int[][] b,int panjang,int lebar,int lebar2){
        int[][] matriks3 = new int[panjang][lebar2];
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar2; j++) {
                for (int k = 0; k < lebar; k++) {
                    matriks3[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return matriks3;
    }
    public static void cetak(int[][] matriks,int panjang,int lebar) {
        System.out.println("Hasil Perkalian: ");
        for (int i = 0; i < panjang; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print(matriks[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}