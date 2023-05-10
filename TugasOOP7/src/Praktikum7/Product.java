package Praktikum7;

import java.util.ArrayList;

public class Product<T,R>{
    protected String name;
    protected T price;
    protected String expireDate;

    public Product(String name, T price, String expireDate) {
        this.name = name;
        this.price = price;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }
}

class MainProduct {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product<Integer>("Sari Roti", 10000,"2030-03-02"));
        products.add(new Product<String>("Pocari", "Rp 10000", "2027-03-04"));
        products.add(new Product<Double>("Tango", 10.2, "2034-04-02"));

        int urutan = 1;
        for (Product product:products){
            System.out.println("Product "+urutan+": "+product.getName()+" - "+product.getPrice()+" - "+product.getExpireDate());
            urutan++;
        }
    }

}