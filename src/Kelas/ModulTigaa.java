/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Kelas;

/**
 *
 * @author Maruf
 */

import java.util.Scanner;
public class ModulTigaa{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("masukan panjang");
        double panjang = scanner.nextDouble();
    
        System.out.println("masukan lebar");
        double lebar = scanner.nextDouble();
        
        System.out.println("masukan tinggi");
        double tinggi = scanner.nextDouble();
        
        double volume = tinggi*lebar*panjang ;
        
        System.out.println("volume adalah " + volume );
        
    }
}
