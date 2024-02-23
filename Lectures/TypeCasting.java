class X 
{
    public void show1() 
    {
        System.out.println("in X show");
    }
}
class Y extends X 
{
    public void show2() 
    {
        System.out.println("in Y show");
    }
}
public class TypeCasting 
{
    public static void main(String[] args) 
    {
        // double d = 4.5;
        // int i = (int)d;
        // System.out.println(i);

        // X obj = new X();
        // obj.show1();
        X obj =(X) new Y(); //upcasting 
        obj.show1();

        //X obj1 = new Y(); // upcasting 
        // obj1.show2(); // you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible.

        //here we downcastig to use show2() method
        ((Y)obj).show2(); //downcasting
    }
}
/*
 * Note:
the object can also be typecasted like the datatypes. Parent and Child objects are two types of objects. 
So, there are two types of typecasting possible for an object, i.e., Parent to Child and Child to Parent or can say Upcasting and Downcasting.
 */
