/*
    THROWS -> written after name of function and parenthesis, it tells that the following funciton
              can throw an error
    THROW -> tells what error has occured and throws it
 */

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return ("Radius cannot be negative");
    }

    // public String getMessgae(){
    //     return ("Radius cannot be negative");
    // }
}

public class Throw_Throws {
    public static float area(int r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        return (float)Math.PI * r * r;
    }
    public static int divide(int a,int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {

        try{
            // int c = divide(6,0);
            // System.out.println(c);

            double ar = area(-100);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception Occured");
            System.out.println(e);
        }
    }
}
