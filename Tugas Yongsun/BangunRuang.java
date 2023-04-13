package Pertemuan5;

public class BangunRuang {
    public void hitungLuasPermukaan() {
        System.out.println("Menghitung luas permukaan...");
    }

    public void hitungVolume() {
        System.out.println("Menghitung volume...");
    }
}

class Kubus extends BangunRuang{
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }
    public void hitungLuasPermukaan() {
        double luasPermukaan = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus = " + luasPermukaan);
    }

    public void hitungVolume() {
        double volume = sisi * sisi;
        System.out.println("Volume kubus = " + volume);
    }
}

class Balok extends BangunRuang{
    private double panjang;
    private double lebar;
    private double tinggi;

    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void hitungLuasPermukaan() {
        double luasPermukaan = 2 * ((panjang * lebar) + (panjang * tinggi));
        super.hitungLuasPermukaan();
        System.out.println("Luas permukaan balok = " + luasPermukaan);
    }

    public void hitungVolume() {
        double volume = panjang * lebar * tinggi;
        super.hitungVolume();
        System.out.println("Volume balok = " + volume);
    }
}
class Bola extends BangunRuang{
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuasPermukaan() {
        double luasPermukaan = 4 * Math.PI * jariJari * jariJari;
        System.out.println("Luas permukaan bola = " + luasPermukaan);
    }

    public void hitungVolume() {
        double volume = (4/3) * Math.PI * jariJari * jariJari * jariJari;
        System.out.println("Volume bola = " + volume);
    }
}
class Tabung extends BangunRuang{
    private double jariJari;
    private double tinggi;

    public Tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }

    public void hitungLuasPermukaan() {
        double luasPermukaan = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan tabung = " + luasPermukaan);
    }

    public void hitungVolume() {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung = " + volume);
    }
}