// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface InterA {
    // public abstract void show();
    // public abstract void config();
    int age = 44; // final and static
    String area = "Mumbai";

    void show();

    void config();
}

interface InterX {
    void run();
}

interface InterY extends InterX {

}

class InterB implements InterA, InterY {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in cofing");
    }

    public void run() {
        System.out.println("running...");
    }
}

public class MoreonInterface {
    public static void main(String[] args) {

        InterA obj;
        obj = new InterB();

        obj.show();
        obj.config();

        InterX obj1 = new InterB();
        obj1.run();

        // A.area="Hyderabad";

        System.out.println(InterA.area);

    }
}
/*
 * #1
 * - We can have a class implementing multiple interfaces.
 * class B implemets A,X
 * {
 * }
 * (here, A and X are two different interfaces)
 * - Implementation of all the methods that are present in those interfaces
 * should be given in a class.
 * - Inheritance is also valid in between interfaces.
 * - Inheritance can be achieved in between interfaces by using the extend
 * keyword.
 * - Whenever you create a reference of an interface and create an object of a
 * class, then you can only call those methods by that reference that are
 * present in that interface of which the refernce is created.
 * - Methods of another interface can be called by using another reference
 * variable for that interface with the object of a class.
 * 
 * #2
 *
 * class - class - extends
 * class - interface - implements
 * interface - interface - extends
 */