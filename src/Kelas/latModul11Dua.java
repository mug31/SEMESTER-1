
package Kelas;


public class latModul11Dua {
    public static void main(String[] args) {
        float jarijari = 7;
        
        double luas = hitungLuas(jarijari);
        double keliling= hitungKeliling(jarijari);
        
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: "+keliling);
    }
    private static double hitungLuas (double r){
        return Math.PI * r * r;
    }
    private static double hitungKeliling (double r){
        return 2 * Math.PI * r;
    }
}
