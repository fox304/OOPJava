package Seminar2.ex2;

public class Horse extends Animal implements Runable{
    public Horse(String name,int box){
        super(name,box);

    }

    @Override
    public String say() {
        return "Игого";
    }

    @Override
    public int speadOfRun() {
        return 60;
    }
}
