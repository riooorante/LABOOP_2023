package TugasOOP6;

public class Car implements Move{
    protected String color;
    protected int totalForwardGear;
    protected int maxSpeed;

    public Car(String color, int totalForwardGear) {
        this.color = color;
        this.totalForwardGear = totalForwardGear;
        this.setMaxSpeed();
    }

    @Override
    public void move() {
        System.out.printf("Mobil %s sedang berakselerasi dengan max kecepatan %d km/jam%n%n", this.getColor(),this.getMaxSpeed());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTotalForwardGear() {
        return totalForwardGear;
    }

    public void setTotalForwardGear(int totalForwardGear) {
        this.totalForwardGear = totalForwardGear;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed() {
        this.maxSpeed = (this.getTotalForwardGear()/2)*100;
    }
}
