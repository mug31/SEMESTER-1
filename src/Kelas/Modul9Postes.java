
package Kelas;
import java.util.Scanner;
public class Modul9Postes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan kata: ");
        String kata = scanner.nextLine();
        
        String balik= "";
        for (int i=0;i<kata.length();i++){
            balik = kata.charAt(i)+ balik;
        }
        System.out.println("hasil balik: " + balik);
    }
    
    
}
