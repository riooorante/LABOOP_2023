package TugasOOP2;

public class Produk {
    String ID;
    String nama;
    int stok;
    int harga;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStok() {
        return (this.stok > 0) ? "Tersedia" : "Stock Kosong";
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void informationBoard() {
        System.out.println("Nama  : "+getNama());
        System.out.println("ID    : "+getID());
        System.out.println("Harga : "+getHarga());
        System.out.println("Stok  : "+getStok());
    }
}
