package TugasOOP2;

public class ProdukApp {
    public static void main(String[] args) {
        Produk snack1 = new Produk();
        snack1.setNama("Maitos");
        snack1.setID("H01");
        snack1.setHarga(10_000);
        snack1.setStok(0);
        snack1.informationBoard();

    }
}
