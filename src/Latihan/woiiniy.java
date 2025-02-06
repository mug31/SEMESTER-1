package Latihan;

import java.util.Scanner;

public class woiiniy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan besar matriks = ");
        int n = scanner.nextInt();
        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];
        int[][] matriksC = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("masukkan nilai untuk matriks A " + i + ", kolom" + j + ":");
                matriksA[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("masukkan nilai untuk matriks B " + i + ", kolom" + j + ":");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        for (int i = 0; i < matriksC.length; i++) {
            for (int j = 0; j < matriksC[i].length; j++) {
                System.out.print(matriksC[i][j] + "\t");

            }
            System.out.println("");
        }

    }
}
