// METHOD 1 : BY EXTENDING THREAD CLASS
class Mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My thread is for Cooking");
            System.out.println("I am happy");
            i++;
        }
    }
}
class Mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("Thread 2 is for chatting with her");
            System.out.println("I am sad");
            i++;
        }
    }
}

// Method 2: BY IMPLEMENTING RUNNABLE INTERFACE
class MythreadRunnable1 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++)
            System.out.println("I am a thread 1 SIUUUUU");
    }
}
class MythreadRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<1000;i++)
            System.out.println("I am a thread 2 SIUUUUU");
    }
}

public class Dhaage {
    public static void main(String[] args) {
        // Mythread1 t1 = new Mythread1();
        // Mythread2 t2 = new Mythread2();
        // t1.start();
        // t2.start();

        // THIS IS HOW IMPLEMENTED RUNNABLE CLASS IS USED
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread gun1 = new Thread(bullet1);

        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
