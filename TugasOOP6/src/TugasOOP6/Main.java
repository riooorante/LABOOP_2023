package TugasOOP6;

package java.util.ArrayList
java.util.Stack
public class Main {
    public static void main(String[] args) {
        // Class TugasOOP6.Dog
        Pitbull pitbull = new Pitbull(0,1);
        pitbull.describe();
        System.out.printf("TugasOOP6.Move 0 = %s%n", pitbull.getPosition());
        pitbull.move();
        System.out.printf("TugasOOP6.Move 1 = %s%n", pitbull.getPosition());
        pitbull.move();
        System.out.printf("TugasOOP6.Move 2 = %s%n", pitbull.getPosition());
        pitbull.move();
        System.out.printf("TugasOOP6.Move 3 = %s%n%n", pitbull.getPosition());

        // Class Smartphone
        Smartphone smartphone = new Smartphone(1_200_000,"Samsung");
        smartphone.move();

        // Class Car
        Car kijang = new Car("Hitam", 6);
        kijang.move();
    }
}