package Seminar1.org.example;


import Seminar1.Beverages.Juice;
import Seminar1.Beverages.Kvass;
import Seminar1.Beverages.Lemonade;
import Seminar1.Beverages.Pinocchio;
import Seminar1.Dairy.Curd;
import Seminar1.Dairy.Milk;
import Seminar1.Sweets.Candies;
import Seminar1.Sweets.Chololate;
import Seminar1.Sweets.Lollipops;

import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
        Products candies1 = new Candies(59,100,"Конфеты 1",50,"bar");
        Products candies2 = new Candies(68,30,"Конфеты 2",50,"bar");
        Products chocolate1 = new Chololate(130,1,"Шоколад 1",60,"medium");
        Products chocolate2 = new Chololate(150,1,"Шоколад 2",70,"thick");
        Products lollipops1 = new Lollipops(50,10,"Леденец 1",30,"on a stick");
        Products lollipops2 = new Lollipops(55,15,"Леденец 2",35,"without stick");

        Products curd1= new Curd(160,1,"Творог 1",9,"pellet");
        Products curd2= new Curd(170,1,"Творог 2",5,"briquette");
        Products milk1 = new Milk(80,1,"Молоко 1",2.0,"pyramid","tetropackage");
        Products milk2 = new Milk(70,1,"Молоко 2",1.5,"pyramid","bottle");

        Products juice1 = new Juice(184,3,"Сок 1","red",4,50);
        Products juice2 = new Juice(74,2,"Сок 2","orange",3,80);
        Products kvass1  = new Kvass(40,1,"Квас 1","yellow",0,1.5);
        Products kvass2  = new Kvass(50,1,"Квас 2","yellow",0,1.8);
        Products lemonade1 = new Lemonade(36,2,"Лимонад 1","yellow",40,"bottle");
        Products lemonade2 = new Lemonade(46,1,"Лимонад 2","light red",50,"bottle");
        Products pinocchio1 = new Pinocchio(47,2,"Буратино 1","light green",32,0.5);
        Products pinocchio2 = new Pinocchio(87,3,"Буратино 2","green",36,0.5);


        List<Products> productsList = new ArrayList<>(List.of(candies1, candies2, chocolate1, chocolate2,
                lollipops1, lollipops2, curd1, curd2, milk2, juice1, juice2, kvass1, kvass2,
                lemonade1, lemonade2, pinocchio1));


        VendingMachine vendingMachine = new VendingMachine(productsList);

        /**
         * осуществил  возможность добавлять продукты в торговый аппарат
         */
        vendingMachine.addProducts(pinocchio2);
        vendingMachine.addProducts(milk1);

        for (Products products:vendingMachine.getProductsList()){
            System.out.println(products);
        }

    }
}