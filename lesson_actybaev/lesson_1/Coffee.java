package lesson_actybaev.lesson_1;

public class Coffee extends Product {

    /*
    * кофе
    * */
    private int temp;
    private boolean milk;
    private double value;

    public Coffee(String name, double price, int temp, boolean milk, double value) {
        super(name, price);
        this.temp = temp;
        this.milk = milk;
        this.value = value;
    }

    @Override
    public double getPrice() {
        return super.getPrice()*getValue();
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name=" + getName() +
                ", price=" + getPrice() +
                ", temp=" + getTemp() +
                ", milk=" + isMilk() +
                ", value=" + getValue() +
                '}';
    }
}
