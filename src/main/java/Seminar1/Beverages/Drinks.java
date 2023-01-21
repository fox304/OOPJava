package Seminar1.Beverages;

import Seminar1.org.example.Products;

public class Drinks extends Products {
    private String color;

    public String getColor() {
        return color;
    }

    public Drinks(int price, int count, String name, String color) {
        super(price, count, name);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "color = "+color+" ,";
    }
}
