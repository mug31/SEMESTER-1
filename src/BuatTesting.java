
package Latihan;
import java.util.Scanner;
public class BuatTesting {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Masukan tinggi piramida: ");
        int n= scanner.nextInt();
        
        for(int i=1; i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for (int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=1; i<=n;i++){
            for(int s = 1; s <= n - i; s++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        } 
    }
    

