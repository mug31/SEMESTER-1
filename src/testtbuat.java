import java.util.Scanner;

public class testtbuat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Langkah 2: Input jumlah elemen
        System.out.print("Masukkan jumlah elemen: ");
        int n = scanner.nextInt();
        
        // Langkah 3: Input daftar angka
        int[] angka = new int[n];
        System.out.println("Masukkan elemen daftar:");
        for (int i = 0; i < n; i++) {
            angka[i] = scanner.nextInt();
        }
        
        // Langkah 4: Input target
        System.out.print("Masukkan nilai target: ");
        int target = scanner.nextInt();
        
        boolean ditemukan = false;
        
        // Langkah 5: Mencari pasangan yang sesuai
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (angka[i] + angka[j] == target) {
                    System.out.println("Pasangan ditemukan: " + angka[i] + " dan " + angka[j]);
                    ditemukan = true;
                    break;
                }
            }
            if (ditemukan) {
                break;
            }
        }
        
        // Langkah 6: Jika tidak ditemukan
        if (!ditemukan) {
            System.out.println("Tidak ditemukan pasangan yang sesuai.");
        }
        
        // Langkah 7: Selesai
        scanner.close();
    }
}
