package Nomor1;

public class BangunDatar {
    private int sisi;
    private int lebar;

    private int sisimiring;
    private int sisiatas;
    private int sisibawah;

    public int getSisi() {
        return sisi;
    }


    public int getLebar() {
        return lebar;
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

    public BangunDatar(int sisi, int lebar) {
        this.sisi = sisi;
        this.lebar = lebar;
    }

    public BangunDatar(int sisimiring, int sisiatas, int sisibawah) {
        this.sisimiring = sisimiring;
        this.sisiatas = sisiatas;
        this.sisibawah = sisibawah;
    }

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public void luas(){
    }
    public void keliling(){}
}
class Persegi extends BangunDatar{

    public Persegi(int sisi) {
        super(sisi);
    }
    public void luas(){
        System.out.printf("Luas = %.2f%n", Math.pow(this.getSisi(),2));
    }
    public void keliling(){
        System.out.printf("Keliling = %d%n", this.getSisi()*4);
    }

}
class PersegiPanjang extends  BangunDatar{

    public PersegiPanjang(int sisi, int lebar) {
        super(sisi, lebar);
    }
    @Override
    public void luas(){
        System.out.printf("Luas = %d%n", this.getSisi()*this.getLebar());
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %d%n", this.getSisi()*2+2*this.getLebar());
    }



}
class Lingkaran extends BangunDatar{
    public Lingkaran(int radius) {
        super(radius);
    }
    @Override
    public void luas(){
        System.out.printf("Luas = %.2f%n", Math.PI*Math.pow(this.getSisi(),2));
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %.2f%n", Math.PI*this.getSisi()*2);
    }
}
class Segitiga extends BangunDatar{

    public Segitiga(int sisi) {super(sisi);
    }
    @Override
    public void luas(){
        double tinggi = Math.sqrt(Math.pow(this.getSisi(),2)-Math.pow(0.5*this.getSisi(),2));
        System.out.printf("Luas = %.2f%n", 0.5*this.getSisi()*tinggi);
    }

    @Override
    public void keliling() {
        System.out.printf("Keliling = %d%n", this.getSisi()*3);
    }
}
class Trapesium extends BangunDatar{


    public Trapesium(int sisimiring, int sisiatas, int sisibawah) {
        super(sisimiring, sisiatas, sisibawah);
    }


    @Override
    public void luas(){
        double tinggi = Math.sqrt(Math.pow(this.getSisimiring(),2)-Math.pow((this.getSisibawah()-this.getSisiatas())*0.5,2));
        System.out.printf("Luas = %.2f%n", 0.5*(this.getSisiatas()+this.getSisibawah())*tinggi);
    }
    @Override
    public void keliling() {
        System.out.printf("Keliling = %d%n", this.getSisiatas()+this.getSisibawah()+(this.getSisimiring()*2));
    }
}