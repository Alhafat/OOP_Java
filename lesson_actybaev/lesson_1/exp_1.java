package lesson_actybaev.lesson_1;

import java.util.ArrayList;
import java.util.List;

public class exp_1 {
    public static void main(String[] args) {
        Product product = new Product();
        List<Product> p = new ArrayList<>();
        Coffee coffee = new Coffee("cappuccino", 25, 80, true, 0.5);
        Coffee coffee_2 = new Coffee("black", 10, 80, false, 1);
        p.add(coffee);
        p.add(coffee_2);
        System.out.println(p);
    }
}
