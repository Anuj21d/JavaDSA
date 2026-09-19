package ComparableAndComparator.Main;

public class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNo;


    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.rollNo = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNo() {
        return rollNo;
    }

    @Override
    public String toString() {
        return "Student | " + "name='" + name + '\'' + ", age=" + age + ", rollNo=" + rollNo;
    }


    @Override
    public int compareTo(Student o) {
        return o.rollNo - this.rollNo;
    }
}
