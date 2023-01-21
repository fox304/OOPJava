package Beverages;

public class Kvass extends NaturalDrinks{
    private double alcogol;

    public double getAlcogol() {
        return alcogol;
    }

    public Kvass(int price, int count, String name, String color, int countFruits, double alcogol) {
        super(price, count, name, color, countFruits);
        this.alcogol = alcogol;
    }

    @Override
    public String toString() {
        return super.toString()+" percentFruits = "+alcogol+" }";
    }
}
