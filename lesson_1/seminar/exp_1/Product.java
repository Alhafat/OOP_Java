package lesson_1.seminar.exp_1;

public abstract class Product implements Comparable<Product> {

    /*
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
     * содержащий в себе методы
     * initProducts (List <Product>) сохраняющий в себе список исходных продуктов и
     * getProduct(String name)
     */

    private String name;
    private int price;
    
    public Product(String name, int price){
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.price, o.price);
    }

    @Override
    public String toString() {
        return "Product [name=" + getName() + ", price=" + getPrice() + "]";
    }

}
