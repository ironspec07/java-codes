abstract class Car {
    // public void drive()
    // {
    //
    // }

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car {
    // public void fly()
    // {
    // System.out.println("Flying...");
    // }
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdateWagnoR extends WagnoR // concrete class
{
    public void fly() {
        System.out.println("flying...");
    }
}

public class AbstractKey {
    public static void main(String[] args) {

        // Car obj=new Car();
        // Car obj=new WagnoR();
        Car obj = new UpdateWagnoR();
        obj.drive();
        obj.playMusic();
    }
}

/*
 * #1
 * Abstraction is a process of hiding the implementation details and showing
 * only functionality to the user.
 * 
 * #2
 * Abstract method:-
 * - Instead of defining the method, we can declare the method.
 * - If we put a semicolon at the end of a method, it means that you only
 * declare the method like:
 * public void drive();
 * - This method does not contain any features and you will not be able to
 * create an object of it.
 * - You need to add an abstract keyword to only declare a method.
 * 
 * #3
 * Abstract class:-
 * - Abstract methods can only be defined in an abstract class.
 * - We need to add an abstract keyword before a class to make it an abstract
 * class.
 * - Objects of an abstract class can not be created.
 * - If you are extending an abstract class, then it is compulsory to define all
 * abstract methods.
 * - It is not necessary that an abstract class should have an abstract method.
 * - Abstract class can have an abstract or a normal method or both.
 * - An abstract class can have more than one abstract method.
 * 
 * #4
 * Concrete class: A class other than an abstract class is known as a concrete
 * class.
 * - An object of a concrete class can be created.
 */