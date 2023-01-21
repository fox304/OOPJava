package Sweets;

public class Chololate extends  Sweets{
    private  String thickable;



    public String getThickable() {
        return thickable;
    }

    public Chololate(int price, int count, String name, double sugar, String thickable) {
        super(price, count, name, sugar);
        this.thickable = thickable;
    }

    @Override
    public String toString() {
        return super.toString()+" thickable = "+thickable+" }";
    }
}
