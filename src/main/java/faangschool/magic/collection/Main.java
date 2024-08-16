package faangschool.magic.collection;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.List.*;

public class Main {

    public static List<Student> initStudents;
    public static Map<CompositeKey, List<Student>> students;

    static {
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

        students = getStudentsGroupingByFacultyAndYear(initStudents);
    }


    public static void main(String[] args) {

        for (Map.Entry<CompositeKey, List<Student>> entry: students.entrySet()) {
            System.out.println();
        }
    }

    public static Map<CompositeKey, List<Student>> getStudentsGroupingByFacultyAndYear(List<Student> students){
        return students
                .stream()
                .collect(Collectors.groupingBy(c-> new CompositeKey(c.getFaculty(), c.getYear())));
    }

    //TODO 16.08.2024 - 8:29: refactor method
    public static boolean addStudent(Student student) {
        ArrayList<Student> emptyStudentsLists = new ArrayList<>();

        if(student != null) {
            CompositeKey key = new CompositeKey(student.getFaculty(), student.getYear());

            if(!students.containsKey(key)) {
                students.put(key, students.getOrDefault(key, emptyStudentsLists));
                return true;
            }
        } else{
            return false;
        }
        return false;
    }

    //TODO 16.08.2024 - 8:29: refactor method
    public static boolean deleteStudent(Student student) {
        CompositeKey maybeStudent = new CompositeKey(student.getFaculty(), student.getYear());
        if(students.containsKey(maybeStudent)) {
            students.remove(maybeStudent);
            return true;
        } else {
            return false;
        }
    }
}
