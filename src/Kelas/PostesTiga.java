package Kelas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maruf
 */
import java.util.Scanner;
public class PostesTiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input Track Length");   //btw ini trek latihan//
        float Track = scanner.nextFloat();
        
        System.out.println("input Time");
        float Time = scanner.nextFloat();
        
        System.out.println("input Maraton Lenght");
        float Maraton = scanner.nextFloat();
                
        float avg = (Track / Time)*60 ;
        System.out.println("your avg is\n" + avg);
        
        float timeNeeded = Maraton / avg;
        System.out.println("time needed to complete is\n" +timeNeeded);
        
        
    }
}
