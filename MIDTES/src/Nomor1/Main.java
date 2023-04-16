package Nomor1;

import Nomor1.Akun;
import Nomor1.Subtitle;
import Nomor1.Video.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * TODO 1
         * Instance Objek Akun
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Akun akun = new Akun("Mario", "riooorante","H071221075",true);

        /*
         * TODO 2-A
         * Instance Objek Subtitle (subtitleMovie)
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Subtitle subtitleMovie = new Subtitle("Indonesia", "Pein Akatsuki");

        /*
         * /*
         * TODO 2-B
         * Instance Objek Subtitle (subtitleSeries)
         * Pemberian nilai bisa dari constructor ataupun setter
         /*

         */
         Subtitle subtitleSeries = new Subtitle("Melayu", "Lebah Ganteng");


        /*
         * TODO 3
         * Instance Objek Movie
         * Pemberian nilai bisa dari constructor ataupun setter
         *
         */
        Movie faMovie = new Movie("Buya Hamka","History", 2023, subtitleMovie, 106);

        /*
         * TODO 4
         * Instance Objek Series
         * Pemberian nilai bisa dari constructor ataupun setter
         */
        Series faSeries = new Series("Duty After School", "Thriller", 2023, subtitleSeries,10,1 );
        /*
         * TODO 5
         * Kirimkan objek akun, movie, series
         * ke method runApp
         */
        runApp(akun,faMovie,faSeries);
    }

    private static void runApp(Akun akun, Movie faMovie, Series faSeries) {
        /*
         * TODO 6
         * Tampilkan nama dan tipe akun seperti contoh berikut :
         * Welcome, Sanji
         * | Akun Trial |
         * (jika isPremium bernilai true
         * maka tampilakan |Akun Premium|
         * jika false tampilkan |Akun Trial|)
         */
        System.out.println("Welcome, Mario");
        if (akun.isPremium()){
            System.out.println("| Akun Premium |");
        }
        System.out.println("| Akun Trial |");

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Show Favorite Movie");
        System.out.println("2. Show Favorite Series");
        System.out.println("3. Show Feedback");
        System.out.print("> ");
        int inp = scanner.nextInt();
        switch (inp) {
            case 1:
                System.out.println("-".repeat(25));
                System.out.println("Favorite Movie");
                // TODO 7 : Tampilkan Detail Movie
                faMovie.showDetail();
                break;
            case 2:
                System.out.println("-".repeat(25));
                System.out.println("Favorite Series");
                // TODO 8 : Tampilkan Detail Series
                faSeries.showDetail();
                break;
            case 3:
                System.out.println("=".repeat(25));
                // TODO 9 : Tampilkan Data Diri (showMyData)
                // TODO 10 : Tampilkan Kritik dan Saran
                System.out.println("=".repeat(25));
                HelperMid.showMyData();
                HelperMid.ShowFeedbackLab();
                break;
            default:
                break;
        }
        scanner.close();
    };
}