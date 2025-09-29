package sk.upjs.paz;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Set<Student> testStudents = Set.of(
                new Student(1L,
                        "Ivan",
                        "Mede",
                        Student.Gender.MALE,
                        LocalDate.now()),
                new Student(2L,
                        "Larisa",
                        "Filasova",
                        Student.Gender.FEMALE,
                        LocalDate.now()),
                new Student(3L,
                        "Shrek",
                        "Swamp",
                        Student.Gender.MUTANT,
                        LocalDate.now()),
                new Student(4L,
                        "Fiona",
                        "Shrekova",
                        Student.Gender.FEMALE,
                        LocalDate.now())
        );
        this.studentService = new StudentService(testStudents);
    }

    @org.junit.jupiter.api.Test
    void testGetPomerGenderov() {

        var vysledok = studentService.getPomerGenderov();

        var spravnyVysledok = new PomerGenderov(
                1, 2, 1
        );

        assertEquals(spravnyVysledok, vysledok);

        var spravnyPomerChlapcov = (double) 1 / (double) 4;
        assertEquals(spravnyPomerChlapcov, vysledok.pomerChlapcovKuDievcatam());

        var spravnyPomerDievcat = (double) 2 / (double) 4;
        assertEquals(spravnyPomerDievcat, vysledok.pomerDievcatKuChlapcom());

    }
}