interface inter {
    // public abstract void show();
    // public abstract void config();
    int age = 44; // final and static
    String area = "Mumbai";

    void show();

    void config();
}

class subInter implements inter {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in cofing");
    }
}

public class WisInterface {
    public static void main(String[] args) {

        inter obj;
        obj = new subInter();

        obj.show();
        obj.config();

        // A.area="Hyderabad";

        System.out.println(inter.area);

    }
}
/*
 * #1
 * Interface:-
 * In an abstract class, we can have both abstract methods as well as normal or
 * concrete methods.
 * - If your class has only abstract methods then instead of using class, you
 * can simply use an interface in place of it.
 * - Interface is not any class.
 * - Every method in an interface is public and abstract by default.
 * - Even if you do not use two keywords (public and abstract) with methods then
 * also it will not give an error in an interface. By default, it will consider
 * all methods as public and abstract.
 * - We cannot instantiate an interface.
 * - Interface only shows the design and it does not provide any implementation.
 * - To provide an implementation of methods, you need to create a class and
 * instantiate it also.
 * e.g,
 * interface A
 * {
 * methods()----
 * }
 * 
 * #2
 * implements keyword:-
 * To implement an interface, we use the keyword - implements.
 * - If you use the implements keyword with class, then it is compulsory to give
 * an implementation of all the methods that are defined in an interface.
 * - If you do not give an implementation of all methods then it will make your
 * class an abstract class by default.
 * - So, to make a concrete class, you have to give the implementation of all
 * methods present in an interface.
 * e.g.,
 * class B implements A
 * {
 * methods() {
 * statement;
 * }
 * ------
 * }
 * 
 * #3
 * Variables in an interface:-
 * - We can call the methods of an interface by creating an object of the class
 * that implements an interface.
 * - We can also declare variables in an interface.
 * - All the variables in an interface are final and static by default.
 * - So, we first have to initialize the variables in an interface.
 * - As a variable is static in an interface, then you do not need to create an
 * object for it. You can directly call the variable by using the interface
 * name.
 * e.g., A.area; (here, area is a variable initialized in an interface)
 * - As the variable is final, you can not change the value of that variable
 * after initializing it once.
 * 
 * -Interface does not have its own memory in the heap.
 */


//TYPE OF INTERFACE:- 
/*
 * #1
types  of interface
1) Normal interface
2)functional interface /SAM 
3)Marker  interface

#2
i)Normal interface 
Normal interface contains two or more abstract method.
It can have any number of static and default methods and also even public methods of Object classes.
you can declare variable which are public static final by deault

ii)Functional Interface:
Functional Interface is an interface that has only pure one abstract method.
It can have any number of static and default methods and also even public methods of Object classes
e.g Runnable interface : It contains only  run()  method 

iii)
Marker Interface:
An interface that does not contain any methods, fields, Abstract Methods, and any Constants is Called a Marker interface.
Also, if an interface is empty, then it is known as Marker Interface.
The Serializable and the Cloneable interfaces are examples of Marker interfaces.

 */