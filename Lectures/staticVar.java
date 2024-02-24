class Mob {
    
    String brand;// instance variable 
    static String name; // static variable
    int price;

    public  void show(){
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Name : " + name);
    }
    public static void show1(Mob obj){
        System.out.println("Brand : " + obj.brand);
        System.out.println("Price : " + obj.price);
        System.out.println("Name : " + name);
        // only static variables can be used in static method 
    }
}

public class staticVar {
    public static void main(String[] args) {
        
        Mob obj1 = new Mob();
        obj1.brand = "Apple";
        Mob.name = "iphone"; // static variables are called using class name 
        obj1.price = 1500;

        Mob obj2 = new Mob();
        obj2.brand = "Samsung";
        Mob.name = "galaxy";
        obj2.price = 1000;

// if we change a static variable all the objects using it will change as all objects are accessing the same variable. 

        obj1.show();
        obj2.show();

        Mob.show1(obj1);
    }
}
