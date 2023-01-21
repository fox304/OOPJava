package Beverages;

public class CarbonatedDrinks extends Drinks{
    private int isSugar;

    public int getIsSugar() {
        return isSugar;
    }

    public CarbonatedDrinks(int price, int count, String name, String color, int isSugar) {
        super(price, count, name, color);
        this.isSugar = isSugar;
    }
}
