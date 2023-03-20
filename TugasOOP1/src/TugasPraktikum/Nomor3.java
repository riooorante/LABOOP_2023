package TugasPraktikum;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        try {
            System.out.print("Nama : ");
            String nama = sr.nextLine();
            System.out.print("Umur : ");
            int umur = sr.nextInt();
            System.out.print("Hobby : ");
            sr.nextLine();
            String hobby = sr.nextLine();
            System.out.printf("Nama saya %s, %d tahun, hobby %s", nama, umur, hobby);
        } catch (Exception e) {
            System.out.println("Umur harus angka!");
            System.exit(0);
        }


        sr.close();
    }
}
