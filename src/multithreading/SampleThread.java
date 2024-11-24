package multithreading;

public class SampleThread extends Thread{

    SampleThread() {
        start(); //starts running the thread
    }
    @Override
    public void run(){
        //thread2
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("value of i:  " + i);
                Thread.sleep(500); //sends the thread to slow down for half a second
            }

        }
        catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
