
package Kelas;
import java.util.Scanner;
public class ModulTjuhArray {
    public static void main(String[] args) {
//        String[] makanan={"sate", "sop ayam", "kuali", "sop ayam", "ayam pop"};
//        System.out.println(makanan[4]);
        Scanner scanner = new Scanner(System.in);
        float total=0;
        float rata = 0;
        
        
        System.out.println("===================");
        System.out.println("Program Nilai Ujian");
        System.out.println("===================");
        
        System.out.println("Masukkan batas input nilai: ");
        int max = scanner.nextInt();
        int nilai[] = new int[max];
        
        for (int i=0; i<nilai.length;i++){
            System.out.println("Masukkan nilai ke-" + (i+1) +": ");
            nilai[i] = scanner.nextInt();

            total+=nilai[i];
            rata=total/max;
        }
        System.out.println("===daftar nilai cuy===");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nlai ke " + (i+1) + " adalah " + nilai[i]);
        }
         System.out.println("=====================");
         System.out.println("Nilai total: "+total);
         System.out.println("Nilai Rata-rata: "+ rata);
        }
}
