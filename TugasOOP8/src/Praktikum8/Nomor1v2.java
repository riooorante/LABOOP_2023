package Praktikum8;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Nomor1v2 {
}

class BackgroundThreadV2 implements Runnable {
    private int waktuEksekusi;
    private int berhasil;
    private int gagal;

    @Override
    public synchronized void run() {
        Random random = new Random();
        waktuEksekusi = TaskTimeHelper.getWaktuEksekusi();
        if (0 <= waktuEksekusi && waktuEksekusi <= 4) {
            try {
                TimeUnit.SECONDS.sleep(waktuEksekusi);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.printf("Loading... (%ss)%n", waktuEksekusi);
            this.berhasil++;
        } else {
            System.out.println("Request Time Out!");
            this.gagal++;
        }
    }

    public int getBerhasil() {
        return this.berhasil;
    }

    public int getGagal() {
        return this.gagal;
    }
}

class UIThreadV2 {
    public static void main(String[] args) {
        BackgroundThreadV2 backgroundThread = new BackgroundThreadV2();

        long start = System.currentTimeMillis();

        System.out.println("Start load 4 Data.");
        System.out.println();

        Thread thread1 = new Thread(backgroundThread);
        Thread thread2 = new Thread(backgroundThread);
        Thread thread3 = new Thread(backgroundThread);
        Thread thread4 = new Thread(backgroundThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Task Finish");
        System.out.printf("Time Execution %ds%n", (int) ((end-start)/1000));

        if (backgroundThread.getBerhasil() == 4){
            System.out.println("All data is succesfully loaded!");
        } else {
            System.out.printf("Data Succesfully Loaded %d & Data Failed to load %d", backgroundThread.getBerhasil(), backgroundThread.getGagal());
        }
    }
}

