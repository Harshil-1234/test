class Employee{
    private int id;
    private String name;

    public Employee(){
        this.id = 100;
        this.name = "Your-Name";
    }
    public Employee(int myId,String myName){
        id = myId;
        name = myName;
    }

    public void getDetails(){
        System.out.println("Id "+ id);
        System.out.println("Name " + name);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Employee harshil = new Employee();
        // Employee harshil = new Employee(69,"Harshil");
        harshil.getDetails();
    }
}
