package OOPs.ClassAndObject;

public class Student {
    int id;
    String name;
    int age;

    //default constructor
    public Student(){
        System.out.println("Default Student constructor");
    }

    //Para Constructor
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //copy constructor
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
        this.age = s.age;
    }

    public void sleep(){
        System.out.println(name +" Sleeping");
    }
    public void study(){
        System.out.println(name + " Study");
    }


}
