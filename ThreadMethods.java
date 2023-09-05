class Mythr1 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("This is a thread 1");

            // will pause execution for 455 millieconds
            // try {
            //     Thread.sleep(455);
            // } 
            // catch (InterruptedException e) {
            //     e.printStackTrace();
            // }
            
            i++;
        }
    }
}
class Mythr2 extends Thread{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("This is a thread 2");
            i++;
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1();
        Mythr2 t2 = new Mythr2();
        t1.start();
        // try{
        //     // Threading will run both t1 and t2 simultaneously, join ensures that t2 will only start
        //     // once t1 has been finishes
        //     // but t1 can throw some error say t1 has alrady been killed before execution
        //     // so we use join method in try block
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
}
