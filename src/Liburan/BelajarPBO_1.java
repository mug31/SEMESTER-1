
package Liburan;

class Kali {
    double jari,tinggi,phi;
   
    public void Result()  {
        phi = 3.14;
        double diameter;
        double v;
        diameter = jari * phi;
        v = diameter * tinggi;
        
        System.out.println("Volume Lingkaran : "+v);
    }
}
public class BelajarPBO_1{
    public static void main(String[] args) {
        Kali objKali = new Kali();
        
        objKali.jari = 10;
        objKali.tinggi = 7;
        objKali.Result();
    }
}
