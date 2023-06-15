package lesson_actybaev.lesson_3.homework;


import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {
    private int index;

    private List<Teacher> teachers;

    public TeacherIterator(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public boolean hasNext() {
        return teachers.size() > index;
    }

    @Override
    public Teacher next() {
        return teachers.get(index++);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
}
