package Praktikum03.SimpleStoreApp;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainApp {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);

        ArrayList<Product> produk = new ArrayList<>();
        User user = new User(null, 0);
        Store store = new Store(null, produk);
        Sign sign = new Sign(store, user);


        while (true){
            System.out.print("Nama Toko > ");
            store.setName(sr.nextLine());
            while (true){
                System.out.println("Tambahkan Produk");
                System.out.print("Nama/Harga/Stok > ");
                String[] data = sr.nextLine().split("/");
                store.addProduct(new Product(data[0],(data[1].substring(data.length) == "k")? data[1] : Integer.parseInt(data[1]), Integer.parseInt(data[2])));
                System.out.print("Apakah anda akan menambah produk lagi (Ketik Y jika iya) >");
                String konfir = sr.next();
                if (konfir.isBlank()) {
                    break;
                }
            }
            break;
        }

        while (true) {

            user.card();
            store.listProduct();
            System.out.print("> ");
            int pilihan1 = sr.nextInt();

            if (pilihan1 > store.getProduct().size()) {
                sign.pilihan();
            } else if (1 <= pilihan1 && pilihan1 <= produk.size()) {
                sign.konfirmasi(pilihan1 - 1);
                while (true) { // Loop 2
                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = sr.nextInt();
                    if (konfirmasi == 1 && user.getBalance() >= store.getProduct().get(pilihan1 - 1).getPrice()) {

                        sign.repeat();
                        store.getProduct().get(pilihan1 - 1).produkLaku(store);
                        user.setBalance(store.getProduct().get(pilihan1 - 1).getPrice());

                        sign.resi(pilihan1-1);
                        int pilihan2 = sr.nextInt();

                        if (pilihan2 == 1) {
                            break;
                        } else {
                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0);
                        }
                    } else if (konfirmasi == 2) {
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
