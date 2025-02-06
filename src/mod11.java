import java.util.Scanner;

public class mod11 {

    public static int fibo(int n) {
        if (n <= 1) {
            return n; 
        }
        return fibo(n - 1) + fibo(n - 2); 
    }

    public static void main(String[] args) {    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin ditampilkan: ");
        int count = scanner.nextInt();

        System.out.println("Bilangan Fibonacci:");
        for (int i = 0; i < count; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
