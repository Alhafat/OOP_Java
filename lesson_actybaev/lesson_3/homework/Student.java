package lesson_actybaev.lesson_3.homework;

import java.time.LocalDate;
import java.util.Comparator;

public class Student extends User implements Comparator<Student> {
    private Integer studentId;

    public Student(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Integer studentid) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.studentId = studentid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return getSecondName().compareTo(o1.getSecondName());
    }

    @Override
    public String toString() {
        return "Student{" +
                ", firstName='" + getFirstName() + '\'' +
                ", secondName='" + getSecondName() + '\'' +
                ", patronymic='" + getPatronymic() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", studentId=" + getStudentId() +
                '}';
    }

}