package TugasOOP2;

public class AlatMusikApp {
    public static void main(String[] args) {
        AlatMusik gitar = new AlatMusik();
        gitar.nama = "Gitar";
        gitar.jenisAlat = "dawai";
        gitar.caraMain("dipetik");

        AlatMusik drum = new AlatMusik();
        drum.nama ="Drum";
        drum.jenisAlat = "perkusi";
        drum.caraMain("dipukul");
    }
}
