
package Liburan;
import java.util.Scanner;
public class autoHPP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Masukkan Jumlah bahan yang Diperlukan: ");
        int Jbahan = scanner.nextInt();
            
            for(int i = 1; i <= Jbahan; i++){
                System.out.println();

                System.out.println("Nama Bahan: ");
                String NamaBahan = scanner.next();

                System.out.println("Harga Bahan: ");
                double HargaBarang = scanner.nextInt();

                System.out.println("Volume Bahan(dalam mL/gr): ");
                double VolumeBahan = scanner.nextInt();

                System.out.println();
                
                System.out.println("Bahan Per sajian(dalam mL/gr): ");
                double perSajian = scanner.nextInt();
                
                double hPersajian = (HargaBarang/VolumeBahan)*perSajian;
                System.out.println("Harga Bahan Persajian: Rp "+hPersajian);
                
            }
            
            
}
}