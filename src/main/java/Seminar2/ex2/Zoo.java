package Seminar2.ex2;

import java.util.ArrayList;
import java.util.List;
public class Zoo {
    /**
     * список животных класс Animal

     */
    private ArrayList <Animal> animals;
    private Radio radio = new Radio();
    public  Zoo(){
        animals = new ArrayList<>();
    }
    public Zoo addAnimal (Animal animal){
        animals.add(animal);
        return  this;
    }
    public List<Speakable> getSpeakables(){
        List<Speakable> answer = new ArrayList<>();
        for(Animal an:animals){
            answer.add(an);
        }
        answer.add(radio);
        return answer;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    List<Runable> getRunner (){
        List<Runable> run = new ArrayList<>();
        for(Animal an: animals){
            if(an instanceof Runable) run.add((Runable) an); // закащиваем
        }
        return run;

    }
    List<Flyable> getFlier (){
        List<Flyable> fly = new ArrayList<>();
        for(Animal an: animals){
            if(an instanceof Flyable) fly.add((Flyable) an); // закащиваем

        }
        return fly;

    }
    int getChampionsOfRun (){
        int max = 0;
        for(Runable run:getRunner()){
            if(max < run.speadOfRun()) max = run.speadOfRun();
        }
        return max;

    }

}
