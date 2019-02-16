package homework7;

import java.util.List;
import java.util.Arrays;


public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 10, 8.5),
                new Student("Aleksandr", "Smirnov", 11, 8.3),
                new Student("Olga", "Nosova", 13, 9.0),
                new Student("Valera", "Afanasev", 9, 7.1),
                new Student("Aleksandr", "Smirnov", 14, 6.8),
                new Student("Ivan", "Ivanov", 10, 6.8)
        );
        students.sort(
                new StudentFirstNameComparator( ).thenComparing(new StudentLastNameComparator( ))
                        .thenComparing(new StudentAgeComparator( ).thenComparing(new StudentAverageMarkComparator( ))));

        System.out.println(students);

    }
}


