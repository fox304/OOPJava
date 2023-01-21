package Sweets;

public class Candies extends  Sweets{
    private String shape;
    public String getShape(){
        return shape;
    }

    public Candies(int price, int count, String name, double sugar, String shape) {
        super(price, count, name, sugar);
        this.shape = shape;
    }

    @Override
    public String toString() {
        return super.toString()+" shape = "+shape+" }";
    }
}
