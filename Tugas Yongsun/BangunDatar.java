package Pertemuan5;

public class BangunDatar {
    protected double luas;
    protected double keliling;

    public void hitungLuas() {
        System.out.println("Menghitung luas...");
    }

    public void hitungKeliling() {
        System.out.println("Menghitung keliling...");
    }

    public void tampilkanLuas() {
        System.out.println("Luas = " + luas);
    }

    public void tampilkanKeliling() {
        System.out.println("Keliling = " + keliling);
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    public void hitungLuas() {
        luas = sisi * sisi;
    }

    public void hitungKeliling() {
        keliling = 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitungLuas() {
        luas = panjang * lebar;
    }

    public void hitungKeliling() {
        keliling = 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuas() {
        luas = Math.PI * jariJari *jariJari;
    }

    public void hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
    }
}

class Segitiga extends BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void hitungLuas() {
        luas = (1/2) * alas * tinggi;
    }

    public void hitungKeliling() {
        keliling = 3 * alas;
    }
}

class Trapesium extends BangunDatar {
    private double alas;
    private double atas;
    private double tinggi;

    public Trapesium(double alas, double atas, double tinggi) {
        this.alas = alas;
        this.atas = atas;
        this.tinggi = tinggi;
    }

    public void hitungLuas() {
        luas = ((alas + atas) / 2) * tinggi;
    }

    public void hitungKeliling() {
        keliling = (2 * alas) + (2 * atas);
    }
}