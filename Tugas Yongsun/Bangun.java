package Pertemuan5;
import java.util.Scanner;

public class Bangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("MENU");
        System.out.println("1. BANGUN RUANG");
        System.out.println("2. BANGUN DATAR");
        System.out.print("> ");

        int pilihan = input.nextInt();
        System.out.println("");
        
        switch (pilihan) {
            case 1: //Bangun ruang
                System.out.println("=== BANGUN RUANG ===");
                System.out.println("1. KUBUS");
                System.out.println("2. BALOK");
                System.out.println("3. BOLA");
                System.out.println("4. TABUNG");
                System.out.print("> ");

                int pilihan2 = input.nextInt();
                System.out.println("");
            
                switch (pilihan2) {
                    case 1: //Kubus
                        System.out.println("Masukkan nilai sisi = ");
                        System.out.print("> ");
                        double sisi = input.nextDouble();
                        System.out.println("");

                        Kubus kubus = new Kubus(sisi);
                        kubus.hitungLuasPermukaan();
                        kubus.hitungVolume();
                        break;
                        
                    case 2: //Balok
                        System.out.println("Masukkan nilai panjang = ");
                        System.out.print("> ");
                        double panjang = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai lebar = ");
                        System.out.print("> ");
                        double lebar = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai tinggi = ");
                        System.out.print("> ");
                        double tinggi = input.nextDouble();
                        System.out.println("");

                        Balok balok = new Balok(panjang, lebar, tinggi);
                        balok.hitungLuasPermukaan();
                        balok.hitungVolume();
                        break;

                    case 3: //Bola
                        System.out.println("Masukkan nilai jari-jari = ");
                        System.out.print("> ");
                        double jariJari = input.nextDouble();
                        System.out.println("");

                        Bola bola = new Bola(jariJari);
                        bola.hitungLuasPermukaan();
                        bola.hitungVolume();
                        break;
                        
                    case 4: //Tabung
                        System.out.println("Masukkan nilai jari-jari = ");
                        System.out.print("> ");
                        double jarijari = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai tinggi2 = ");
                        System.out.print("> ");
                        double tinggi2 = input.nextDouble();
                        System.out.println("");

                        Tabung tabung = new Tabung(jarijari, tinggi2);
                        tabung.hitungLuasPermukaan();
                        tabung.hitungVolume();
                        break;
                    }
            break;

            case 2: //Bangun datar
                    System.out.println("=== BANGUN DATAR ===");
                    System.out.println("1. PERSEGI");
                    System.out.println("2. PERSEGI PANJANG");
                    System.out.println("3. LINGKARAN");
                    System.out.println("4. SEGITIGA");
                    System.out.println("5. TRAPESIUM");
                    System.out.print("> ");

                    int pilihan3 = input.nextInt();
                    System.out.println("");
                    
                    switch(pilihan3) {
                        case 1: //Persegi
                        System.out.println("Masukkan nilai sisi = ");
                        System.out.print("> ");
                        double sisi = input.nextDouble();
                        System.out.println("");
                        
                        Persegi persegi = new Persegi(sisi);
                        persegi.hitungKeliling();
                        persegi.hitungLuas();
                        persegi.tampilkanKeliling();
                        persegi.tampilkanLuas();
                        break;
                        
                        case 2: //Persegi panjang
                        System.out.println("Masukkan nilai panjang = ");
                        System.out.print("> ");
                        double panjang = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai lebar = ");
                        System.out.print("> ");
                        double lebar = input.nextDouble();
                        System.out.println("");

                        PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                        persegipanjang.hitungKeliling();
                        persegipanjang.hitungLuas();
                        persegipanjang.tampilkanKeliling();
                        persegipanjang.tampilkanLuas();
                        break;
                        
                        case 3: //Lingkaran
                        System.out.println("Masukkan nilai jar-jari = ");
                        System.out.print("> ");
                        double jariJari = input.nextDouble();
                        System.out.println("");

                        Lingkaran lingkaran = new Lingkaran(jariJari);
                        lingkaran.hitungKeliling();
                        lingkaran.hitungLuas();
                        lingkaran.tampilkanKeliling();
                        lingkaran.tampilkanLuas();
                        break;

                        case 4: //Segitiga
                        System.out.println("Masukkan nilai alas = ");
                        System.out.print("> ");
                        double alas = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai tinggi = ");
                        System.out.print("> ");
                        double tinggi = input.nextDouble();
                        System.out.println("");

                        Segitiga segitiga = new Segitiga(alas, tinggi);
                        segitiga.hitungKeliling();
                        segitiga.hitungLuas();
                        segitiga.tampilkanKeliling();
                        segitiga.tampilkanLuas();
                        break;

                        case 5: //Trapesium
                        System.out.println("Masukkan nilai atas = ");
                        System.out.print("> ");
                        double atas = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai bawah = ");
                        System.out.print("> ");
                        double bawah = input.nextDouble();
                        System.out.println("");

                        System.out.println("Masukkan nilai tinggi = ");
                        System.out.print("> ");
                        double tinggi2 = input.nextDouble();
                        System.out.println("");
                        
                        Trapesium trapesium = new Trapesium(bawah, atas, tinggi2);
                        trapesium.hitungKeliling();
                        trapesium.hitungLuas();
                        trapesium.tampilkanKeliling();
                        trapesium.tampilkanLuas();
                        break;
                }
            break;
        }
        input.close();
    }
}
