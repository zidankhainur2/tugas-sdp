package models;

public class Tas extends ProdukMarketplace {
    private String ukuran;
    private String warna;

    public Tas() {
    }

    public Tas(Tas source) {
        super(source);
        if (source != null) {
            this.ukuran = source.ukuran;
            this.warna = source.warna;
        }
    }

    @Override
    public Tas clone() {
        return new Tas(this);
    }

    public void setAttributes(String kategori, String brand, String spesifikasi, String ukuran, String warna) {
        this.kategori = kategori;
        this.brand = brand;
        this.spesifikasi = spesifikasi;
        this.ukuran = ukuran;
        this.warna = warna;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ukuran: " + ukuran + ", Warna: " + warna);
    }
}
