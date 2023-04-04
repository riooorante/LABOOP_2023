package login_app.NO2;

public class Main {
    public static void main(String[] args) {
        Utils.selfDisplay();
        Pesanan pesanan = new Pesanan("Gofood", "Daya", 50000);
        pesanan.tampilkan();
    }
}
