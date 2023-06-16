package lesson_actybaev.lesson_3.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    private List<Student> students;
    private Teacher teacher;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public StudentGroup() {
        this(new ArrayList<>());
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sort(){
        students.sort(new StudentComparator());
    }
}
