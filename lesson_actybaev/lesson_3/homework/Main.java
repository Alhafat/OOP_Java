package lesson_actybaev.lesson_3.homework;

import java.util.List;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // StudentGroup students = new StudentGroup();
        // StudyService studyGroupService = new StudyService(students);

        // studyGroupService.addStudent("Петр", "Петров", "Петрович", LocalDate.of(1989,
        // 01, 01));
        // studyGroupService.addStudent("Иван", "Иванов", "Петрович", LocalDate.of(1989,
        // 01, 01));
        // studyGroupService.addStudent("Семен", "Семенов", "Петрович",
        // LocalDate.of(1989, 01, 01));
        // studyGroupService.addStudent("Николай", "Николаве", "Петрович",
        // LocalDate.of(1989, 01, 01));
        // studyGroupService.addStudent("Константин", "Константинов", "Петрович",
        // LocalDate.of(1989, 01, 01));

        List<Student> list = Arrays.asList(new Student("Петр", "Петров", "Петрович", LocalDate.of(1989, 01, 01), 1),
                new Student("Иван", "Иванов", "Петрович", LocalDate.of(1989, 01, 01), 2),
                new Student("Иван", "Иванов", "Петрович", LocalDate.of(1989, 01, 01), 3),
                new Student("Иван", "Иванов", "Петрович", LocalDate.of(1989, 01, 01), 4),
                new Student("Иван", "Иванов", "Петрович", LocalDate.of(1989, 01, 01), 5));

        Teacher teacher = new Teacher("Екатерина", "Мучкина", "Максимовна", LocalDate.of(1989, 01, 01), 1);

        StudyGroupContr controller = new StudyGroupContr();

        System.out.println();

        System.out.println(controller.addTeacherStudent(teacher, list));

        System.out.println();

        for (Student student : list) {
            System.out.printf("Студент %s имеет id %d\n", student.getSecondName(), student.getStudentId());
        }

        System.out.println();

        System.out.printf("Учитель %s имеет id %d\n", teacher.getSecondName(), teacher.getTeacherId());

        // for (Student student : students) {
        // System.out.println(student);
        // }

        // System.out.println();

        // students.sort();

        // for (Student student : students) {
        // System.out.println(student);
        // }

        // System.out.println();

        // TeacherGroup teams = new TeacherGroup();
        // TeacherService service = new TeacherService(teams);

        // service.addTeacher("Екатерина", "Тучкина", "Максимовна", LocalDate.of(1989,
        // 01, 01));
        // service.addTeacher("Екатерина", "Кучкина", "Максимовна", LocalDate.of(1989,
        // 01, 01));
        // service.addTeacher("Екатерина", "Мучкина", "Максимовна", LocalDate.of(1989,
        // 01, 01));

        // for (Teacher teacher : teams) {
        // System.out.println(teacher);
        // }

        // System.out.println();

        // teams.sort();

        // for (Teacher teacher : teams) {
        // System.out.println(teacher);
        // }
    }
}
