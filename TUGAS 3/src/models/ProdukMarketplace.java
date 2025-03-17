package models;

public class ProdukMarketplace implements Prototype {
    protected String kategori;
    protected String brand;
    protected String spesifikasi;

    public ProdukMarketplace() {
    }

    public ProdukMarketplace(ProdukMarketplace source) {
        if (source != null) {
            this.kategori = source.kategori;
            this.brand = source.brand;
            this.spesifikasi = source.spesifikasi;
        }
    }

    @Override
    public ProdukMarketplace clone() {
        return new ProdukMarketplace(this);
    }

    public void showInfo() {
        System.out.println("Kategori: " + kategori + ", Brand: " + brand + ", Spesifikasi: " + spesifikasi);
    }
}
