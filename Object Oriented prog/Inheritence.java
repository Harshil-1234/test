class Base{
    int x;

    public Base(){
        System.out.println("Base Class Constructor");
    }

    public Base(int s){
        System.out.println("Base Class Constructor with an argument");
    }
    public int getX(){
        return x;
    }    
    public void setX(int x){
        System.out.println("I am in Base Class and am setting x now");
        this.x = x;
    }
    public void print(){
        System.out.println("Hi!! I am a Constructor");
    }
}

class Derived extends Base{
    int y;

    public Derived(){
        // super(3); -> to call parametrized constructor of Base Class
        System.out.println("Derived Class Constructor");
    }
    public Derived(int x,int y){
        super(x);
        System.out.println("Derived Class Constructor with an argument");
    }
    public int getX(){
        return y;
    }    
    public void setX(int y){
        System.out.println("I am in Base Class and am setting y now");
        this.y = y;
    }

    @Override
    public void print(){
        System.out.println("Hi!! I am a Constructor");
    }
}

class SemiD extends Derived{
    public SemiD(){
        System.out.println("2nd Derived Class");
    }
    public SemiD(int x,int y,int z){
        super(x,y);
        System.out.println("Child of Derived Class with argument z");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        // Base b = new Base();
        // b.setX(10);
        // System.out.println(b.getX());

        // Derived d = new Derived();
        // d.setX(99);
        // System.out.println(d.getX());

        // SemiD d = new SemiD();
        // SemiD d = new SemiD(10,20,30);
    }
}
