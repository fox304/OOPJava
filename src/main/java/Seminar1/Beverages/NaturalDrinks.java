package Seminar1.Beverages;

public class NaturalDrinks extends Drinks{
    private int countFruits;

    public int getCountFruits() {
        return countFruits;
    }

    public NaturalDrinks(int price, int count, String name, String color, int countFruits) {
        super(price, count, name, color);
        this.countFruits = countFruits;
    }

    @Override
    public String toString() {
        return super.toString()+" countFruits = "+countFruits+" ,";
    }
}
