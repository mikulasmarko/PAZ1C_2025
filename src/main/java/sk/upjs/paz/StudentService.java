package sk.upjs.paz;

import java.util.Set;

public class StudentService {
    private Set<Student> students;


    public StudentService(Set<Student> students){
        this.students = students;
    }

    public PomerGenderov getPomerGenderov() {
        int male = 0;
        int female = 0;
        int mutant = 0;
        for (Student student : students) {
            if (student.gender() == Student.Gender.MALE) {
                male++;
            }
            if (student.gender() == Student.Gender.FEMALE) {
                female++;
            }
            if (student.gender() == Student.Gender.MUTANT) {
                mutant++;
            }

        }

        return new PomerGenderov(male, female,mutant);
    }


}
