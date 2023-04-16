package Nomor1;

public class BangunDatar {
    public BangunDatar() {}
    public void luas(){}
    public void keliling(){}
}
class Persegi extends BangunDatar{
    private int sisi;
    public Persegi(int sisi) {
        this.sisi = sisi;
    }
    public void luas(){
        System.out.printf("Luas = %.2f%n", Math.pow(this.getSisi(),2));
    }
    public void keliling(){
        System.out.printf("Keliling = %d%n", this.getSisi()*4);
    }

    public int getSisi() {
        return sisi;
    }
}
class PersegiPanjang extends  BangunDatar{
    private int sisi;
    private int lebar;
    public PersegiPanjang(int sisi, int lebar) {
        this.sisi = sisi;
        this.lebar = lebar;
    }
    @Override
    public void luas(){
        System.out.printf("Luas = %d%n", this,getSisi()*this.getLebar());
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %d%n", this,getSisi()*2+2*this.getLebar());
    }

    public int getSisi() {
        return sisi;
    }

    public int getLebar() {
        return lebar;
    }


}
class Lingkaran extends BangunDatar{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    @Override
    public void luas(){
        System.out.printf("Luas = %.2f%n", Math.PI*Math.pow(this.radius,2));
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %.2f%n", Math.PI*this.radius*2);
    }
}
class Segitiga extends BangunDatar{
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public Segitiga(int sisi) {
        this.sisi = sisi;
    }
    @Override
    public void luas(){
        double tinggi = Math.sqrt(Math.pow(this.getSisi(),2)-Math.pow(0.5*this.getSisi(),2));
        System.out.printf("Luas = %.2f%n", 0.5*this.sisi*tinggi);
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %d%n", this.getSisi()*3);
    }
}
class Trapesium extends BangunDatar{
    private int sisimiring;
    private int sisiatas;
    private int sisibawah;

    public Trapesium(int sisimiring, int sisiatas, int sisibawah) {
        this.sisimiring = sisimiring;
        this.sisiatas = sisiatas;
        this.sisibawah = sisibawah;
    }

    public int getSisimiring() {
        return sisimiring;
    }

    public int getSisiatas() {
        return sisiatas;
    }

    public int getSisibawah() {
        return sisibawah;
    }

    @Override
    public void luas(){
        double tinggi = Math.sqrt(Math.pow(this.getSisimiring(),2)-Math.pow((this.getSisibawah()-this.getSisiatas())*0.5,2));
        System.out.printf("Luas = %.2f%n", 0.5*(this.getSisiatas()+this.getSisibawah())*tinggi);
    }
    @Override
    public void keliling() {
        System.out.printf("Keliling = %df%n", this.getSisiatas()+this.getSisibawah()+(this.getSisimiring()*2));
    }
}