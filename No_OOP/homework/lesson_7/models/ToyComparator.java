package No_OOP.homework.lesson_7.models;

import No_OOP.homework.lesson_7.models.Models;

import java.util.Comparator;

public class ToyComparator implements Comparator<Models> {

    @Override
    public int compare(Models o1, Models o2) {
        int result = o1.compareTo(o2);
        return result;
    }
}
