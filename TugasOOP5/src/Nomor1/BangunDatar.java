package Nomor1;

public class BangunDatar {
    private int lebar;
    private int panjang;

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public BangunDatar(int lebar, int panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
}

class Persegi extends BangunDatar{
    public Persegi(int lebar, int panjang) {
        super(lebar, panjang);
    }
}
class PersegiPanjang extends  BangunDatar{
    public PersegiPanjang(int lebar, int panjang) {
        super(lebar, panjang);
    }
}
class Lingkaran extends BangunDatar{
    public Lingkaran(int lebar, int panjang) {
        super(lebar, panjang);
    }
}
class Segitiga extends BangunDatar{
    public Segitiga(int lebar, int panjang) {
        super(lebar, panjang);
    }
}
class Trapesium extends BangunDatar{
    public Trapesium(int lebar, int panjang) {
        super(lebar, panjang);
    }
}