package lesson_1.seminar.exp_1;

import java.util.List;

public class Metods_machine implements Machine {

    private List<Product> list;

    @Override
    public List<Product> getList() {
        return this.list;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return list.remove(list.indexOf(product));
            }
        }
        return null;
    }

    public Product getProduct(String name, int valume) {
        for (Product product : list) {
            if (product.getName().equals(name) && ((Water) product).getValume() == valume) {
                return list.remove(list.indexOf(product));
            }
        }
        return null;
    }

    public Product getProduct(String name, int price, int temp) {
        for (Product product : list) {
            if (product.getName().equals(name) && product.getPrice() == price
                    && ((Hot_drink) product).getTemp() == temp) {
                return list.remove(list.indexOf(product));
            }
        }
        return null;
    }

    @Override
    public void initProducts(List<Product> list) {
        this.list = list;
    }

    public Metods_machine(List<Product> list) {
        initProducts(list);
    }
}
