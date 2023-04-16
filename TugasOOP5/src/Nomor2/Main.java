package Nomor2;

//public class Main {
//    public static void main(String[] args) {
//        PengurusInti ketua = new PengurusInti("Mario", "Ketua");
//        ketua.showInfo();
//        Anggota anggota = new Anggota("Python");
//        anggota.showInfo();
//        KoorStaf koordinator = new KoorStaf("riooorante", "Koordinator", "Teknologi");
//        koordinator.showInfo();
//        KoorStaf staf = new KoorStaf("Vale", "Staf", "Jaringan");
//        staf.showInfo();
//        System.out.println(Math.sqrt(4));
//    }
//}

class Test{
    public static void main(String[] args) {

        String[] nama = "Mario Valerian Rante Ta'dung Hahaha HAhaha".split(" ");
        for (int i = 0; i < nama.length; i++){
            System.out.println(nama[i:] + " ");
        }
    }
}