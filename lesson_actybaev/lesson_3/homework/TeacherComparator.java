package lesson_actybaev.lesson_3.homework;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
