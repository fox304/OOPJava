package Seminar2.ex2;

import Seminar2.Homework.Dolphin;
import Seminar2.Homework.Frog;
import Seminar2.Homework.Swimable;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Vasya",1,"gray"))
                .addAnimal(new Horse("Ignat",10))
                .addAnimal(new Duck("Masha",12))
                .addAnimal(new Dolphin("Лёвка",3,8))
                .addAnimal(new Frog("Квакша",5,true));

        System.out.println("---------------------------------");
        for (Animal an: zoo.getAnimals()){
            System.out.println(an);
            System.out.println(an.getName() +" сказал "+an.say());
        }
        System.out.println("-------------Звуки в зоопарке--------------------");
        for (Speakable speak: zoo.getSpeakables()){
            System.out.println(speak.say());
        }
        System.out.println("-------------Бегуны--------------------");
        for(Runable run: zoo.getRunner()){
            System.out.printf("%s  скорость бега : %s\n",run,run.speadOfRun());
        }
        System.out.println("-------------Пловцы--------------------");
        for(Swimable swim: zoo.getSwim()){

            System.out.printf("%s  скорость бега : %s\n",swim,swim.speedSwim());
        }
        System.out.println();
        System.out.println("---------------------------------");
        System.out.printf("Максимальная скорость бегуна: %s",zoo.getChampionsOfRun());
        System.out.println();
        System.out.printf("Максимальная скорость пловца : %s",zoo.getChampionsOfSwim());
        System.out.println();
        for(Flyable fly: zoo.getFlier()){
            System.out.printf("Скорость полёта : %s",fly.speedOfFly());
        }




    }
}
