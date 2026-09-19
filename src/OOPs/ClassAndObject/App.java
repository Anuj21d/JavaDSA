package OOPs.ClassAndObject;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1,"Anuj",22);

        System.out.println(s2.name);

        s2.study();
        s2.sleep();
    }
}
