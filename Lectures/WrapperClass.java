public class WrapperClass {
    @SuppressWarnings({ "unused", "deprecation" })
    public static void main(String[] args) {

        int num = 7;
        // how to store data as Object
        Integer num1 = new Integer(8); // this syntax is depreciated
        Integer num2 = Integer.valueOf(8); // Now we use this syntax
        Integer num3 = 8; // autoboxing
        int num4 = num1.intValue();// unboxing
        int num5 = num1; // autounboxing

        // --convert string into int type using parseInt
        String str = "12";
        int num6 = Integer.parseInt(str);

        // --Convert number into String
        String str1 = Integer.toString(23); // convert number into string
    }
}

/*
 * if you want to store integer value you store in int
 * java provide primitive data type
 * thats why java is 99.9 % object oriented programming
 * primitive data types helps us to improve the performance
 * but certain feature are work only when we work with objects
 * for collection framework -- we need non primitive type data as input
 * 
 * byte -Byte
 * int - Integer
 * long -Long
 * char- Character
 * double -Double
 * float -Float
 * boolean -Boolean
 * 
 * Boxing:It is manual method to convert primitive type data into non-primitive
 * type .
 * 
 * UnBoxing: It is manual method to convert non-primitive data type to primitive
 * type.
 * 
 * AutoBoxing:It is automatic conversion of primitive type data into
 * non-primitive data type.
 * 
 * AutoUnBoxing:It is automatic conversion of non primitive type data into
 * primitive data type.
 */