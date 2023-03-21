package Praktikum03.SimpleStoreApp;

public class Sign {
    Store store;
    User user;
    public Sign(Store store, User user){
        this.store = store;
        this.user = user;
    }
    public void pilihan(){
        System.out.println("-".repeat(40));
        System.out.println("Tidak ada dalam pilihan!");
    }
    public void konfirmasi(int i){
        System.out.println("-".repeat(40)); // garis
        System.out.println("Apakah anda yakin ingin membeli:");
        System.out.printf("%s, dengan Harga $%d%n", store.getProduct().get(i).getName(), store.getProduct().get(i).getPrice());
        System.out.println("-".repeat(40));
    }
    public void repeat(){
        System.out.println("-".repeat(40));
    }

    public void resi(int i){
        System.out.printf("%s berhasil membeli %s.%n", user.getName(), store.getProduct().get(i).getName());
        System.out.println("-".repeat(40));
        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
        System.out.print("> ");
    }

    public void informasi(int i){
        System.out.println("-".repeat(40));
        System.out.printf("Informasi : Balance Anda = $%d | harga laptop = $%d | %s%n", user.getBalance(), store.getProduct().get(i).getPrice(), (user.getBalance() < store.getProduct().get(i).getPrice()) ? "Silahkan Batalkan pesanan, Balance anda tidak cukup" : "Masukkan Perintah Dengan Benar!");

    }
}
