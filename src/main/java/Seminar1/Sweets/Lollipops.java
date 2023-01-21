package Seminar1.Sweets;

public class Lollipops extends Sweets{
    private String isStick;

    public String getIsStick() {
        return isStick;
    }

    public Lollipops(int price, int count, String name, double sugar, String isStick) {
        super(price, count, name, sugar);
        this.isStick = isStick;
    }

    @Override
    public String toString() {
        return super.toString()+" isStick = "+isStick+" }";
    }
}
