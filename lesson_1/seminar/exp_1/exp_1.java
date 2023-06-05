package lesson_1.seminar.exp_1;

import java.util.ArrayList;
import java.util.List;

public class exp_1 {

    /*
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
     * содержащий в себе методы
     * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
     * getProduct(String name)
     */
    
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        // Product apple = new Product("apple", 40);
        // list.add(apple);
        // Product apple_1 = new Product("apple", 40);
        // list.add(apple_1);
        Product water = new Water("вода", 40, 10);
        list.add(water);
        Product Hot_drink = new Hot_drink("ice_tea", 20, 5);
        list.add(Hot_drink);
        Product Hot_drink_1 = new Hot_drink("tea", 20, 60);
        list.add(Hot_drink_1);
        Product Hot_drink_2 = new Hot_drink("cofee", 30, 90);
        list.add(Hot_drink_2);
        // Machine temp = new Machine(list);
        // System.out.println(temp.getProduct("apple"));
        System.out.println(list.toString());
    }
}
