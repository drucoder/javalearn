package faangschool.magic;

import fromsber.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();

        student2.setAge(15);
        student2.setName("Alpha");
        student.setAge(18);
        student.setName("Mozol");
        student4.setAge(16);
        student4.setName("Bruce");
        student3.setAge(56);
        student3.setName("Zoo");

        Student[] students = new Student[]{student, student2, student3, student4};

        System.out.println("Unsorted array " + Arrays.toString(students));

        Arrays.sort(students);

        System.out.println("Sorted array " + Arrays.toString(students));

        Arrays.stream(students).sorted(new StudentNameComparatorASC()).forEach(System.out::println);
        System.out.println();

        Arrays.stream(students).sorted(new StudentNameComparatorDESC()).forEach(System.out::println);


    }
}
