class Person1 {
    int age;

    public void show() {
        System.out.println("in show");
    }

    // class Person2
    // {
    // public void config()
    // {
    // System.out.println("in config");
    // }
    // }

    static class Person2 {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Person1 obj = new Person1();
        obj.show();

        // Person1.Person2 obj1=obj.new Person2();
        // obj1.config();

        Person1.Person2 obj1 = new Person1.Person2();
        obj1.config();
    }
}

/*
 * #1
 * Inner Class:-
 * - We can also create a class inside another class.
 * class Person1
 * {
 * class Person2
 * {
 * }
 * }
 * - You can call the method of class Person2 by using the dot operator in between
 * both classes Person1 and Person2.
 * Person1.Person2 obj= new Person2();
 * - A dollar sign will be introduced in a class name that has an inner class
 * indicating two different classes.
 * A$B. class
 * - You also need to create an object of the outer class, to call the methods
 * of an inner class.
 * 
 * #2
 * Static Inner Class:-
 * - An inner class can also be declared as static.
 * - When an inner class is declared as static, then you do not need to create
 * an object for it.
 * - But an outer class can not be made static.
 * 
 * #3
 * Advantage of inner class:-
 * - Nested classes represent a particular type of relationship that is it can
 * access all the members of the outer class, including private.
 * - Nested classes make the code more readable and maintainable.
 * - It makes the code more optimize.
 */