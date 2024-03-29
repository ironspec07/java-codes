public class Advcalc extends Calc {

    public int multi(int a , int b){
        return a*b;
    }

    public int div(int a , int b){
        return a/b;
    }
}
/*
#1
For every class that we create in a code, there will be a class file.
- Inheritance helps to add more features by inheriting the class.
- For inheritance, we only required the class file. There is no need for a java file.
- extends keyword is used in inheritance to inherit properties of a parent class.

#2
- The main aim of inheritance is to implement the concept of reusability, saving our time and resources and also creating better connections between different classes, and achieving method overriding. 

#3
Points related to inheritance in Java:-
- The superclass of every class is an Object class.
In the absence of any other explicit superclass, every class is implicitly a subclass of the Object class.
-   A superclass can have any number of subclasses but a subclass can have only one superclass.
- Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
- A subclass does not inherit the private members of its parent class. 

*/