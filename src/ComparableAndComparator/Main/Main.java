package ComparableAndComparator.Main;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(10);

        System.out.println(numbers);

//        Collections.sort(numbers);
//        System.out.println(numbers);
        //this is a regular technique and work for predefine data object like int string,
        //what if we have our own object like student and want to sort

        // Here comes in Comparable and Comparator

        Student s1 = new Student("Anuj", 22, 14);
        Student s2 = new Student("Anamika", 19, 21);
        Student s3 = new Student("Shravani", 21, 25);


        ArrayList<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(new Student("Nishi", 21, 45));

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Before sortingq");
//        Collections.sort(students); error
        Collections.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

    }
}
