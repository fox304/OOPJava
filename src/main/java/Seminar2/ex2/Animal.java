package Seminar2.ex2;

/**
 * нельзя создать экземпляр класса
 * имеет абстрактные поля
 *
 * в Radio прописали интерфейс и здесь его имплементируем
 */
public abstract class Animal implements Speakable{
    private String name;
    private int box;

    public Animal(String name, int box) {
        this.name = name;
        this.box = box;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Животное %s , Name is %s , box num : %s ;",this.getClass().getSimpleName(),this.name,this.box);
    }
    public abstract String say();
}
