package Nomor1;

public class BangunRuang {
    private int tinggi;
    private int lebar;
    private int panjang;
    final double pi = Math.PI;

    public BangunRuang(int tinggi, int lebar, int panjang) {
        this.tinggi = tinggi;
        this.lebar = lebar;
        this.panjang = panjang;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

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
    public int luasPermukaan(){return 0;
    }
    public int volume(){return 0;
    }
}

class Kubus extends BangunRuang{
    public Kubus(int tinggi, int lebar, int panjang) {
        super(tinggi, lebar, panjang);
    }
}
class Balok extends BangunRuang{
    public Balok(int tinggi, int lebar, int panjang) {
        super(tinggi, lebar, panjang);
    }
}
class Bola extends BangunRuang{
    public Bola(int tinggi, int lebar, int panjang) {
        super(tinggi, lebar, panjang);
    }
}
class Tabung extends BangunRuang{
    public Tabung(int tinggi, int lebar, int panjang) {
        super(tinggi, lebar, panjang);
    }
}
