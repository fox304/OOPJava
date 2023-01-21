package Dairy;

public class Milk extends DairyProducts {
    private String shape;
    private String packingMaterial;
    public String getShape(){
        return shape;
    }
    public  String getPackingMaterial(){
        return packingMaterial;
    }

    public Milk(int cost,int count,String name, double fat, String shape, String packingMaterial) {
        super(cost,count,name, fat);
        this.shape = shape;
        this.packingMaterial = packingMaterial;
    }

    @Override
    public String toString() {
        return super.toString()+" packingMaterial"+packingMaterial+" }";
    }
}







