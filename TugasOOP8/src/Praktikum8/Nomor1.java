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

    @Override
    public void run() {
        waktuEksekusi = TaskTimeHelper.getWaktuEksekusi();
        System.out.println("start " +" "+System.currentTimeMillis()+" "+Thread.currentThread().getName());
        try {
            Thread.sleep(waktuEksekusi*1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        if (waktuEksekusi > 4){
            System.out.println("Request Timeout! "+waktuEksekusi+" "+Thread.currentThread().getName());
            Counter.Gagal();
        } else {
            System.err.println("Selesai "+System.currentTimeMillis()+" "+Thread.currentThread().getName());
            Counter.Berhasil();
        }
    }
}
class Counter {
    public static int berhasil;
    public static int gagal;
    public static synchronized void Berhasil() {
        berhasil++;
    }
    public static synchronized void Gagal() {
        gagal++;
    }
}
class Main{

    public static int data = 100;
    public static int count = 1;
    public static void main(String[] args) throws InterruptedException{
        System.out.printf("Start load %s data%n%n", data);
        ExecutorService executorService = Executors.newFixedThreadPool(16);

        long start = System.currentTimeMillis();

        for (int i = 0; i < data; i++) {
            BackgroundThread backgroundThread = new BackgroundThread();
            executorService.execute(backgroundThread);
        }
        executorService.shutdown();

        long end = System.currentTimeMillis();

        while (true) {
            System.out.printf("loading %ds%n",count);
            count++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            if (Counter.berhasil + Counter.gagal == data) {
                System.out.printf("%nTotal Waktu %ds", count-1);
                if (Counter.berhasil == data) {
                    System.out.printf("%nAll data is succesfully loaded!");
                } else {
                    System.out.printf("%nData Succesfully Loaded %d & Data Failed to load %d", Counter.berhasil,Counter.gagal);
                }
                break;

            }
        }
    }
}