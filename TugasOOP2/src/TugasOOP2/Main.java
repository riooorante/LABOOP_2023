package TugasOOP2;

class Cuboid {
    double height;
    double width;
    double lenght;
    double getVolume() {
        return height*width*lenght;
    }

}
public class Main {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.lenght = 4.5d;
        cuboid.height = 10.0d;
        cuboid.width = 100.0d;

        System.out.printf("Volume = %.2f", cuboid.getVolume());

    }
}
