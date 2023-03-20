package TugasPraktikum;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.print("Masukkan Judul Film : ");
        String[] listKalimat = sr.nextLine().split(" ");
        konversiString(listKalimat);
        sr.close();
    }

    static void konversiString(String[] string) {
        for (int i = 0; i < string.length; i++) {
            String anggota = string[i];
            System.out.printf("%s", anggota.substring(0, 1).toUpperCase() + anggota.substring(1).toLowerCase());
            if (i < string.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
