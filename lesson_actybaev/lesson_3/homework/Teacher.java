package lesson_actybaev.lesson_3.homework;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparator<Teacher> {
    private Integer teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer teacherId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId =teacherId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return getSecondName().compareTo(o1.getSecondName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName= " + getFirstName() +
                " secondName= " + getSecondName() +
                " patronymic= " + getPatronymic() +
                " dateOfBirth= " + getDateOfBirth() +
                " teacherId= " + getTeacherId() +
                '}';
    }
}