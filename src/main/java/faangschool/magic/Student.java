package faangschool.magic;


import java.util.Arrays;
import java.util.Comparator;

public class Student
        implements Comparable<Student> {
    private String name;
    private int age;
    private String faculty;
    private String[] abilities;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
//                ", faculty='" + faculty + '\'' +
//                ", abilities=" + Arrays.toString(abilities) +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setAbilities(String[] abilities) {
        this.abilities = abilities;
    }

    public String[] getAbilities() {
        return abilities;
    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
