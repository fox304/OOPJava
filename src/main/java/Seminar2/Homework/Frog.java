package Seminar2.Homework;

import Seminar2.ex2.Animal;

public class Frog extends Animal implements Swimable{
    private boolean poisonous;

    public Frog(String name, int box, boolean poisonous) {
        super(name, box);
        this.poisonous = poisonous;
    }


    @Override
    public int speedSwim() {
        return 3;
    }

    @Override
    public String say() {
        return "ква-ква";
    }
}
