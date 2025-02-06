/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;
import java.util.Scanner;
public class Toong {

   
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tinggi piramida: ");
        int tinggi = scanner.nextInt();

        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }
  
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}