interface Bicycle{
    void applyBrake(int decrement);
    void speedUP(int increment);
}

class AvonCycle implements Bicycle{
    int speed = 7;

    public void blowHorn(){
        System.out.println("Pee Pee Po Po");
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUP(int increment){
        speed += increment;
    }
}

public class InterfaceOOPS {
    public static void main(String[] args) {
        
    }  
}
