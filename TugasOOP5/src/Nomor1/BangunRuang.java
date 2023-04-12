package Nomor1;

public class BangunRuang {
    private double tinggi;
    private double lebar;
    private double panjang;
    private double radius;
    final double pi = Math.PI;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public double luasPermukaan(){return 0;
    }
    public double volume(){return 0;
    }
}

class Kubus extends BangunRuang{
    public Kubus(int lebar, int tinggi){
        this.setLebar(lebar);
        this.setTinggi(tinggi);
    }
    public double luasPermukaan(){
        return Math.pow(this.getLebar(), 2)*6;
    }
    public double volume(){
        return Math.pow(this.getLebar(),2)*this.getTinggi();
    }

}
class Balok extends BangunRuang{
    public Balok(int tinggi, int lebar, int panjang) {
        this.setLebar(lebar);
        this.setTinggi(tinggi);
        this.setPanjang(panjang);
    }
    public double luasPermukaan(){
        return (Math.pow(this.getLebar(), 2)*2)+(this.getLebar()*this.getTinggi()*4);
    }
    public double volume(){
        return Math.pow(this.getLebar(),2)*this.getTinggi();
    }
}
class Bola extends BangunRuang{
    public Bola(int radius) {
        this.setRadius(radius);
    }
    public double luasPermukaan(){
        return Math.pow(this.getLebar(), 2)*6;
    }
    public double volume(){
        return Math.pow(this.getLebar(),2)*this.getTinggi();
    }
}
class Tabung extends BangunRuang{
    public Tabung(int tinggi, int radius) {
        this.setTinggi(tinggi);
        this.setRadius(radius);
    }
    public double luasPermukaan(){
        return Math.pow(this.getLebar(), 2)*6;
    }
    public double volume(){
        return Math.pow(this.getLebar(),2)*this.getTinggi();
    }
}
