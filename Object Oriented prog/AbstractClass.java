abstract class Parent{
    public Parent(){
        System.out.println("Base Class Constructor");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent{
    int x;

    public void setX(int x){
        this.x = x;
    }
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
    }
}
