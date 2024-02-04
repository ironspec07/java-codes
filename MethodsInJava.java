class Computer 
{
    public void playmusic()
    {
        System.out.println("Playing Music");
    }
    public String getMeAPen(int cost)
    {
        System.out.println(cost);
        return "Pen";
    }
}

public class MethodsInJava 
{
    public static void main(String[] args) 
    {
        Computer com = new Computer();
        com.playmusic();
        com.getMeAPen(10);
    }
}
