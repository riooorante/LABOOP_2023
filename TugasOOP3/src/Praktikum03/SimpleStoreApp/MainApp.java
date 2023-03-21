package Praktikum03.SimpleStoreApp;

import java.util.Scanner;
import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        User user = new User("Mario", 5000); // add User

        ArrayList<Product> produk = new ArrayList<>(); // Menambahkan produk untuk UhuComputer, Produk disimpan dalam ArrayList dengan type Product.
        produk.add(new Product("Asus Vivobook", 10000, 1));
        produk.add(new Product("Asus Vivobook Oled", "6k", 8));
        produk.add(new Product("Asus TUF Gaming", 7000, 10));

        Store UhuComputer = new Store("Uhu Computer", produk); // Instance class Store

        Sign sign = new Sign(UhuComputer, user);

        while (true) { // Loop 1

            user.card(); // Menampilkan data User
            UhuComputer.listProduct(); // Menampilkan list Product
            System.out.print("> ");
            int pilihan1 = sr.nextInt();

            if (pilihan1 > UhuComputer.getProduct().size()) { // Opsi yang diinput melebihi jumlah produk
                sign.pilihan();
            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) { // Opsi yang diinput pas dengan jumlah produk
                sign.konfirmasi(pilihan1 - 1);
                while (true) { // Loop 2
                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = sr.nextInt();
                    if (konfirmasi == 1 && user.getBalance() >= UhuComputer.getProduct().get(pilihan1 - 1).getPrice()) { // inputan 1 dan jumlah balance user cukup untuk membeli produk

                        sign.repeat();
                        UhuComputer.getProduct().get(pilihan1 - 1).produkLaku(UhuComputer); // Mengurangi jumlah stok dan pengecekan jika stok = 0, maka laptop akan di-remove dari list product
                        user.setBalance(UhuComputer.getProduct().get(pilihan1 - 1).getPrice()); // Menyesuaikan Balance dari user setelah transaksi berhasil

                        sign.resi(pilihan1-1);
                        int pilihan2 = sr.nextInt();

                        if (pilihan2 == 1) { // Break Loop 2
                            break;
                        } else {
                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0); // Menghentikan seluruh Loop / return 0
                        }
                    } else if (konfirmasi == 2) { // Opsi batalkan transaksi (Break Loop 2)
                        break;
                    } else {
                        sign.informasi(pilihan1-1);
                    }
                }
            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        }

        sr.close();
    }
}
