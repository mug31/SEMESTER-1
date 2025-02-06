
package Kelas;

import java.util.Scanner;
public class Modul8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriks = new int [2][3];
        
        for (int i=0; i<2; i++){
            for (int j=0; j<3; j++){
                System.out.print("masukkan nilai untuk baris "+i+" Kolom "+j+" : ");
                matriks[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Matriks yang dimasukkan: ");
        for(int i=0;i<2;i++){
            for(int j=0; j<3;j++){
                System.out.print(matriks[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
