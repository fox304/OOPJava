package Seminar1.Beverages;

public class Lemonade extends CarbonatedDrinks{
    private String tare;

    public String getTare() {
        return tare;
    }

    public Lemonade(int price, int count, String name, String color, int isSugar, String tare) {
        super(price, count, name, color, isSugar);
        this.tare = tare;
    }

    @Override
    public String toString() {
        return super.toString()+" percentFruits = "+tare+" }";
    }
}
