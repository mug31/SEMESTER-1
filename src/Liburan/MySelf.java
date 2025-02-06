
package Liburan;

import java.io.*;
import java.util.Scanner;

public class MySelf {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("system");
        System.out.println("=====");
        System.out.println();
        
        System.out.println("Masukkan nama Bahan: ");
        String namaBahan = scn.nextLine();  
        System.out.println("Harga Bahan: ");
        double hargaBahan = scn.nextDouble();
        System.out.println("Jumlah Volume: ");
        double jumlahVolume = scn.nextDouble();
        scn.close();
        
        MySelf obj= new MySelf();
        obj.DataInput(namaBahan, hargaBahan, jumlahVolume);
//        obj.Reader();
        
    }
    public void DataInput (String namaBahan, double hargaBahan, double jumlahVolume) {
        try {
            FileWriter fileWriter = new FileWriter("E:\\BelajarJavaPraktikum\\Baskara\\src\\Liburan\\dataBahan.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(namaBahan+"\t|\t"+hargaBahan+"\t|\t"+jumlahVolume+"\n");
            bufferedWriter.flush();
            bufferedWriter.close();
            System.out.println("Berhasil disimpan!");
        } catch (IOException e) {
            System.out.println("Terjadi Kesalahan saat menulis file: " + e.getMessage());
        }
        
    }
    public void Reader() {
        try {
            FileReader fileReader = new FileReader("E:\\BelajarJavaPraktikum\\Baskara\\src\\Liburan\\dataBahan.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            System.out.println("isi file:");
            while((data=bufferedReader.readLine()) !=null){
                System.out.println(data);
            }
            bufferedReader.close();
            } catch(IOException e){
                System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
            }
    }
}
