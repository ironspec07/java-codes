class Calcu
{
    public int add(int a, int b, int c)
    {
        return(a+b+c);
    }
    public int add(int a, int b)
    {
        return (a+b);
    }
}
public class MethodOverloading 
{    
    public static void main(String[] args) 
    {
        Calcu cal = new Calcu();
        System.out.println(cal.add(4, 3));
        System.out.println(cal.add(4, 1, 2));
    }
}