package Abstraction;

import java.lang.classfile.Interfaces;

public class Abstraction {
    abstract class Bird {
        abstract void fly();

        abstract void eat();
    }

    class Sparrow extends Bird {

        @Override
        public void fly() {
            System.out.println("Sparrow flying");
        }

        @Override
        public void eat() {
            System.out.println("Sparrow eating");
        }
    }

    class Crow extends Bird {

        @Override
        public void fly() {
            System.out.println("Crow flying");
        }

        @Override
        public void eat() {
            System.out.println("Crow eating");
        }
    }
    public static void BirdInfo(Bird b){
        b.fly();
        b.eat();
    }

    interface Hello{
        void  sayHello();
    }

    class Anuj implements Hello{
        @Override
        public void sayHello() {
            System.out.println("Anuj Says Hello");
        }
    }
    public void main(String[] args) {
//        Bird b = new Sparrow();
//        b.fly();
//        b.eat();
        BirdInfo(new Sparrow());
        BirdInfo(new Crow());

        Hello a = new Anuj();
        a.sayHello();
    }
}
