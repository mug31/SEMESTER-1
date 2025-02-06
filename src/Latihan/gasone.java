
package Latihan;
import java.util.Scanner;
public class gasone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah peserta ujian: ");
        int peserta = scanner.nextInt();
        System.out.println("Masukkan jumlah soal: ");
        int soal = scanner.nextInt();
        
        int[] NoTes = new int[peserta];
        String[] NamaPeserta = new String[peserta];
        char[][] JawabanPeserta = new char[peserta][soal];
        char[] KunciJawaban = new char[soal];
        
//        System.out.println("Input data peserta: ");
        for (int i=0; i<= peserta; i++){
            System.out.println("Nomor peserta ke-"+(i+1)+": ");
            NoTes[i]=scanner.nextInt();
            
            System.out.println("Nama peserta: ");
            NamaPeserta[i] =scanner.nextLine();
            for(int j=0;j<=soal;j++){
                
            }
            
        }
    }
}
