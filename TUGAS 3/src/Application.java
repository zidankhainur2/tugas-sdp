import models.Tas;
import models.Sepatu;

public class Application {
    public static void main(String[] args) {
        // Objek Tas
        Tas tas1 = new Tas();
        tas1.setAttributes("Aksesoris", "Nike", "Bahan kulit", "Medium", "Hitam");
        Tas tas2 = tas1.clone(); // Cloning

        // Objek Sepatu
        Sepatu sepatu1 = new Sepatu();
        sepatu1.setAttributes("Fashion", "Adidas", "Running Shoes", "Sneakers", 750000);
        Sepatu sepatu2 = sepatu1.clone(); // Cloning

        // Menampilkan informasi produk
        System.out.println("Tas 1:");
        tas1.showInfo();
        System.out.println("\nTas 2 (Clone):");
        tas2.showInfo();

        System.out.println("\nSepatu 1:");
        sepatu1.showInfo();
        System.out.println("\nSepatu 2 (Clone):");
        sepatu2.showInfo();
    }
}
