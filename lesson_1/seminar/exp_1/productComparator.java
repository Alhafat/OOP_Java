package lesson_1.seminar.exp_1;

import java.util.Comparator;

public class productComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
