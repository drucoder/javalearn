package faangschool.magic.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.*;


public class MainTest {

    public static List<Student> initStudents;
    public static Map<CompositeKey, List<Student>> students;

    private static Student BORIS_STUDENT = Student.builder().name("Boris").faculty("Math").year(2006).build();


    @BeforeAll
    public static void data() {

        initStudents = of(
                Student.builder().name("Boris").faculty("Math").year(2006).build(),
                Student.builder().name("Vasily").faculty("Physic").year(2011).build(),
                Student.builder().name("Nick").faculty("Chemistry").year(2015).build(),
                Student.builder().name("Ahmed").faculty("Math").year(2003).build(),
                Student.builder().name("Marina").faculty("Economic").year(2013).build(),
                Student.builder().name("Olga").faculty("Biology").year(2005).build(),
                Student.builder().name("Maria").faculty("Chemistry").year(2015).build(),
                Student.builder().name("Georgy").faculty("Physic").year(2004).build(),
                Student.builder().name("Stepan").faculty("Literature").year(2008).build(),
                Student.builder().name("Anna").faculty("Literature").year(2004).build(),
                Student.builder().name("Semen").faculty("Physic").year(2011).build()
        );

        students = initStudents
                .stream()
                .collect(Collectors.groupingBy(c-> new CompositeKey(c.getFaculty(), c.getYear())));

        for (Map.Entry<CompositeKey, List<Student>> entry: students.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }

        System.out.println("@BeforeAll finished================");
    }




    @Test
    public void testAddStudent() {
        assertFalse(Main.addStudent(BORIS_STUDENT));
    }


    @Test
    public void testDeleteStudent() {
        assertTrue(Main.deleteStudent(BORIS_STUDENT));
    }

    public void testGetStudentsGroupingByFacultyAndYear() {
    }
}