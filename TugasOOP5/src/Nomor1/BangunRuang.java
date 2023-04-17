package Nomor1;

public class BangunRuang {

    private int sisiA;
    private int  sisiB;

    public BangunRuang(int sisiA) {
        this.sisiA = sisiA;
    }

    public BangunRuang(int sisiA, int sisiB) {
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    public void luasPermukaan() {
    }

    public void volume() {
    }

    public int getSisiA() {
        return sisiA;
    }

    public int getSisiB() {
        return sisiB;
    }

}

class Kubus extends BangunRuang {

    public Kubus(int sisiA) {
        super(sisiA);
    }
    @Override
    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f%n", Math.pow(this.getSisiA(), 2) * 6));
    }
    @Override
    public void volume() {
        System.out.printf("Volume = %.2f%n", Math.pow(this.getSisiA(), 3));
    }
}

class Balok extends BangunRuang {

    public Balok(int sisiA, int sisiB) {
        super(sisiA, sisiB);
    }
    @Override
    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f%n", Math.pow(this.getSisiA(), 2) * 2 + this.getSisiA() * this.getSisiA() * 4));
    }
    @Override
    public void volume() {
        System.out.printf("Volume = %.2f%n", Math.pow(this.getSisiA(), 2)*this.getSisiB());
    }


}

class Bola extends BangunRuang {
    public Bola(int radius) {
        super(radius);
    }
    @Override
    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f%n", 4/3*Math.PI*Math.pow(this.getSisiA(),3)));
        System.out.println(String.format("Luas Permukaan = %.2f", (4/3)*Math.PI*Math.pow(this.getSisiA(),3)));
    }
    @Override
    public void volume() {
        System.out.printf("Volume = %.2f%n", 4*Math.PI*Math.pow(this.getSisiA(),2));
    }


}

class Tabung extends BangunRuang {


    public Tabung(int radius, int tinggi) {
        super(radius,tinggi);
    }
    @Override
    public void luasPermukaan() {
        System.out.println(String.format("Luas Permukaan = %.2f%n", (Math.pow(this.getSisiA(), 2) * Math.PI * 2 + (2 * Math.PI * this.getSisiB()))));
    }
    @Override
    public void volume() {
        System.out.printf("Volume = %.2f%n", Math.pow(this.getSisiA(), 2) * Math.PI * this.getSisiB());
    }

}