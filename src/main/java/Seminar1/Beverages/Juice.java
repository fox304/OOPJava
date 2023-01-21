package Seminar1.Beverages;

public class Juice extends NaturalDrinks{
    private int percentFruits;

    public int getPercentFruits() {
        return percentFruits;
    }

    public Juice(int price, int count, String name, String color, int countFruits, int percentFruits) {
        super(price, count, name, color, countFruits);
        this.percentFruits = percentFruits;
    }

    @Override
    public String toString() {
        return super.toString()+" percentFruits = "+percentFruits+" }";
    }

}
