package No_OOP.homework.lesson_1.seminar.exp_1;

public class Water extends Product {

    private int valume;

    public Water(String name, int price) {
        super(name, price);
    }

    public Water(String name, int price, int valume) {
        super(name, price);
        this.valume = valume;
    }

    public int getValume() {
        return valume;
    }

    public void setValume(int valume) {
        this.valume = valume;
    }

    @Override
    public String toString() {
        return "Water [name=" + super.getName() + ", price=" + super.getPrice() + ", valume=" + getValume() + "]";
    }

}
