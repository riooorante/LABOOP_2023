package Praktikum7;

import java.util.ArrayList;
import java.util.List;

public class FoodFactory {
    public static Food getFood1(FoodType foodType){
        if (foodType == FoodType.BURGER){
            Burger burger = new Burger();
            return burger;
        } else if (foodType == FoodType.PIZZA) {
            Pizza pizza = new Pizza();
            return pizza;
        } else if (foodType == FoodType.STEAK){
            Steak steak = new Steak();
            return steak;
        } else {return null;}
    }
    public static Food getFood(FoodType foodType){
        switch (foodType){
            case PIZZA -> {
                return new Pizza();
            }
            case BURGER -> {
                return new Burger();}
            case STEAK -> {
                return new Steak();}
            default -> throw new IllegalArgumentException("Salah Input!"+foodType);
        }
    }

}
enum FoodType {
    BURGER, PIZZA, STEAK
        }
class Burger implements Food{
    protected final int price = 15000;
    @Override
    public int getPrice() {
        return this.price;
    }
}
class Pizza implements Food{
    protected final int price = 30000;
    @Override
    public int getPrice() {
        return this.price;
    }
}
class Steak implements Food{
    protected final int price = 100000;
    @Override
    public int getPrice() {
        return this.price;
    }
}
class Restaurant{
    public static int calculateTotal(List<Food> foods){
        int total = 0;
        for (Food food : foods){
            total += food.getPrice();
        }
        return total;
    }
}

class MainRestaurant{
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood(FoodType.BURGER);
        Food pizza = FoodFactory.getFood(FoodType.PIZZA);
        Food steak = FoodFactory.getFood(FoodType.STEAK);

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total Price: "+total);
    }
}