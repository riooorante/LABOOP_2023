package Praktikum03.SimpleStoreApp;

public class Product {
    private String name;
    private int price;
    private int stock;

    public Product() {
    }

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public Product(String name, String price, int stock) {
        this.name = name;
        this.price = Integer.parseInt(price.substring(0, price.length() - 1) + "000");
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void produkLaku(Store store) {
        this.stock--;
        if (this.stock == 0) {
            store.getProduct().remove(this);
        }
    }

}

