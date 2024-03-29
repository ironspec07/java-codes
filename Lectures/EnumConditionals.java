enum Status1 {
    Running, Failed, Pending, Success;
}

public class EnumConditionals {
    public static void main(String[] args) {

        Status1 s = Status1.Pending;

        switch (s) {
            case Running:
                System.out.println("All Good");
                break;

            case Failed:
                System.out.println("Try Again");
                break;

            case Pending:
                System.out.println("Please Wait");
                break;

            default:
                System.out.println("Done");
                break;
        }

        if (s == Status1.Running)
            System.out.println("All Good");
        else if (s == Status1.Failed)
            System.out.println("Try Again");
        else if (s == Status1.Pending)
            System.out.println("Please Wait");
        else
            System.out.println("Done");

    }
}
/*
 * - We can compare the status or values of an enum by using the if- else
 * condition.
 * - Switch supports string, integer etc, and it also support enum.
 * - In switch() you need to pass an object reference variable as a parameter.
 * e.g.,
 * enum Status{
 * Running, Failed, Pending, Success;
 * }
 * if(s==Status.Running)
 * System.out.println("All Good");
 * else if(s==Status.Failed)
 * System.out.println("Try Again");
 * else if ( s==Status.Pending)
 * System.out.println("Please Wait");
 * else
 * System.out.println("Done");
 * 
 * 
 * - In switch case, we do not have to pass the object refernce variable again
 * and again. We have to only pass the constant itself.
 * e.g.,
 * Status s=Status.Pending;
 * switch(s)
 * {
 * case Running:
 * System.out.println("All Good");
 * break;
 * 
 * case Failed:
 * System.out.println("Try Again");
 * break;
 * 
 * case Pending:
 * System.out.println("Please Wait");
 * break;
 * 
 * default:
 * System.out.println("Done");
 * break;
 * }
 */
