package Sweets;

import org.example.Products;

public class Sweets extends Products {
    private double sugar;

    public double getSugar() {
        return sugar;
    }

    public Sweets(int price,int count,String name,double sugar) {
        super(price,count,name);
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return super.toString()+" sugar = "+sugar+" }";
    }
}
