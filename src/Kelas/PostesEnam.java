
package Kelas;
import java.util.Scanner;
public class PostesEnam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("masukan tinggi piramid yang diinginkan; ");
        int n = scanner.nextInt();
        int i,j,k;
        
        for (i=1; i<=n; i++){
            for (j=1; j<=i; j++)
            System.out.print("* ");
            System.out.println();
        } System.out.println();
    }
}
