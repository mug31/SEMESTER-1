/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SampahBekas;

import java.util.Scanner;

public class kokkk {
    public static void main(String[] args) {
        
  
 Scanner scanner = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        int target = 20;
        boolean ditemukan = false;
        for(int nomer:angka){
        if (nomer == target){
        ditemukan = true;
        break;
        }
        }
        if(ditemukan){System.out.println(target +" ditemukan");}
        else{System.out.println("tidak ditemukan");}
    }
}
