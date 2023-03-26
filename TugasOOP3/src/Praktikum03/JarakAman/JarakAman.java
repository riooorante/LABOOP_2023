package Praktikum03.JarakAman;

public class JarakAman {

    public static void main(String[] args) {
        Car avanza = new Car("Avanza", 30);
        Car crv = new Car("CRV", 60);

        Rem rem = new Rem();

        rem.rem(avanza,crv,5, true);

    }
}
class Car{
    private String nama;
    private int kecepatan;

    public Car(String nama, int kecepatan) {
        this.nama = nama;
        this.kecepatan = kecepatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
}
class Rem {
  public void rem(Car car1, Car car2, int jarak, boolean kering){
      int kecepatan = car2.getKecepatan();
      double X;
      if (kering) {
          X = Math.pow((kecepatan/10), 2);
          System.out.printf("Mobil %s %s mobil %s dari belakang%n", car2.getNama(), (jarak < X)? "menambarak":"tidak menabrak", car1.getNama());
      } else
          X = Math.pow((kecepatan/10)/((Math.pow((kecepatan/10),2))/2), 2);
          System.out.printf("Mobil %s %s mobil %s dari belakang%n", car2.getNama(), (jarak < X)? "menambarak":"tidak menabrak", car1.getNama());
      }
  }

