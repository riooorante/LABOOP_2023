package Praktikum8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

class Typer extends Thread {
    private String botName, wordsType;
    private double wpm;
    private TypeRacer typeRacer;

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public int getDurasi() {
        return durasi;
    }

    private int durasi;

    public Typer(String botName, Double wpm, TypeRacer typeRacer) {
        this.botName = botName;
        this.wpm = wpm;
        this.wordsType = "";
        this.typeRacer = typeRacer;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public void setWpm(int wpm) {
        this.wpm = wpm;
    }

    private void addWordType(String newWordsTyped) {
        this.wordsType += newWordsTyped + " ";
    }

    public String getWordstype() {
        return wordsType;
    }

    public String getBotName() {
        return botName;
    }

    public double getWpm() {
        return wpm;
    }

    @Override
    public void run() {
        String[] wordsToType = typeRacer.getWordsToType().split(" ");

        long howLongToType = (long) ((60/this.getWpm())*1000);

        long start = System.currentTimeMillis();
        for (String word : wordsToType) {
            try {
                TimeUnit.MILLISECONDS.sleep(howLongToType);
                this.addWordType(word);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.addWordType("(selesai)");
        long end = System.currentTimeMillis();
        int waktu = (int) (end-start);
        this.setDurasi(waktu);

        typeRacer.addResult(this);



    }
}

class Result {
    private String name;
    private int finishTime;

    public Result(String name, int finishTime) {
        this.name = name;
        this.finishTime = finishTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(int finishTime) {
        this.finishTime = finishTime;
    }
}

class TypeRacer {
    private String wordsToType;
    private ArrayList<Typer> raceContestant = new ArrayList<>();
    private ArrayList<Result> raceStanding = new ArrayList<>();

    public String getWordsToType() {
        return wordsToType;
    }

    public ArrayList<Typer> getRaceContestant() {
        return raceContestant;
    }

    // word by Yusuf Syam, silahkan diubah jika kurang bijak
    private String[] wordsToTypeList = {"Kesuksesan sejati adalah ketika kita mencapai tujuan kita sambil tetap mempertahankan integritas dan empati terhadap orang lain"};

    public void setNewWordsToType() {
        Random random = new Random();
        int angkaRandom = random.nextInt(wordsToTypeList.length);
        wordsToType = wordsToTypeList[angkaRandom];
    }

    public void addResult(Typer typer){
        Result result = new Result(typer.getBotName(), typer.getDurasi());
        raceStanding.add(result);
    }

    private void printRaceStanding() {
        System.out.println("\nKlasmen Akhir Type Racer");
        System.out.println("=========================\n");
        for (int i = 0; i < raceStanding.size(); i++){
            System.out.printf("%d. %s = %d detik%n", raceStanding.indexOf(raceStanding.get(i))+1, raceStanding.get(i).getName(), raceStanding.get(i).getFinishTime());
        }
    }

    public void startRace() throws InterruptedException{
        this.setNewWordsToType();
        for (Typer typer : raceContestant){
            typer.start();
        }
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Typing Progress ...");
            System.out.println("================");
            for (Typer i : raceContestant){
                System.out.printf("- %s => %s%n",  i.getBotName(), i.getWordstype());
            }
            if (raceStanding.size() == raceContestant.size()){
                break;
            }
        }

        this.printRaceStanding();
    }
}

public class Nomor2 {
    public static void main(String[] args) throws InterruptedException{
        TypeRacer typeRacer = new TypeRacer();
        typeRacer.setNewWordsToType();
        System.out.println("|| Text to Type");
        System.out.println("\"" + typeRacer.getWordsToType() + "\"");

        Typer[] typers = new Typer[3];

        typers[0] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[1] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 70.0, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }}


