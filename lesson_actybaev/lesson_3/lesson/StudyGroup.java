package lesson_actybaev.lesson_3.lesson;

import java.util.*;

public class StudyGroup implements Iterable<Student>{
    private int numGroup;
    private List<Student> students;

    public StudyGroup(){
        students=new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getNumGroup() {
        return numGroup;
    }

    public void setNumGroup(int numGroup) {
        this.numGroup = numGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(students);  //return students.iterator()
    }

    public void sortByName(){
        Collections.sort(students);
    }

    public void sortByAge(){
        Collections.sort(students, new StudentComparatorByAge());
    }


}
