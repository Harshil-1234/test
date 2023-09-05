import java.util.Scanner;

public class TakeInput{
    public static void main(String[] args){
        System.out.println("Taking Input from User");

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");

        // int a = sc.nextInt();
        // System.out.print("Enter a number: ");

        // int b = sc.nextInt();

        // int sum = a+b;

        // System.out.println(sum);

        //reads only first word, donot read anything after space
        // String str = sc.next();
        // System.out.println(str);

        //reads whole line spaces etc...
        String str = sc.nextLine();
        System.out.println(str);

        sc.close();
    }
}