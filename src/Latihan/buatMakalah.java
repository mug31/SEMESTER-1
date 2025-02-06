/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

public class buatMakalah
{
    public static void main(String[] args) {
        
        int[] array = {5, 3, 7, 1, 9};  
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Masukkan elemen yang ingin dicari:");
        int x = scanner.nextInt();

        int i = 0; 
        boolean ditemukan = false; 

        // Looping pencarian
        while (i < array.length) { 
            if (array[i] == x) { 
                System.out.println("Elemen ditemukan di index: " + i);
                ditemukan = true; 
                break; 
            }
            i++;          }

        
        if (!ditemukan) {
            System.out.println("Elemen tidak ditemukan");
        }

        scanner.close();
    }
}
