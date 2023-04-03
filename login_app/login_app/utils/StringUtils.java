package login_app.utils;
;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(nickName("Mario Valerian Rante"));
    }
    static public String nickName(String name){
        String[] listNama = name.split(" ");
        if (listNama.length == 1){
            name = listNama[0];
        } else {
            name = listNama[1];
        }
        return name;
    }
}
