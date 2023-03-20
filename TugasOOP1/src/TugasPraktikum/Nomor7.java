package TugasPraktikum;

import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String[] hewan = {
                "Ayam", "beruang", "KerBau", "ruSa", "IkaN", "Masbro", "uLar"
        };

        System.out.print("Input hewan yang akan dicari : ");
        String inputan = sr.next();

        int index = findINdex(hewan, inputan);
        System.out.println(index);
    }

    static int findINdex(String[] listHewan, String hewan) {
        for (int i = 0; i < listHewan.length; i++) {
            if (listHewan[i].equalsIgnoreCase(hewan)) { // method equalsIgnoreCase digunakan untuk menghiraukan case sensitf
                return i;
            }
        }
        return -1;
    }
}