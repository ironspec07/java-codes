class Human{
    private int age ;
    private String name;

    public Human(){ // Default constructor , never returns anything. 
        // even if you don't call aconstructor it will be called every time you create a object.
        age = 21;
        name = "Adi";
        
    }
    public Human(int age , String name){ // Parameterized constructor.
        this.age = age;
        this.name = name;
    }

    public int getAge(){ //getter

        return age; // we can access private variables using methods.
    }
    public void setAge(int age){
        this.age = age; // setting value for private variable.
    }

    public String getName(){ //setter

        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Human obj = new Human();
        Human obj1 = new Human(17,"Suhu");
        // obj.age = 21;
        // obj.name = "Adi";
        // obj.setAge(21);
        // obj.setName("Adi");
        String name = obj.getName();
        int age = obj.getAge();
        String name1 = obj1.getName();
        int age1 = obj1.getAge();
        System.out.println("Name: "+name +"\n" +"Age: "+age);
        System.out.println("Name: "+name1 +"\n" +"Age: "+age1);
    }
}
