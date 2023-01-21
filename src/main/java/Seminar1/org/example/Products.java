package Seminar1.org.example;

public class Products {
    private int price;
    private int count;
    private String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public Products(int price, int count,String name) {
        this.price = price;
        this.count = count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Products{" +
                "price=" + price +
                ", count=" + count +
                ", name='" + name + '\'' +
                ',';
    }
}
