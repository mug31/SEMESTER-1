package Latihan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maruf
 */
import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("input square length");
            double length = scanner.nextDouble();
            
            System.out.println("input square width");
            double width = scanner.nextDouble();
            
            double squareAre = length * width;
            System.out.println("The square area is" + squareAre);
           
    }
}
