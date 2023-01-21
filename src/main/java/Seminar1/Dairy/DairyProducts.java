package Dairy;

import org.example.Products;

public class DairyProducts extends Products {
    private double fat;

    public double getFat() {
        return fat;
    }



    public DairyProducts(int price, int count, String name,double fat) {
        super(price, count, name);
        this.fat = fat;
    }

    @Override
    public String toString() {
        return super.toString()+" fat = "+fat+" ,";
    }
}
