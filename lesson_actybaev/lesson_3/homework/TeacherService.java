package lesson_actybaev.lesson_3.homework;


import java.time.LocalDate;

public class TeacherService {
    private TeacherGroup group;
    private static int id;

    public TeacherService(TeacherGroup group) {
        this.group = group;
    }

    public void addTeacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        group.addTeacher(new Teacher(firstName, secondName, patronymic, dateOfBirth,++id));
    }
}
