package TugasOOP2.Mahasiswa;

public class Alamat {
    String jalan;
    String kota;

    public String getJalan() {
        return jalan;
    }

    public void setJalan(String jalan) {
        this.jalan = jalan;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }
    public String getAlamatLengkap() {
        return this.jalan+", "+this.kota;
    }
}
