import java.util.ArrayList;
import java.util.List;

// Kelas KalkulatorPersegi adalah subclass dari Thread
class KalkulatorPersegi extends Thread {
    private int number; // Menyimpan angka yang akan dihitung kuadratnya

    // Konstruktor untuk menginisialisasi nilai angka
    public KalkulatorPersegi(int number) {
        this.number = number;
    }

    // Metode yang akan dieksekusi saat thread dijalankan
    @Override
    public void run() {
        int result = number * number; // Menghitung kuadrat dari angka
        System.out.println("Thread " + Thread.currentThread().getId() +
                ": Luas persegi dengan sisi " + number + " cm = " + result + " cm^2");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        // Daftar angka yang akan dihitung luasnya
        int[] numbers = { 2, 4, 6, 8, 10 };

        // List untuk menyimpan semua thread yang dibuat
        List<KalkulatorPersegi> threads = new ArrayList<>();

        System.out.println("Mulai perhitungan dengan multithreading...");

        // Membuat dan menjalankan thread untuk setiap angka
        for (int num : numbers) {
            KalkulatorPersegi thread = new KalkulatorPersegi(num); // Buat thread baru
            threads.add(thread); // Simpan thread ke dalam list
            thread.start(); // Jalankan thread
        }

        // Menunggu semua thread selesai sebelum lanjut
        for (KalkulatorPersegi thread : threads) {
            try {
                thread.join(); // Tunggu thread ini selesai sebelum melanjutkan
            } catch (InterruptedException e) {
                e.printStackTrace(); // Menampilkan pesan error jika terjadi interupsi
            }
        }

        // Pesan ini hanya akan muncul setelah semua thread selesai
        System.out.println("Semua perhitungan telah selesai.");
    }
}

// jadi yang saya pahami disini mengenai multithread ini adalah multithread ini
// menjalankan kode program secara asynchronus, nah karena program berjalan
// secara asynchronus urutan dari output tidak akan selalu sama.