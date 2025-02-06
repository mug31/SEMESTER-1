
package Kelas;

import java.util.Scanner;

public class Modul9Latihan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat :");
        String kalimat = scanner.nextLine();
        
        String diBalik = "";
        for (int i = 0; i < kalimat.length(); i++) {
            diBalik =kalimat.charAt(i) + diBalik ;
            
        }
        System.out.println("Kalimat Yang dibalik :"+ diBalik);
    }
}

