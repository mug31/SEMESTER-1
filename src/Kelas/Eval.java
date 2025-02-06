
package Kelas;
import java.util.*;
public class Eval {
    public static int main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Jumlah Matriks: ");
        int n = scanner.nextInt();
        int[][] matriksa= new int[n][n];
        int[][] matriksb= new int[n][n];

        
        System.out.println("Masukkan Jumlah Kolom: ");
        int kol = scanner.nextInt();
        
        System.out.println("Masukkan Jumlah Baris");
        int bar = scanner.nextInt();
        
        System.out.println();
        System.out.println("Matriks pertama");
        
        for (int i = 0; i <bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("elemen " +"["+ i + "] ["+ j+ "]  :  ");
                matriksa[i][j]=scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Matriks kedua");
        for (int i = 0; i <bar; i++) {
            for (int j = 0; j < kol; j++) {
                System.out.print("elemen " +"["+ i + "] ["+ j+ "]  :  ");
                matriksb[i][j]=scanner.nextInt();
            }  
        }
        System.out.println("Hasil perkalian:");
        print(cetak);
    }
    public static int [][]kali(int[][] matriksa,int[][] matriksb){
     int [][] hasil = new int[matriksa.length][matriksb.length];   
     int jumlah=0;
        for (int i=0; i <matriksa.length; i++){
            for (int j=0; j <matriksb.length; j++ ){
                for (int k=0; k <matriksa.length; k++){
                    jumlah = jumlah + matriksb[i][k] * matriksb[k][j];
                }
                hasil[i][j] = jumlah;
                jumlah=0;
            }
    } 
        return hasil;
    }
    public static void cetak(){
        for (int i = 0; i < matriksa; i++) {
            for (int j = 0; j < lebar; j++) {
                System.out.print(matriks[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
