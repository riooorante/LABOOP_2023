package TugasPraktikum;

import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        int[][] list = {
                {1, 2, 3},
                {2, 3, 4}
        };

        Scanner sr = new Scanner(System.in);

        try {
            int input = sr.nextInt(); // Try digunakan untuk memastikan inputan berupa integer
            pencariList(list, input);
        } catch (Exception e) {
            System.out.println("Masukkan Angka!");
            System.exit(0);
        }
    }

    static void pencariList(int[][] myArray, int nilai) {
        int[][] list = myArray;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[1].length; j++) {
                if (list[i][j] == nilai) {
                    System.out.printf("Angka " + nilai + " ditemukan di List[%d][%d]", i, j);
                    break;
                }
            }
        }
        System.out.println("Angka Tidak Ditemukan");
    }
}
