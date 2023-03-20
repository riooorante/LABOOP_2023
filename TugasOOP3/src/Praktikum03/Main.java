package Praktikum03;

import java.lang.Math;

class Player {
    private String name;
    private int hp = 100;
    private int attackPower;
    private int defence;

    public Player(){}
    public Player(String name, int attackPower, int defence) {
        this.name = name;
        this.attackPower = attackPower;
        this.defence = defence;
    }

    public Player(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public void getDamage(Player enemy) {
        this.hp = this.hp - Math.abs(enemy.getAttackPower() - this.defence);
    }

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + this.hp);
        System.out.println("Defence = " + this.defence);
        System.out.println("Attack = " + this.attackPower + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30, 15);
        Player player2 = new Player("Hilda", 10);

        player2.setAttackPower(35);
        player1.getDamage(player2);

        player1.status();
        player2.status();
    }
}
