package models;

public class Sepatu extends ProdukMarketplace {
    private String jenisSepatu;
    private double harga;

    public Sepatu() {
    }

    public Sepatu(Sepatu source) {
        super(source);
        if (source != null) {
            this.jenisSepatu = source.jenisSepatu;
            this.harga = source.harga;
        }
    }

    @Override
    public Sepatu clone() {
        return new Sepatu(this);
    }

    public void setAttributes(String kategori, String brand, String spesifikasi, String jenisSepatu, double harga) {
        this.kategori = kategori;
        this.brand = brand;
        this.spesifikasi = spesifikasi;
        this.jenisSepatu = jenisSepatu;
        this.harga = harga;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Jenis Sepatu: " + jenisSepatu + ", Harga: Rp" + harga);
    }
}
