package Nomor1;

public class BangunDatar {
    private double panjang;
    private double lebar;
    final double pi = Math.PI;

    public BangunDatar() {
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
        this.setLebar(panjang);
    }
    public double luas(){
        return this.getLebar()*this.getPanjang();
    }
    public String  keliling(int sisi, int panjang){
        return "Keliling : "+(2*(this.getPanjang()+this.getLebar()));
    }
}
class Lingkaran extends BangunDatar{
    public String  luas(int sisi){
        return "Luas : "+Math.pow(sisi,2);
    }
    public String  keliling(int sisi){
        return "Keliling : "+sisi * 4;
    }
}
class Segitiga extends BangunDatar{
    String  luas(int radius){
        return "Luas : "+(pi*Math.pow(radius,2));
    }
    String  keliling(int sisi){
        return "Keliling : "+sisi * 4;
    }
}
class Trapesium extends BangunDatar{
    public String  luas(int sisi){
        return "Luas : "+Math.pow(sisi,2);
    }
    public String  keliling(int sisi){
        return "Keliling : "+sisi * 4;
    }
}