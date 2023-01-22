package Seminar2.ex2;

public class Duck extends Animal implements Runable,Flyable{

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Кря-кря";
    }

    @Override
    public int speadOfRun() {
        return 10;
    }

    @Override
    public int speedOfFly() {
        return 40;
    }
}
