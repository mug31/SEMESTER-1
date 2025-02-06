
package Kelas;
import java.util.Scanner;
public class Postes8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Matriks: ");
        int n = scanner.nextInt();
        int[][] matriksa= new int[n][n];
        int[][] matriksb= new int[n][n];
        int[][] matriksc= new int[n][n];
        
        System.out.println("Masukkan Jumlah Kolom: ");
        int kol = scanner.nextInt();
        
        System.out.println("Masukkan Jumlah Baris");
        int bar = scanner.nextInt();
        
        System.out.println();
        System.out.println("Matriks pertama");
        
        for (int i = 0; i <bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("masukkan nilai untuk matriks 1 baris ke- " + i + " Kolom ke- "+ j+ " :  ");
                matriksa[i][j]=scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks kedua");
        for (int i = 0; i <bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("masukkan nilai untuk matriks 2 baris ke- " + i + " Kolom ke- "+ j+ " :  ");
                matriksb[i][j]=scanner.nextInt();
            }  
        }
        
        System.out.println();
        
        System.out.println("Matriks hasil: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksc[i][j] = matriksa[i][j] + matriksb[i][j];
            }
        }
        
        for (int i = 0; i <matriksc.length; i++) {
            for (int j = 0; j < matriksc[i].length; j++) {
                System.out.print(matriksc[i][j]+"\t");
            }  
            System.out.println();
        }
    }
}
