class Employee{
    private int id;
    private String name;

    // public void printDetails(){
    //     System.out.println("Id of the Employee is: " + id);
    //     System.out.println("Name of the Employee is: "+name);
    // }

    public void setName(String n){
        name = n;
    }
    public void setId(int n){
        id = n;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

}

public class Ops {
    public static void main(String[] args) {
        // System.out.println("This is a Custom Class");

        Employee harshil = new Employee(); // Instantiaiting a new Employee Object
        harshil.setName("Harshil Bansal");
        System.out.println(harshil.getName());

        // Setting Attirbutes -> throws error due to private access modifier
        // harshil.id = 100;
        // harshil.name = "Harshil";

        // Printing Values manually
        // System.out.println("Id is: " + harshil.id);
        // System.out.println("Name is: "+harshil.name);

        //Printing via a member function
        // harshil.printDetails();
    }
}
