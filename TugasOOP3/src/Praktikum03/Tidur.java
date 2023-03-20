package Praktikum03;

public class Tidur {
    int durasi;
    Bantal bantal;
    String suhu;

    public Tidur(){
    }
    public Tidur(Bantal bantal, String suhu) {
        this.bantal = bantal;
        this.suhu = suhu;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }
}

class Kasur {
    public void tidur(Tidur tidur){
        if (tidur.bantal.bantal && tidur.suhu == "Dingin") {
            tidur.setDurasi(8);
            System.out.printf("Anda tidur selama %d jam%n", tidur.getDurasi());
        } else {
            tidur.setDurasi(4);
            System.out.printf("Anda tidur selama %d jam%n", tidur.getDurasi());
        }
    }
    public void sudahTidur(Tidur tidur) {
        System.out.printf("%s", (tidur.durasi > 0) ? "Sudah Tidur":"Belum Tidur");
    }
}

class Bantal{
    boolean bantal;
    public Bantal(boolean bantal) {
        this.bantal = bantal;
    }
}

class MainTidur{
    public static void main(String[] args) {
        Tidur person1 = new Tidur(new Bantal(true), "Panas");
        Kasur kasur = new Kasur();
        kasur.tidur(person1);

        Tidur person2 = new Tidur(new Bantal(true), "Dingin");
        kasur.tidur(person2);

        Tidur person3 = new Tidur(new Bantal(false), "Panas");
        kasur.sudahTidur(person2);

    }
}
