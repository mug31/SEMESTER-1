package Kelas;




/**
 *
 * @author Maruf
 */
import java.util.Scanner;
public class ModulEmpat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan nilai ujian: ");
        int nilai = scanner.nextInt();
        if (nilai >= 60) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }
        //latihan 2//
        if (nilai >= 90) {
            System.out.println("Nilai A");
            return;
        }   if (nilai >= 80) {
            System.out.println("Nilai B");
            return;
        }   if (nilai >= 70) {
            System.out.println("Nilai C");
            return;
        }   if (nilai >=60) {
            System.out.println("Nilai D");
            return;
        }   if (nilai <60) {
            System.out.println("Nilai E");
            return;
        }

    }
    
}
