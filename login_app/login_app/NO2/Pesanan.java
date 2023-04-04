package login_app.NO2;

public class Pesanan {
    private String namaPesanan;
    private String alamatPesanan;
    private int totalHarga;

    public Pesanan(String namaPesanan, String alamatPesanan, int totalHarga) {
        this.namaPesanan = namaPesanan;
        this.alamatPesanan = alamatPesanan;
        this.totalHarga = totalHarga;
    }

    public String getNamaPesanan() {
        return namaPesanan;
    }

    public void setNamaPesanan(String namaPesanan) {
        this.namaPesanan = namaPesanan;
    }

    public String getAlamatPesanan() {
        return alamatPesanan;
    }

    public void setAlamatPesanan(String alamatPesanan) {
        this.alamatPesanan = alamatPesanan;
    }

    public int getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(int totalHarga) {
        this.totalHarga = totalHarga;
    }
    public void tampilkan(){
        System.out.println(this.namaPesanan);
        System.out.println(this.alamatPesanan);
        System.out.println(this.totalHarga);
    }
}
