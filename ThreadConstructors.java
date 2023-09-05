class Mythr extends Thread{
    public Mythr(String name){
        // Thread class already have a constructor which takes in an string input
        // super mehtod will call that constructor with user provided string input name
        super(name);
    }

    public void run(){
        // System.out.println("Hi I am thread");
        // int i = 34;
        while(true)
            System.out.println("Thank you thread " + this.getName());
    }

}

public class ThreadConstructors {
    public static void main(String[] args) {
        Mythr t1 = new Mythr("Harshil1");
        Mythr t2 = new Mythr("Harshil2");
        Mythr t3 = new Mythr("Harshil3");
        Mythr t4 = new Mythr("Harshil4");
        Mythr t5 = new Mythr("Harshil5 (Most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // t1.start();
        // t2.start();
        // System.out.println("Id of this thread is " + t1.threadId());
        // System.out.println("Name of this thread is " + t1.getName());

        // System.out.println("Id of this thread is " + t2.threadId());
        // System.out.println("Name of this thread is " + t2.getName());
    }
}
