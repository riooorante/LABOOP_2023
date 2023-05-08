package Praktikum7;

import java.util.ArrayList;
import java.util.List;

public class FoodFactory {
    public static Food getFood(String food){
        if (food.equalsIgnoreCase("burger")){
            Burger burger = new Burger();
            return burger;
        } else if (food.equalsIgnoreCase("pizza")) {
            Pizza pizza = new Pizza();
            return pizza;
        } else {
            Steak steak = new Steak();
            return steak;
        }
    }
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
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");

        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total Price: "+total);
    }
}