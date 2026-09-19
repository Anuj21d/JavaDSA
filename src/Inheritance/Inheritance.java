package Inheritance;

class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
        this.id = 0;
        this.name = "";
    }

    public void display() {
        System.out.printf("%s is Employee", name);
    }
}

class Developer extends Employee {
    private String programmingLan;

    public Developer(int id, String name, String lang) {
        super(id, name);
        this.programmingLan = lang;
    }

    public void show() {
        display();
        System.out.println(", Programming Lan: " + programmingLan);
    }
}

interface TeamLead {
    void leadTeam();
}

interface ProjectManger {
    void mangeProject();
}

class TechLead extends Employee implements ProjectManger, TeamLead {

    private String projectManage;
    private int teamLead;

    public TechLead(int id, String name, String mang,int teamLead) {
        super(id, name);
        this.projectManage = mang;
        this.teamLead = teamLead;
    }
    public void leadTeam() {
        System.out.println("Leading Team");
    }
    public void mangeProject() {
        System.out.println("Manging Project");
    }
    public void displayInfo() {
        display();
        System.out.println(", Project Manage: " + projectManage);
        System.out.println(", Team Lead: " + teamLead);
    }
}
class HRManger extends Employee{
    public HRManger(int id, String name) {
        super(id, name);
    }
    public void handleHrDuties() {
        System.out.println("HR Duties");
    }
}
class HRDirector extends HRManger{
    public HRDirector(int id, String name) {
        super(id, name);
    }
    public void handleHrDirector() {
        System.out.println("HR Director");
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Employee e = new Employee(100, "Anuj");
//
//        e.display();
//        Developer d = new Developer(101,"anuj","javaScript");
//        d.show();

//        TechLead t = new TechLead(102,"anuj","Helloworld",3);
//        t.displayInfo();

        HRDirector hr = new HRDirector(1, "HR");
        hr.handleHrDuties();
        hr.handleHrDirector();

    }
}
