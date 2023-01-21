package Beverages;

public class Pinocchio extends CarbonatedDrinks{
    private double volume;

    public double getVolume() {
        return volume;
    }

    public Pinocchio(int price, int count, String name, String color, int isSugar, double volume) {
        super(price, count, name, color, isSugar);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString()+" percentFruits = "+volume+" }";
    }
}
