package lesson_actybaev.lesson_3.lesson;

public class exp_1 {
    public static void main(String[] args) {

        StudyGroup group = new StudyGroup();
        StudyGroupService service = new StudyGroupService(group);
        service.addStudent("Student_1", 18);
        service.addStudent("Student_3", 17);
        service.addStudent("Student_5", 19);
        service.addStudent("Student_4", 16);
        service.addStudent("Student_2", 18);

        for (Student student : group){
            System.out.println(student);
        }

        System.out.println();

        group.sortByName();

        for (Student student : group){
            System.out.println(student);
        }

        System.out.println();
        group.sortByAge();

        for (Student student : group){
            System.out.println(student);
        }

    }
}
