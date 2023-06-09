package lesson_actybaev.lesson_3.lesson;

import java.util.Iterator;
import java.util.List;

class StudentIterator implements Iterator<Student> {

    private int index;

    private List<Student> students;

    public StudentIterator(List<Student> students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {
        return students.size() > index;
    }

    @Override
    public Student next() {
        return students.get(index++);
    }
}
