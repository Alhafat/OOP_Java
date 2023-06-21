package No_OOP.homework.lesson_1.seminar.exp_1;

import java.util.List;

public interface Machine {

    /*
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
     * содержащий в себе методы
     * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
     * getProduct(String name)
     */

    public List<Product> getList();

    public Product getProduct(String name);

    public void initProducts(List<Product> list);
}
