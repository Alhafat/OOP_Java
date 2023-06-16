package lesson_actybaev.lesson_3.homework;

import java.util.List;

public class StudentGroup implements Iterable<Student> {
    private List<Student> students;
    private Teacher teacher;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public StudentGroup(Teacher teacher, List<Student> student) {
        this.students = student;
        this.teacher = teacher;
    }

    @Override
    public StudentGroupIterator iterator() {
        return new StudentGroupIterator(this);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sort() {
        students.sort(new StudentComparator());
    }

    public void addTeacherStudent(Teacher teacher, StudentGroup students) {
        students.addTeacherStudent(teacher, students);
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "StudentGroup [students=" + students + ", teacher=" + teacher + "]";
    }

}
