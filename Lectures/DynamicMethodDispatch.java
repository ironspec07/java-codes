// class Computer
// {

// }
// class Laptop extends Computer
// {

// }

class AA
{
    public void show()
    {
        System.out.println("in A show");
    }
}
class B extends AA
{
    public void show()
    {
        System.out.println("in B show");
    }
}
class C extends AA
{
    public void show()
    {
        System.out.println("in show C");
    }
}

public class DynamicMethodDispatch 
{
    public static void main(String[] args) 
    {
        AA obj =new AA();  
        obj.show();  //Output: in show A

        obj =new B(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
        obj.show();  //Output: in show B

        obj =new B();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
        obj.show();  //Output: in show C

        // Computer obj1 = new Laptop();

    }    
}
/*
 * Note: during compile time we donot which show() method is called from which class.
    -- we can know during run time which show method is called this is known as run time polymorphism.
    -- all this concept is class dynamic method dispatch
 */
