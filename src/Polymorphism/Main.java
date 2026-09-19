package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Tea t = new Tea();
        teaPrint(t);

        MasalaTea m = new MasalaTea();
        teaPrint(m);

        GingerTea g = new GingerTea();
        teaPrint(g);

        ElichiTea e = new ElichiTea();
        teaPrint(e);
    }

    public static void teaPrint(Tea t) {
        t.typeofTea();
    }
}

