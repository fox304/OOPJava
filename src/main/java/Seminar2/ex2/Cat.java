package Seminar2.ex2;

public class Cat extends Animal implements Runable{
    private  String color;
    public Cat(String name,int box,String color){
        super(name,box);
        this.color = color;
    }


    @Override
    public String say() {
        return "Мяу";
    }

    @Override
    public int speadOfRun() {
        return 15;
    }
}
