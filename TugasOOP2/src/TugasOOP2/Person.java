package TugasOOP2;

public class Person {
    String name;
    int age;
    boolean isMale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getGender() {

        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
    public void informationBoard() {
        System.out.println("Nama  : "+ getName());
        System.out.println("Umur : "+ getAge());
        System.out.println("Jenis Kelamin  : "+ (getGender() ? "Laki-Laki" : "Perempuan"));
} }
