package No_OOP.homework.lesson_7.view;

import No_OOP.homework.lesson_7.models.Models;
import No_OOP.homework.lesson_7.toyInterface.ToyInterface;


public class View implements ToyInterface {

    @Override
    public Models addToys(int id, String name, int count, int frequency) {
        Models toy;
        toy = new Models(id, name, count, frequency);
        toy.setId(id);
        toy.setName(name);
        toy.setCount(count);
        toy.setFrequency(frequency);
        return toy;
    }

    @Override
    public String toString() {
        return "Игрушка >>> " + Models.class.toString() + "\n";
    }
}