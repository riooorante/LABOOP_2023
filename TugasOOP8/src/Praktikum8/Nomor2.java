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
            System.out.printf("%d. %s = %d ms%n", raceStanding.indexOf(raceStanding.get(i))+1, raceStanding.get(i).getName(), raceStanding.get(i).getFinishTime());
        }
    }

    public void startRace() throws InterruptedException{
        this.setNewWordsToType();
        System.out.println();
        
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

        Typer[] typers = new Typer[100];

        typers[0] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[1] = new Typer("Bot Toku", 71.0, typeRacer);
        typers[2] = new Typer("Bot Yukiao", 65.0, typeRacer);
        typers[3] = new Typer("Bot Mansur", 76.0, typeRacer);
        typers[4] = new Typer("Bot Toku", 98.0, typeRacer);
        typers[5] = new Typer("Bot Yukiao", 121.0, typeRacer);
        typers[6] = new Typer("Bot Mansur", 32.0, typeRacer);
        typers[7] = new Typer("Bot Toku", 44.0, typeRacer);
        typers[8] = new Typer("Bot Yukiao", 55.0, typeRacer);
        typers[9] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[10] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[11] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[12] = new Typer("Bot Toku", 65.0, typeRacer);
        typers[13] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[14] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[15] = new Typer("Bot Toku", 88.0, typeRacer);
        typers[16] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[17] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[18] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[19] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[20] = new Typer("Bot Mansur", 40.0, typeRacer);
        typers[21] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[22] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[23] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[24] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[25]= new Typer("Bot Mansur", 80.0, typeRacer);
        typers[26] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[27] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[28] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[29] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[30] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[31] = new Typer("Bot Mansur", 86.0, typeRacer);
        typers[32] = new Typer("Bot Toku", 50.0, typeRacer);
        typers[33] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[34] = new Typer("Bot Toku", 66.0, typeRacer);
        typers[35] = new Typer("Bot Yukiao", 76.0, typeRacer);
        typers[36] = new Typer("Bot Mansur", 30.0, typeRacer);
        typers[37] = new Typer("Bot Toku", 54.0, typeRacer);
        typers[38] = new Typer("Bot Yukiao", 90.0, typeRacer);
        typers[39] = new Typer("Bot Mansur", 100.0, typeRacer);
        typers[40] = new Typer("Bot Toku", 65.0, typeRacer);
        typers[41] = new Typer("Bot Yukiao", 80.0, typeRacer);
        typers[42] = new Typer("Bot Mansur", 900.0, typeRacer);
        typers[43] = new Typer("Bot Toku", 45.0, typeRacer);
        typers[44] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[45] = new Typer("Bot Toku", 71.0, typeRacer);
        typers[46] = new Typer("Bot Yukiao", 65.0, typeRacer);
        typers[47] = new Typer("Bot Mansur", 76.0, typeRacer);
        typers[48] = new Typer("Bot Toku", 98.0, typeRacer);
        typers[49] = new Typer("Bot Yukiao", 121.0, typeRacer);
        typers[50] = new Typer("Bot Mansur", 32.0, typeRacer);
        typers[51] = new Typer("Bot Toku", 44.0, typeRacer);
        typers[52] = new Typer("Bot Yukiao", 55.0, typeRacer);
        typers[53] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[54] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[55] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[56] = new Typer("Bot Toku", 65.0, typeRacer);
        typers[57] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[58] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[59] = new Typer("Bot Toku", 88.0, typeRacer);
        typers[60] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[61] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[62] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[63] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[64] = new Typer("Bot Mansur", 40.0, typeRacer);
        typers[65] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[66] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[67] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[68] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[69]= new Typer("Bot Mansur", 80.0, typeRacer);
        typers[70] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[71] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[72] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[73] = new Typer("Bot Toku", 72.0, typeRacer);
        typers[74] = new Typer("Bot Yukiao", 70.0, typeRacer);
        typers[75] = new Typer("Bot Mansur", 86.0, typeRacer);
        typers[76] = new Typer("Bot Toku", 50.0, typeRacer);
        typers[77] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[78] = new Typer("Bot Toku", 66.0, typeRacer);
        typers[79] = new Typer("Bot Yukiao", 76.0, typeRacer);
        typers[80] = new Typer("Bot Mansur", 30.0, typeRacer);
        typers[81] = new Typer("Bot Toku", 54.0, typeRacer);
        typers[82] = new Typer("Bot Yukiao", 90.0, typeRacer);
        typers[83] = new Typer("Bot Mansur", 100.0, typeRacer);
        typers[84] = new Typer("Bot Toku", 65.0, typeRacer);
        typers[85] = new Typer("Bot Yukiao", 80.0, typeRacer);
        typers[86] = new Typer("Bot Mansur", 900.0, typeRacer);
        typers[87] = new Typer("Bot Toku", 45.0, typeRacer);
        typers[88] = new Typer("Bot Toku", 50.0, typeRacer);
        typers[89] = new Typer("Bot Mansur", 80.0, typeRacer);
        typers[90] = new Typer("Bot Toku", 66.0, typeRacer);
        typers[91] = new Typer("Bot Yukiao", 76.0, typeRacer);
        typers[92] = new Typer("Bot Mansur", 30.0, typeRacer);
        typers[93] = new Typer("Bot Toku", 54.0, typeRacer);
        typers[94] = new Typer("Bot Yukiao", 90.0, typeRacer);
        typers[95] = new Typer("Bot Mansur", 100.0, typeRacer);
        typers[96] = new Typer("Bot Toku", 65.0, typeRacer);
        typers[97] = new Typer("Bot Yukiao", 80.0, typeRacer);
        typers[98] = new Typer("Bot Mansur", 900.0, typeRacer);
        typers[99] = new Typer("Bot Toku", 45.0, typeRacer);

        typeRacer.getRaceContestant().addAll(Arrays.asList(typers));

        typeRacer.startRace();
    }}


