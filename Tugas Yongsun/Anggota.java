package Pertemuan5;

public class Anggota {
    private String nama;
    private String nim;

    public Anggota(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void displayAnggota() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
    }
}

class PengurusInti extends Anggota {
    private String jabatan;

    public PengurusInti(String nama, String nim, String jabatan) {
        super(nama,nim);
        this.jabatan = jabatan;
    }

    public void displayPengurusInti() {
        displayAnggota();
        System.out.println("Jabatan : " + jabatan);
    }
}

class KoordinatorBidangdanStaff extends Anggota {
    private String posisi;

    public KoordinatorBidangdanStaff(String nama, String nim, String posisi) {
        super(nama,nim);
        this.posisi = posisi;
    }

    public void displayKoordinatorBidangdanStaff() {
        displayAnggota();
        System.out.println("Bidang  : " + posisi);
    }
}