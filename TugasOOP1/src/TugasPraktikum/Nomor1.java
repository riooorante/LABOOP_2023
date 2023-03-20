package TugasPraktikum;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String inputNim = sr.next();
        nim(inputNim);
    }

    static void nim(String NIM) {
        String newNim = NIM.substring(NIM.length() - 3);
        int angka = Integer.parseInt(newNim);
        System.out.println("Soal Untuk NIM " + NIM + " Adalah Nomor " + ((angka % 7 == 0) ? 7 : angka % 7));
    }
}

