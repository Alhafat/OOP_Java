package lesson_actybaev.lesson_3.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) throws Exception {
        StudentGroup students = new StudentGroup(List.of(new Student(3, "String firstName",
                        "String secondName",
                        "String patronymic", LocalDate.now()), new Student(2, "String firstName2",
                        "String secondName",
                        "String patronymic", LocalDate.now()),
                new Student(1, "a",
                        "a",
                        "a", LocalDate.now())));
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next().toString());
        }
        System.out.println("////////////////////////////////////");
        List<Student> list = students.getStudents().stream().sorted()
                .collect(Collectors.toList());
        System.out.println(list.toString());

        System.out.println();

        TeacherGroup teams = new TeacherGroup();
        TeacherService service = new TeacherService(teams);;
        service.addTeacher("Екатерина", "Тучкина", "Максимовна", LocalDate.of(1989, 01, 01));
        service.addTeacher("Екатерина", "Кучкина", "Максимовна", LocalDate.of(1989, 01, 01));
        service.addTeacher("Екатерина", "Мучкина", "Максимовна", LocalDate.of(1989, 01, 01));


        for (Teacher teacher : teams) {
            System.out.println(teacher);
        }

        System.out.println();

        teams.sort();

        for (Teacher teacher : teams) {
            System.out.println(teacher);
        }
    }
}
