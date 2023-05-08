package Praktikum7;

import java.util.ArrayList;

public abstract class Character {
    protected String name;
    protected int attackPower;
    protected String attackType;

    public Character(String name, int attackPower, String attackType) {
        this.name = name;
        this.attackType = attackType;
        this.attackPower = attackPower;
    }
    abstract int attack();
    abstract int attack(String attackType);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(String attackType) {
        this.attackPower = this.attack(attackType);
    }

    public String getAttackType() {
        return attackType;
    }

    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }
    public void printAttack(Character character){
        character.setAttackPower(character.getAttackType());
        System.out.printf("Attack Type : %s%nAttack Power : %d", character.getAttackType(),character.getAttackPower());
    }
}

class Fighter extends Character{
    public Fighter(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);
    }
    @Override
    public int attack() {
        return this.getAttackPower();
    }
    @Override
    public int attack(String attackType) {
        if (attackType.strip().toLowerCase() == "melee"){
            return this.attack()*2;
        }
        else {
            return this.attack();
        }
    }

    @Override
    public void printAttack(Character character) {
        super.printAttack(character);
    }
}

class Mage extends Character{
    public Mage(String name, int attackPower, String attackType) {
        super(name, attackPower, attackType);
    }

    @Override
    int attack() {
        return this.getAttackPower();
    }
    @Override
    int attack(String attackType) {
        if (attackType.strip().toLowerCase() == "frost"){
            return this.attack()*2;
        } else {
            return this.attack()*3;}
    }

    @Override
    public void printAttack(Character character) {
        super.printAttack(character);
    }
}

class MainCharacter{
    public static void main(String[] args) {
        Character[] characters = {new Fighter("Mansur", 100, "ranged"),
                                  new Mage("Ucup", 120, "frost"),
                                  new Fighter("Asep", 140, "melee"),
                                  new Fighter("Yohanes", 110, "melee"),
                                  new Mage("Petrus",150,"fire")};

        for (Character character:characters){
            System.out.println("Nama : "+character.getName());
            character.printAttack(character);
            System.out.printf("%n%n");
        }

    }
}