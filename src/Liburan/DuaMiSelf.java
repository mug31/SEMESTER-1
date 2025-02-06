
package Liburan;
import java.io.*;
import java.util.Scanner;

public class DuaMiSelf {
        public String nBahan;
        public double harga;
        public double volume;
        public double neeed;
        
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        DuaMiSelf p = new DuaMiSelf();
        
        System.out.println("Ini keduanya");
        System.out.println("=========");
        
        p.Input(scn);
//        p.auto();
    }
    public void Input(Scanner scn) {
        DuaMiSelf p = new DuaMiSelf();
        
        System.out.println("masukkan nama Bahan: ");
        p.nBahan = scn.nextLine();
        System.out.println("harga Bahan: ");
        p.harga = scn.nextDouble();
        System.out.println("Volume bahan(mL/gr): ");
        p.volume = scn.nextDouble();
        System.out.println("yang dibutuhkan persajian(mL/gr): ");
        p.neeed = scn.nextDouble();
        scn.close();
          
    }
    public void auto(double harga, double volume, double need) {
        DuaMiSelf p = new DuaMiSelf();
        
        double HPP = (p.harga/p.volume)*p.neeed;
        System.out.println(HPP);
    }
}
