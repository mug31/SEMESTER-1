public class alproao {
    public static void main(String[] args) {
        int total = 0; // Inisialisasi variabel total
        int i = 1; // Inisialisasi variabel i

        // Looping dari 1 hingga 100
        while (i <= 100) {
            // Mengecek apakah i adalah bilangan genap
            if (i % 2 == 0) {
                total += i; // Menambahkan bilangan genap ke total
            }
            i++; // Increment i
        }

        // Menampilkan hasil total penjumlahan bilangan genap
        System.out.println("Jumlah semua bilangan genap dari 1 hingga 100 adalah: " + total);
    }
}
