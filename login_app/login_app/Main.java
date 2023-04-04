package login_app;

import java.util.ArrayList;
import java.util.Scanner;
import login_app.models.Profile;
import login_app.models.User;
import login_app.utils.StringUtils;

public class Main {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");
        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            if (listUser.get(i).getUsername().equals(username)){
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            /*
             * TODO
             * Mengecek apakah password dari User yang login berdasarkan username
             * sama dengan password yang diinput sebelumnya, kemudian simpan
             * hasilnya di variabel isPasswordMatch
             */
            boolean isPasswordMatch = false;
            if (listUser.get(userIndex).getPassword().equals(password)){
                isPasswordMatch = true;
            }

            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                /*
                 * TODO
                 * panggil method showDetailUser dan kirimkan data Profile User yang login

                 */
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");
        // Menginput username dan password

        String username,password;
        while (true) {
            System.out.println("Username");
            System.out.print("> ");
            username = sc.nextLine();
            System.out.println("Password");
            System.out.print("> ");
            password = sc.nextLine();
            boolean isUsernameExist = false;
            if (!password.isBlank() && !username.isBlank() && password.length() >= 8){
                if (listUser.isEmpty()) {
                    break;
                }
                for (User user : listUser) {
                    if (user.getUsername().equals(username)) {
                        isUsernameExist = true;
                        break;
                    }
                }
            } else {
                System.out.printf("Username atau password tidak boleh kosong dan password tidak boleh kurang dari 8 karakter%n");
            }
            if (!isUsernameExist) {
                break;
            }
        }

        User user = new User(username,password);


        Profile profile = new Profile();

        // Menginput Data Profile
        int age = 0;
        String fullName,hobby;
        boolean x = false;
        while (true){
            System.out.println("Nama Lengkap");
            System.out.print("> ");
            fullName = sc.nextLine();
            try {
                System.out.println("Umur");
                System.out.print("> ");
                age = sc.nextInt();
                x = true;
            } catch (Exception e){
                System.out.println("Umur harus berupa angka!");
            }
            sc.nextLine();
            System.out.println("Hobby");
            System.out.print("> ");
            hobby = sc.nextLine();
            if (!hobby.isBlank() && !fullName.isBlank() && x) {
                break;
            }
            System.out.println("Nama, Hobby, atau, umur tidak boleh kosong!");
        }

        /*
         * TODO
         * Berikan nilai fullName, age, dan hobby ke objek profile yang telah
         * di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
         * diinput sebelumnya
         */
        profile.setNama(fullName);
        profile.setHobi(hobby);
        profile.setUmur(age);

        /*
         * TODO
         * Berikan nilai nickName ke objek profile,
         * Nilai ini diperoleh menggunakan static method yang dibuat di class
         * StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
         */
        profile.setNickname(StringUtils.nickName(profile.getNama()));

        // Menambahkan user yang dibuat ke list user
        listUser.add(user);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profile);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        /*
         * TODO *
         * Tampilkan semua data profile user yang login
         */
        System.out.printf("Nama : %s%n" ,profile.getNama());
        System.out.printf("Nickname : %s%n",profile.getNickname());
        System.out.printf("Hobby : %s%n",profile.getHobi());
        System.out.printf("Umur : %d%n",profile.getUmur());

    }
}
