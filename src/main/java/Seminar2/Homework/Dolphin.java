package Seminar2.Homework;

import Seminar2.ex2.Animal;

public class Dolphin extends Animal implements Swimable{
    private double lungVolume;

    public Dolphin(String name, int box, double lungVolume) {
        super(name, box);
        this.lungVolume = lungVolume;
    }

    @Override
    public int speedSwim() {
        return 20;
    }

    @Override
    public String say() {
        return "уи-уи";
    }
}
