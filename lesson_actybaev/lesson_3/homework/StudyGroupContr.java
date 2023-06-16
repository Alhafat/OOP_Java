package lesson_actybaev.lesson_3.homework;

import java.util.List;

public class StudyGroupContr {

    private StudyGroupService service;

    public StudyGroupContr() {
        this.service = new StudyGroupService();
    }

    public StudyGroupService getService() {
        return service;
    }

    public Teacher getTeacher() {
        return getService().getTeacher();
    }

    public List<Student> getStudents() {
        return getService().getStudents();
    }

    public StudentGroup addTeacherStudent(Teacher teacher, List<Student> student) {
        return getService().addTeacherStudent(teacher, student);
    }
}
