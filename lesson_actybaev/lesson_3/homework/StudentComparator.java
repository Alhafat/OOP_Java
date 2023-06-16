package lesson_actybaev.lesson_3.homework;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
