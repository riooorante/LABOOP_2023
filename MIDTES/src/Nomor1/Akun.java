package Nomor1;

public class Akun {
    private String name;
    private String username;
    private String password;
    private boolean isPremium;

    public Akun(String name, String username, String password, boolean isPremium) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

}
