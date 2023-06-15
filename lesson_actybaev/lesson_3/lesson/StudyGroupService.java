package lesson_actybaev.lesson_3.lesson;

public class StudyGroupService {

    private static StudyGroup group;
    private static int id;

    public StudyGroupService(StudyGroup group) {
        this.group = group;
    }

    public void addStudent(String name, int age) {
        group.addStudent(new Student(++id, name, age));
    }
}
