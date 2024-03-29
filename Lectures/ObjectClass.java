//case 1: class which not override object class toString(), hashCode(), equals() method
// class Mobile {
//     String model;
//     int price;
// }

// public class ObjectClass {
//     public static void main(String[] args) {
//         Mobile mb1 = new Mobile();
//         mb1.model = "Apple";
//         mb1.price = 100000;

//         Mobile mb2 = new Mobile();
//         mb2.model = "Apple";
//         mb2.price = 100000;

//         System.out.println(mb1); // Internally mb1.toString() is called and print Mobile@4617c264
//         System.out.println(mb2); // Internally mb2.toString() is called and print Mobile@36baf30c

//         // use of equals() method to compare to object
//         boolean result = mb1.equals(mb2); // right now it give false result because by default implementation of
//         // equals() method compare reference of two objects
//         System.out.println(result); // false

//         // use of hashCode()
//         System.out.println(mb1.hashCode()); // 1175962212
//         System.out.println(mb2.hashCode()); // 918221580 , provide some unique value
//     }
// }

// case 2: class can override object class hashCode(), toString(), equals()
class Mobile {
    String model;
    int price;

    @Override
    public String toString() {
        return "Model: " + model + " and price: " + price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mobile other = (Mobile) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

class ObjectClass {
    public static void main(String[] args) {
        Mobile mb1 = new Mobile();
        mb1.model = "Apple";
        mb1.price = 100000;

        Mobile mb2 = new Mobile();
        mb2.model = "Apple";
        mb2.price = 100000;

        // use of toString() method, overrides method
        System.out.println(mb1); // Internally mb1.toString() is called and print Model: Apple and price: 100000
        System.out.println(mb2); // Internally mb2.toString() is called and print Model: Apple and price: 100000

        // use of equals() method to compare two object, overrides method
        boolean result = mb1.equals(mb2); // right now it give true result because we override equals() method
        System.out.println(result); // true

        // use of hashCode()
        System.out.println(mb1.hashCode()); // 1967873639 due to overrides hashcode method
        System.out.println(mb2.hashCode()); // 1967873639

        System.out.println(mb1 == mb2);
    }
}

/*
 * Member methods of object class
 * 
 * public native int hashCode();
 * public boolean equals( Object);
 * public String toString();
 * 
 * 1)hashCode() method:
 * In Java, the hashCode () method is a method that is defined in the Object
 * class,
 * which is the parent class of all classes in Java. It returns an integer value
 * that
 * represents the unique hash code of an object.
 * 
 * 2)equals(Object) method:
 * equals(Object obj) is the method of Object class. This method is used to
 * compare
 * the given objects. It is suggested to override equals(Object obj) method to
 * get our own equality condition on Objects.
 * 
 * 3)toString() method:
 * We typically generally do use the toString() method to get the string
 * representation of an object. It is very important
 * and readers should be aware that whenever we try to print the object
 * reference then internally toString() method is invoked.
 * If we did not define the toString() method in your class then the Object
 * class toString() method is invoked otherwise our
 * implemented or overridden toString() method will be called.
 * 
 */

/*Note: it is not mandatory to override every member method of object class but it is advice able 
to override toString() and equals() method to compare and print own object.*/
