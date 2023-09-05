public class Intro {
    public static void main(String[] args) {
        try{
            int a = 3/0;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
