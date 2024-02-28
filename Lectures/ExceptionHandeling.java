public class ExceptionHandeling {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;

        try {
            j = 18 / i;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);

        System.out.println("Bye");
    }
}
/*
 * -- In java three types of errors that can occur during the execution of a
 * program
 * i) compile time error
 * ii)logical error
 * iii) run time error -- this can be called as Exception
 * i)
 * Compile-time errors:
 * Compile-time errors are errors that occur during the compilation of the Java
 * code.
 * These errors are caused by syntax errors, missing semicolons, or incorrect
 * variable names,
 * among other things. If there are compile-time errors in your Java program, it
 * cannot be compiled into bytecode,
 * and it cannot be executed.
 * 
 * ii)
 * Logical errors:
 * Logical errors are errors that occur when the program runs correctly, but it
 * does not produce the expected output.
 * These errors occur because of a mistake in the program's logic. For example,
 * if a program is supposed to add two numbers
 * but instead multiplies them, it will produce the wrong output. Logical errors
 * are more difficult to detect than compile-time
 * errors because the program runs without any error messages.
 * 
 * Exceptions(Runtime error)
 * Exceptions are errors that occur during the execution of the Java program.
 * Exceptions occur when something unexpected happens, such as trying to read
 * from a file that does not exist or dividing by zero.
 * When an exception occurs, the program will terminate unless the exception is
 * handled by an exception handler.
 * 
 * In Exception we have Checked and Unchecked Exception this topic is discussed
 * in Exception hierarachy:
 * a)
 * Checked Exception:
 * Checked exceptions are exceptions that the Java compiler requires you to
 * handle or declare.
 * These exceptions are checked at compile time, and you must either handle the
 * exception with a try-catch block or declare it with a throws clause.
 * If you do not handle or declare a checked exception, the code will not
 * compile. Checked exceptions are typically related to input/output operations,
 * such as file handling or network communication.
 * 
 * b)
 * Unchecked Exception:
 * unchecked exceptions are exceptions that are not checked at compile time.
 * These exceptions are typically caused by programming errors,
 * such as null pointer exceptions, array index out of bounds exceptions, and
 * class cast exceptions. Unchecked exceptions are not required
 * to be handled or declared, but they can still occur during runtime.
 * 
 * Important:
 * both checked and unchecked exceptions can occur during runtime, but checked
 * exceptions are checked at compile time and require handling
 * or declaring, while unchecked exceptions are not checked at compile time and
 * do not require handling or declaring.
 */

// TRY-CATCH:-

/*
 * 
 * -- Exception handling is a mechanism in Java that allows developers to handle
 * and recover from errors and exceptional conditions that may occur during the
 * execution of a program.
 * -- One way to handle exceptions in Java is by using the try-catch block.
 * 
 * General Syntax of try -catch to handle exception:
 * try {
 * // code that may throw an exception
 * } catch (ExceptionType1 e1) {
 * // code to handle the exception of type ExceptionType1
 * } catch (ExceptionType2 e2) {
 * // code to handle the exception of type ExceptionType2
 * } finally {
 * // optional block of code that is executed regardless of whether an exception
 * was thrown or not
 * }
 * 
 * we will discussing about everything try, catch ,finally and ExceptionType one
 * by one
 * -- in this lecture we are only deal with single catch statement with try
 * 
 * 
 * // try to handle the exception
 * class Main{
 * public static void main(String[] args) {
 * int i=4; //normal statement
 * try{
 * int a = 10/0; //critical statement
 * /*Not handling excpetion then
 * if you not handle the exception then it will be thrown to the JVM
 * and JVM will terminate the program abnormally
 * and it will not execute the remaining statements
 * 
 * 
 * 
 * if you handle the exception then it will not be thrown to the JVM
 * and JVM will not terminate the program abnormally
 * and it will execute the remaining statements
 * 
 * 
 * }catch(Exception e){
 * System.out.println("Some exception occured");
 * }
 * System.out.println("We are coming out of the try catch block successfully");
 * 
 * 
 * }
 * 
 * }
 * -- In the above code, the try block contains the code that may throw an
 * exception.
 * The catch block catches the exception of a specific type and handles it.
 * 
 * 
 * -- statemtns of two types
 * i)normal statements
 * Normal Statements:
 * Normal statements are statements that do not require any special handling,
 * and they are executed in a normal sequence.
 * e.g Variable declarations and assignments: These statements are used to
 * declare and assign values to variables.
 * 
 * ii)critical statements
 * Critical statements are statements that can cause an exception or error, and
 * they require special handling.
 * Handle using :
 * throw statements: These statements are used to throw an exception.
 * try-catch statements: These statements are used to handle exceptions.
 * finally statements: These statements are used to specify a block of code that
 * is always executed, whether an exception is thrown or not.
 * 
 */