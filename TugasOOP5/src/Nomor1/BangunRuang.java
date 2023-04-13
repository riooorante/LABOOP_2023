package Nomor1;

public class BangunRuang {
    public BangunRuang() {
    }

    public void luasPermukaan() {
    }

    public void volume() {
    }
}

class Kubus extends BangunRuang {
    private int sisi;

    public Kubus(int sisi) {
        this.sisi = sisi;
    }

    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f", Math.pow(this.getSisi(), 2) * 6));
    }

    public void volume() {
        System.out.printf("Volume = %.2f", Math.pow(this.getSisi(), 3));
    }

    public int getSisi() {
        return sisi;
    }
}

class Balok extends BangunRuang {
    private int sisi;
    private int  tinggi;

    public Balok(int sisi, int tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f", Math.pow(this.getSisi(), 2) * 2 + this.getSisi() * this.getSisi() * 4));
    }

    public void volume() {
        System.out.printf("Volume = %.2f", Math.pow(this.getSisi(), 2)*this.getTinggi());
    }

    public int getSisi() {
        return sisi;
    }

    public int getTinggi() {
        return tinggi;
    }
}

class Bola extends BangunRuang {
    private int sisi;

    public Bola(int sisi) {
        this.sisi = sisi;
    }

    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f", Math.pow(this.getSisi(), 2) * 6));
    }

    public void volume() {
        System.out.printf("Volume = %.2f", Math.pow(this.getSisi(), 3));
    }

    public int getSisi() {
        return sisi;
    }
}

class Tabung extends BangunRuang {
    private int radius;
    private int tinggi;

    public Tabung(int radius, int tinggi) {
        this.tinggi = tinggi;
        this.radius = radius;
    }
    @Override
    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f", (Math.pow(this.getRadius(), 2) * Math.PI * 2 + (2 * Math.PI * this.getTinggi()))));
    }

    public void volume() {
        System.out.printf("Volume = %.2f", Math.pow(this.getRadius(), 2) * Math.PI * this.getTinggi());
    }

    public int getRadius() {
        return radius;
    }

    public int getTinggi() {
        return tinggi;
    }
}