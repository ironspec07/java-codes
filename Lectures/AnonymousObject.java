class A{
    public A(){
        System.out.println("object created");
    }
    public void show(){
        System.out.println("in A show");
    }
}


public class AnonymousObject {
    public static void main(String[] args) {

        // int marks;
        // marks = 99;
        
        A obj; // reference creation.
        obj = new A(); // creatiing object and assigning value.
        obj.show();

        new A(); //Anonymous object.
    }
}

/*
#1
In JVM, we have both stack memory and heap memory.
- Object is created in the heap memory that contains  variable and methods, it also have some address.
- A obj=new A();
    obj.show();
here, A is the classname.obj refers to the address say 101
show() is a method that is called using reference variable obj.
- Every time you call an object, it will call the constructor as well.
- Object creation can be done in two ways:
    1. Declare an object  - creating a reference
    2. Creating an object  - and assigning the value to it
e,g.,  A obj;
    obj=new A();
 *new A() shows that you are creating an object.
- Reference of an object is created in the stack.

 */

/*
#2
Anonymous Objects:- 
Anonymous objects are simply created by using the new keyword.
- It does not have any reference for an anonymous object.
e.g., new A();
- A method can directly be called using this object.
    new A().show();
- We can't use the same anonymous object again. It will be use only for one time.
 */

