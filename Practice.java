import java.util.Scanner;

public class Practice {
    public static void main(String[] args){
        //Question 1
        System.out.println("Enter Subject Marks out of 100");

        int sub1,sub2,sub3;

       Scanner sc = new Scanner(System.in);

       System.out.print("Subject 1: ");
       sub1 = sc.nextInt();
       System.out.print("Subject 2: ");
       sub2 = sc.nextInt();
       System.out.print("Subject 3: ");
       sub3 = sc.nextInt();

       int total = sub1+sub2+sub3;

       System.out.println("Percentage: "+(total/300.0f)*100);

       sc.close();
    }
}
