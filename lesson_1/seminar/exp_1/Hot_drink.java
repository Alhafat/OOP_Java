package lesson_1.seminar.exp_1;

public class Hot_drink extends Product {

    private int temp;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Hot_drink(String name, int price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Hot_drink [name=" + super.getName() + ", price=" + super.getPrice() + ", temp=" + temp + "]";
    }

}
