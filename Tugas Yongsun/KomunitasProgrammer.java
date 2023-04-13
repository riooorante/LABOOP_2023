package Pertemuan5;
import java.util.ArrayList;
import java.util.Scanner;

public class KomunitasProgrammer {
    private static ArrayList<PengurusInti> listPengurusInti = new ArrayList<>();
    private static ArrayList<KoordinatorBidangdanStaff> listKoordinatorBidangdanStaff = new ArrayList<>();

    
    public void addPengurusInti(PengurusInti pengurusInti) {
        listPengurusInti.add(pengurusInti);
    }
    public void addKoordinatorBidangdanStaff(KoordinatorBidangdanStaff koordinatorBidangdanStaff) {
        listKoordinatorBidangdanStaff.add(koordinatorBidangdanStaff);
    }
    public void displayKomunitasProgrammer() {
        System.out.println(listPengurusInti);
        System.out.println(listKoordinatorBidangdanStaff);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama pengurus inti     : ");
        String nama = input.nextLine();
        System.out.print("Masukkan nim pengurus inti      : ");
        String nim = input.nextLine();
        System.out.print("Masukkan jabatan pengurus inti  : ");
        String jabatan = input.nextLine();
        PengurusInti pengurusInti = new PengurusInti(nama, nim, jabatan);
        System.out.println("================================");
        
        
        System.out.print("Masukkan nama koordinator bidang dan staff      : ");
        String nama2 = input.nextLine();
        System.out.print("Masukkan nim koordinator bidang dan staff       : ");
        String nim2 = input.nextLine();
        System.out.print("Masukkan posisi koordinator bidang dan staff    : ");
        String posisi = input.nextLine();
        KoordinatorBidangdanStaff koordinatorBidangdanStaff = new KoordinatorBidangdanStaff(nama2, nim2, posisi);
        input.close();

        KomunitasProgrammer komunitasProgrammer = new KomunitasProgrammer();
        komunitasProgrammer.addPengurusInti(pengurusInti);
        komunitasProgrammer.addKoordinatorBidangdanStaff(koordinatorBidangdanStaff);
        
        
        /*System.out.println("===============================================");
        System.out.println("--- HIERRKI ORGANISASI ---");
        pengurusInti.displayPengurusInti();
        System.out.println("==========================");
        koordinatorBidangdanStaff.displayKoordinatorBidangdanStaff();
        System.out.println("==========================");*/
        komunitasProgrammer.displayKomunitasProgrammer();
    }
}