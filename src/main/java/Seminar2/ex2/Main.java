package Seminar2.ex2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Vasya",1,"gray"))
                .addAnimal(new Horse("Ignat",10))
                .addAnimal(new Duck("Masha",12));

        for (Animal an: zoo1.getAnimals()){
            System.out.println(an);
            System.out.println(an.getName() +" сказал "+an.say());
        }
        System.out.println();
        for (Speakable speak: zoo1.getSpeakables()){
            System.out.println(speak.say());
        }
        System.out.println();
        for(Runable run: zoo1.getRunner()){
            System.out.println(run.speadOfRun());
        }
        System.out.printf("Максимальная скорость : %s",zoo1.getChampionsOfRun());
        System.out.println();

        for(Flyable fly: zoo1.getFlier()){
            System.out.printf("Скорость полёта : %s",fly.speedOfFly());
        }




    }
}
