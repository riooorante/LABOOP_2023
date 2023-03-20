package TugasPraktikum;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int bilbul = 0;
        int desimal = 0;

        for (int i = 0; i < n; i++) {
            try {
                double angka = sr.nextDouble();
                if (angka % 1 == 0) {
                    bilbul++;
                } else {
                    desimal++;
                }
            } catch (Exception e) {
                System.out.println("Masukkan Angka!");
                System.exit(0);
            }

        }
        System.out.printf("Bilangan Bulat : %d %n", bilbul);
        System.out.printf("Bilangan Desimal : %d", desimal);
    }
}

