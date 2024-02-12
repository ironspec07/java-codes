// every time you create a instance variable make it private. 
// private variables are only accessable inside same class.

// people should be able to acess the private variables but not directly.
class Human{
    private int age ;
    private String name;

    public int getAge(){ //getter

        return age; // we can access private variables using methods.
    }
    public void setAge(int n){
        age = n; // setting value for private variable.
    }

    public String getName(){ //setter

        return name;
    }
    public void setName(String str){
        name = str;
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
