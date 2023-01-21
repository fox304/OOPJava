package Seminar1.Dairy;

public class Curd extends DairyProducts {
    private String consistence;

    public String getConsistence() {
        return consistence;
    }

    public Curd(int cost,int count,String name, double fat, String consistence) {
        super(cost,count,name, fat);
        this.consistence = consistence;
    }

    @Override
    public String toString() {
        return super.toString()+" consistence = "+consistence+" }";
    }
}
