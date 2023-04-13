package Nomor2;

public class Anggota {
    final String Univ;
    private String nama;
    private String jabatan;

    public Anggota(String nama) {
        Univ = "Universitas Hasanuddin";
        this.nama = nama;
        this.jabatan = "Anggota Biasa";
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void showInfo(){
        System.out.println("Nama      : "+this.getNama());
        System.out.println("Komunitas : "+Univ);
        System.out.println("Jabatan   : "+this.getJabatan());
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
class PengurusInti extends Anggota {
    public PengurusInti(String nama, String jabatan) {
        super(nama);
        this.setJabatan(jabatan);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}
class KoorStaf extends PengurusInti {
    private String bidang;
    public KoorStaf(String nama, String jabatan, String bidang) {
        super(nama, jabatan);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Bidang    : "+this.getBidang());
    }
}

