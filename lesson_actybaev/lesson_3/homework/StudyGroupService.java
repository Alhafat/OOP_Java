package lesson_actybaev.lesson_3.homework;

import java.util.List;;

public class StudyGroupService {

    private StudentGroup group;

    public StudentGroup getGroup() {
        return group;
    }

    public void setGroup(StudentGroup group) {
        this.group = group;
    }

    public Teacher getTeacher() {
        return getGroup().getTeacher();
    }

    public List<Student> getStudents() {
        return getGroup().getStudents();
    }

    public StudyGroupService() {
    }

    public StudyGroupService(StudentGroup group) {
        this.group = group;
    }

    public StudentGroup addTeacherStudent(Teacher teacher, List<Student> student) {
        setGroup(new StudentGroup(teacher, student));
        return getGroup();
    }
}
