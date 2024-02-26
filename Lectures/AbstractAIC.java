abstract class AbsAno {
    public abstract void show();

    public abstract void config();

}

// class B extends A
// {
// public void show()
// {
// System.out.println("in B show");
// }
// }

public class AbstractAIC {
    public static void main(String[] args) {

        // A obj=new B();

        AbsAno obj = new AbsAno()
            {
            public void show() {
                System.out.println("in new show");
            }
            public void config() {
                throw new UnsupportedOperationException("Unimplemented method 'config'");
            }
        };
        obj.show();

    }
}