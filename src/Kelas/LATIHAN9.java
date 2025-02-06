
package Kelas;
import java.util.Scanner;

public class LATIHAN9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = scanner.nextLine();
 
        int panjang = kalimat.length();
        System.out.println("Jumlah karakter: " + panjang);

            System.out.println("Masukkan Kalimat: ");
            String kalimat1 = scanner.nextLine();
            
            System.out.println("Masukkan Indeks awal: ");
            int awal = scanner.nextInt();
            System.out.println("Masukkan indeks akhir: ");
            int akhir = scanner.nextInt();
            
            String Bagian = kalimat.substring(awal,akhir);
            System.out.println("Substring: "+ Bagian);

                System.out.println("Masukkan String pertama: ");
                String a = scanner.nextLine();
                
                System.out.println("Masukkan String kedua: ");
                String b = scanner.nextLine();
                
                String gabung = a.concat(b);
                System.out.println(gabung);
    }
}
