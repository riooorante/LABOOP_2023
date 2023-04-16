package Nomor1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showInfo();
            System.out.print("Bangun Ruang/Bangun Datar (A/B) > ");
            String pilihan = scanner.next();
            if (pilihan.strip().equalsIgnoreCase("a")) {
                System.out.print("Pilih Bangun > ");
                int input = scanner.nextInt();
                System.out.println("=".repeat(30));
                switch (input) {
                    case 1:
                        System.out.print("Sisi > ");
                        int sisi = scanner.nextInt();
                        Kubus kubus = new Kubus(sisi);
                        kubus.volume();
                        kubus.luasPermukaan();
                        break;
                    case 2:
                        System.out.print("Sisi > ");
                        int sisiB = scanner.nextInt();
                        System.out.print("Tinggi > ");
                        int tinggiB = scanner.nextInt();
                        Balok balok = new Balok(sisiB, tinggiB);
                        balok.volume();
                        balok.luasPermukaan();
                        break;
                    case 3:
                        System.out.print("Radius > ");
                        int radiusB = scanner.nextInt();
                        Bola bola = new Bola(radiusB);
                        bola.volume();
                        bola.luasPermukaan();
                        break;
                    case 4:
                        System.out.print("Radius > ");
                        int radiusT = scanner.nextInt();
                        System.out.print("Tinggi > ");
                        int tinggiT = scanner.nextInt();
                        Tabung tabung = new Tabung(radiusT, tinggiT);
                        tabung.volume();
                        tabung.luasPermukaan();
                        break;
                }
                quit();
                String konfirmasi = scanner.next();
                if (konfirmasi.strip().trim().equalsIgnoreCase("n")){System.exit(0);}
            }  else {
                System.out.print("Pilih Bangun > ");
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        System.out.print("Sisi > ");
                        int sisi = scanner.nextInt();
                        Persegi persegi = new Persegi(sisi);
                        persegi.luas();
                        persegi.keliling();
                        break;
                    case 2:
                        System.out.print("Sisi > ");
                        int sisiB = scanner.nextInt();
                        System.out.print("Lebar > ");
                        int tinggiB = scanner.nextInt();
                        PersegiPanjang persegiPanjang = new PersegiPanjang(sisiB,tinggiB);
                        persegiPanjang.luas();
                        persegiPanjang.keliling();
                        break;
                    case 3:
                        System.out.print("Radius > ");
                        int radiusL = scanner.nextInt();
                        Lingkaran lingkaran = new Lingkaran(radiusL);
                        lingkaran.luas();
                        lingkaran.keliling();
                        break;
                    case 4:
                        System.out.print("Sisi > ");
                        int sisi3 = scanner.nextInt();
                        Segitiga segitiga = new Segitiga(sisi3);
                        segitiga.luas();
                        segitiga.keliling();
                        break;
                    case 5:
                        System.out.print("Sisi miring > ");
                        int sisiMI = scanner.nextInt();
                        System.out.print("Sisi atas > ");
                        int sisiAT = scanner.nextInt();
                        System.out.print("Sisi bawah> ");
                        int sisiBA = scanner.nextInt();
                        Trapesium trapesium = new Trapesium(sisiMI, sisiAT,sisiBA);
                        trapesium.luas();
                        trapesium.keliling();
                        break;

                }
                quit();
                String konfirmasi = scanner.next();
                if (konfirmasi.strip().trim().equalsIgnoreCase("n")){System.exit(0);}
            }
        }
    }

    public static void showInfo() {
        System.out.println("==== BANGUN RUANG ====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.printf("4. TABUNG%n");
        System.out.println("==== BANGUN DATAR ====");
        System.out.println("1. PERSEGI");
        System.out.println("2. PERSEGI PANJANG");
        System.out.println("3. LINGKARAN");
        System.out.println("4. SEGITIGA");
        System.out.println("5. TRAPESIUM");
    }

    public static void quit(){
        System.out.println("Apakah Ingin Melanjutkan Program? (Y/n)");
    }
}