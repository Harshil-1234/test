import java.util.Scanner;


class MyExp extends Exception{
    @Override
    public String toString(){
        return "I am toString()";
    }

    @Override
    public String getMessage(){
        return "I am getMessage()";
    }

}

public class ExcpClass {
    public static void main(String[] args){
        int a=10;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<9){
            try{
                // throw new MyExp();
                throw new ArithmeticException("This is an Arithematic Exception");
            }
            catch(Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);
                e.printStackTrace();
            }
        }
        // sc.close();
    }
}
