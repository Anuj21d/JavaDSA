package OOPs.Encapsulation;

public class Student {
    private int id;
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " Sleeping");
    }

    public void study() {
        System.out.println(name + " Study");
    }
}

