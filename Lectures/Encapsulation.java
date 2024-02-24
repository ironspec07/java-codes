// every time you create a instance variable make it private. 
// private variables are only accessable inside same class.

// people should be able to acess the private variables but not directly.
class HumanB{
    private int age ;
    private String name;

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

public class Encapsulation {
    public static void main(String[] args) {
        
        Human obj = new Human();
        // obj.age = 21;
        // obj.name = "Adi";
        obj.setAge(21);
        obj.setName("Adi");
        String name = obj.getName();
        int age = obj.getAge();
        System.out.println("Name: "+name +"\n" +"Age: "+age);
    }
}
