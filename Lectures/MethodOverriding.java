class Aa {

    public void show() {
        System.out.println("in A show");
    }

    public void config() {
        System.out.println("in Aa config");
    }
}

class Bb extends Aa {
    public void show() {
        System.out.println("in Bb show");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Aa obj1 = new Aa();
        obj1.show(); // in A show

        Bb obj = new Bb();
        obj.show(); // in B show
        obj.config();
    }

}

/*
 * #1 method overriding
 * #2 Necessary condition for method overriding
 * 
 * What is method Overriding?
 * It is way to override the parent class method in child class .
 * 
 * class Parent{
 * int a;
 * public void show{System.out.println("this is parent");}
 * }
 * class Child extends Parents{
 * int a=10; //override a
 * public void show(){System.out.println("this is child method");} //method
 * override by child class
 * }
 * class Main{
 * public static void main(String []args){
 * Child c=new Child();
 * c.show(); //call the child class override method
 * }
 * }
 * -- method overriding is run time polymorphism
 * -- it is use to increase the reusability of code
 * 
 * #2
 * for a method to be overridden, the following conditions must be met:
 * 
 * -- The method in the subclass must have the same signature (name, number and
 * type of parameters) as the method in the superclass.
 * 
 * -- The method in the subclass must have the same return type (or a subtype)
 * as the method in the superclass.
 * 
 * -- The method in the subclass must have the same access level (public,
 * protected, or private) as the method in the superclass.
 * 
 * -- The method in the subclass must not be static, while the method in the
 * superclass must be marked as non-final.
 * 
 * -- The overridden method must be visible from the subclass it means you can
 * change access modifiers but there is condition for
 * -- you need to increase visibility but you cannot reduced it , you can do it
 * using access modifiers.
 * -- you can change access modifiers in this manner
 * private -default -protected -public (in upcoming lecture access modifiers has been discussed)
 * 
 * class A{
 * void show(){ // -- by default access modifier is default
 * System.out.println("A");
 * }
 * int a=5;
 * }
 * 
 * class B extends A{
 * protected void show(){ //-- access modifier is protected --we can increase
 * visibilty
 * System.out.println("B");
 * }
 * 
 * }
 */