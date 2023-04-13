package Nomor2;

public class Main {
    public static void main(String[] args) {
        PengurusInti ketua = new PengurusInti("Mario", "Ketua");
        ketua.showInfo();
        Anggota anggota = new Anggota("Python");
        anggota.showInfo();
        KoorStaf koordinator = new KoorStaf("riooorante", "Koordinator", "Teknologi");
        koordinator.showInfo();
        KoorStaf staf = new KoorStaf("Vale", "Staf", "Jaringan");
        staf.showInfo();
    }
}
