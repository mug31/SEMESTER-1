
package Kelas;


public class latMod11 {
    public static void main(String[] args) {
        int angka = 5;
        boolean hasil = isPrima (angka);
        if (hasil){System.out.println(angka + " adalah bilangan prima");
        } else {
            System.out.println(angka+ " bukan bilangan prima ");
        }
    }


public static boolean isPrima (int n){
    if(n<=1) return false;
    for (int i = 2; i<=Math.sqrt(n); i++){
        if (n % i == 0){
            return false;
            }
        }
            return true;
    }
}