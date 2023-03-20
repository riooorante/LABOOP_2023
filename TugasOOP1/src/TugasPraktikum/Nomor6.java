package TugasPraktikum;

import java.lang.Math;
import java.util.Scanner;

public class Nomor6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int jariJari = sr.nextInt();
        hitung(jariJari);
    }

    static void hitung(int jarijari) {
        System.out.printf("Luas lingkaran adalah %.2f ", Math.PI * Math.pow(jarijari, 2)); // math PI digunakan agar nilai PI-nya lebih akurat
        // %.2f membuat hasil dibulatkan menjadi 3 angka dibelakang koma
    }
}

