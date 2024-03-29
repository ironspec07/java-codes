public class Inheritance {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        Advcalc obj = new Advcalc();
        System.out.println(obj.add(a, b));
        System.out.println(obj.sub(a, b));
        System.out.println(obj.multi(a, b));
        System.out.println(obj.div(a, b));

    }
}
/*

#1
Use of 'is' in Java:-
- Laptop is a computer.
It means that a laptop contains all features that a computer exhibits.
- Through IS, we try to take the features of something.

#2 
Inheritance:-
One class can inherit the properties and features of another class.
- Inheritance is a type of feature in Java through which we can copy properties to a class from an upper class.
-  A class that inherits from another class can reuse the methods and fields of that class. 
- Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

#3
- In inheritance, there are two types of classes:-
1. Parent class/ Superclass/ Base class
2. Child class/ Subclass/ Derived class

Parent class: The class whose properties are inherited.
Child class: The class which inherits the properties of others.
- Child class accesses the features of a parent class.

#4
Need of an Inheritance:-
- Inheritance supports reusability. We can derive a new class from an existing class by including some features from the existing class.

 */