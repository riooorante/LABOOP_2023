package TugasOOP6;

public abstract class Dog implements Move{
    protected int position;
    protected int averageLenght;

    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }
    abstract void describe();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getAverageLenght() {
        return averageLenght;
    }

    public void setAverageLenght(int averageLenght) {
        this.averageLenght = averageLenght;
    }
}

class Pitbull extends Dog{
    public Pitbull(int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move(){
        this.setPosition(this.getPosition()+3);
    }
    public void describe(){
        System.out.println("Anjing Yang Agresif!");
    }
}

class Bulldog extends Dog{
    public Bulldog(int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move(){
        this.setPosition(this.getPosition()+1);
    }
    public void describe(){
        System.out.println("Anjing Yang Agresif!");
    }
}

class SiberianHusky extends Dog{
    public SiberianHusky(int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move(){
        this.setPosition(this.getPosition()+2);
    }
    public void describe(){
        System.out.println("Anjing Yang Agresif!");
    }
}

class GermanShepherd extends Dog{
    public GermanShepherd(int position, int averageLenght) {
        super(position, averageLenght);
    }
    public void move(){
        this.setPosition(this.getPosition()+3);
    }
    public void describe(){
        System.out.println("Anjing Yang Agresif!");
    }
}

