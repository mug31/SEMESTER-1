
package Kelas;

import java.util.Scanner;
public class Modul8Lat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriks =new int[3][3];
        int totalDiagonal=0;
        
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("masukkan nilai untuk baris " + i + " Kolom "+ j+ " :  ");
                matriks[i][j]=scanner.nextInt();
            }
            
        }
        for (int i=0;i<3;i++){
            totalDiagonal += matriks[i][i];
        }
        System.out.println("Jumlah elemen diagonal utama: "+ totalDiagonal);
        
    }
}
