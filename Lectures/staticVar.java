class Mobile {
    
    String brand;// instance variable 
    static String name; // static variable
    int price;

    public  void show(){
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Name : " + name);
    }
    public static void show1(Mobile obj){
        System.out.println("Brand : " + obj.brand);
        System.out.println("Price : " + obj.price);
        System.out.println("Name : " + name);
        // only static variables can be used in static method 
    }
}

public class staticVar {
    public static void main(String[] args) {
        
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        Mobile.name = "iphone"; // static variables are called using class name 
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        Mobile.name = "galaxy";
        obj2.price = 1000;

// if we change a static variable all the objects using it will change as all objects are accessing the same variable. 

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }
}
