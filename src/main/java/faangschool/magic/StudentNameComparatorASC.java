package faangschool.magic;

import java.util.Comparator;

public class StudentNameComparatorASC implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
