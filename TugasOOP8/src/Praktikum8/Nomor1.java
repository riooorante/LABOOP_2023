package Praktikum8;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Nomor1 {
    // Tugas Nomor 1
}

class TaskTimeHelper{
    private static int waktuEksekusi;
    public static int getWaktuEksekusi(){
        Random random = new Random();
        waktuEksekusi = random.nextInt(7)+1;
        return waktuEksekusi;
    }
}

class BackgroundThread implements Runnable{
    private int waktuEksekusi;
    private int berhasil;
    private int gagal;
    private int jumlahData;

    public BackgroundThread(int jumlahData) {
        this.jumlahData = jumlahData;
    }

    @Override
    public void run() {
        for (int i = 0;i < jumlahData;i++){
            waktuEksekusi = TaskTimeHelper.getWaktuEksekusi();
            if (0 <= waktuEksekusi && waktuEksekusi <= 4){
                try {
                    TimeUnit.SECONDS.sleep(waktuEksekusi);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Loading... (%ss)%n", waktuEksekusi);
                this.berhasil++;
            } else {
                System.out.println("Request Time Out!");
               this.gagal++;
            }
        };
    }
    public int getBerhasil() {
        return this.berhasil;
    }

    public int getGagal() {
        return this.gagal;
    }
}

class UIThread{
    public static void main(String[] args) throws InterruptedException{
        Random random = new Random();
        int jumlahData = random.nextInt(9)+1;

        long start = System.currentTimeMillis();

        System.out.printf("Start load %s data%n%n", jumlahData);

        BackgroundThread backgroundThread = new BackgroundThread(jumlahData);
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.submit(backgroundThread);
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);

        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Task Finish");
        System.out.printf("Time Execution %ds%n", (int) ((end - start) / 1000));

        if (backgroundThread.getBerhasil() == jumlahData) {
            System.out.println("All data is succesfully loaded!");
        } else {
            System.out.printf("Data Succesfully Loaded %d & Data Failed to load %d", backgroundThread.getBerhasil(), backgroundThread.getGagal());
        }
    }
}