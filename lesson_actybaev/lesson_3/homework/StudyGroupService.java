package lesson_actybaev.lesson_3.homework;

import lesson_actybaev.lesson_3.lesson.StudyGroup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {


    private StudentGroup studentsGroup;
    private List<StudyGroup> studyGroups = new ArrayList<StudyGroup>();
    private Teacher teacher;

    public StudyGroupService(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }
}
