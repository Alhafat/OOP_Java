package lesson_actybaev.lesson_3.homework;

import lesson_actybaev.lesson_3.lesson.StudentComparatorByAge;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherGroup implements Iterable<Teacher>{
    private List<Teacher> teachers;

    public TeacherGroup(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public TeacherGroup() {
        this(new ArrayList<Teacher>());
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(teachers);
    }

    public void addTeacher(Teacher teacher) {teachers.add(teacher);}

    public void sort(){
        Collections.sort(teachers, new TeacherComparator());
    }


}
