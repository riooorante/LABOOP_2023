package TugasPraktikum;

import java.util.Scanner;
import java.util.Date;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String[] tanggal = sr.next().split("-"); // Mengimput tannggal dengan format dd-mm-yy kemudian dipisah dan dimasukkan kedalam list
        konversiTanggal(tanggal);

    }

    static void konversiTanggal(String[] text) {
        int date = Integer.parseInt(text[0]); // Konversi tanggal dari string ke interger
        int month = Integer.parseInt(text[1]);
        int year = Integer.parseInt(text[2]);
        System.out.printf("%d %s %d", date, getMonth(month), (1 <= year && year <= 23) ? 2000 + year : 1900 + year);
    }

    static String getMonth(int month) { // Switch case digunakan untuk mengkonversi bulan berupa angka ke kata;
        switch (month) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Maret";
            case 4:
                return "April";
            case 5:
                return "Mei";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Agustus";
            case 9:
                return "September";
            case 10:
                return "Oktober";
            case 11:
                return "November";
            case 12:
                return "Desember";
            default:
                return "";
        }
    }

}
