package Nomor1;

import java.util.SplittableRandom;

public class BangunDatar {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double sisimiring;
    private double sisibawah;
    private double sisiatas;
    final double pi = Math.PI;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getSisimiring() {
        return sisimiring;
    }

    public void setSisimiring(double sisimiring) {
        this.sisimiring = sisimiring;
    }

    public double getSisibawah() {
        return sisibawah;
    }

    public void setSisibawah(double sisibawah) {
        this.sisibawah = sisibawah;
    }

    public double getSisiatas() {
        return sisiatas;
    }

    public void setSisiatas(double sisiatas) {
        this.sisiatas = sisiatas;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double luas(){
        return 0;
    }
    public double keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar{

    public Persegi(double lebar) {
        this.setLebar(lebar);
    }

    public double  luas(){
        return Math.pow(this.getLebar(),2);
    }
    public double keliling(){
        return this.getLebar() * 4;
    }
}
class PersegiPanjang extends  BangunDatar{
    public PersegiPanjang(double lebar, double panjang) {
        this.setLebar(lebar);
        this.setPanjang(panjang);
    }
    public double luas(){
        return this.getLebar()*this.getPanjang();
    }
    public String  keliling(int sisi, int panjang){
        return "Keliling : "+(2*(this.getPanjang()+this.getLebar()));
    }
}
class Lingkaran extends BangunDatar{
    public Lingkaran(double lebar) {
        this.setLebar(lebar);
    }

    public double luas(){
        return Math.pow(this.getLebar(),2);
    }
    public double keliling(){
        return 2*pi*this.getLebar();
    }
}
class Segitiga extends BangunDatar{
    public Segitiga(double lebar, double tinggi) {
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }

    public double luas(){
        return 0.5*this.getLebar()*this.getTinggi();
    }
     public double keliling(int sisi){
        return this.getLebar() * 4;
    }
}
class Trapesium extends BangunDatar{

    public Trapesium(double tinggi, double sisimiring,double sisiatas, double sisibawah) {
        this.setTinggi(tinggi);
        this.setSisimiring(sisimiring);
        this.setSisiatas(sisiatas);
        this.setSisibawah(sisibawah);
    }
    public double luas(){
        return this.getLebar()*(this.getSisiatas()+this.getSisibawah())*0.5;
    }
    public double keliling(){
        return this.getSisibawah()+this.getSisiatas()+(2*this.getSisimiring());
    }
}