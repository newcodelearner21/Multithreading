package multithreading;

public class MainThread {


    public static void main(String[] args) {
        //to run this method you need to start() in sampleThread
        SampleThread thread2 = new SampleThread();

       try {
           //thread1
           for(int k = 1; k <= 10; k++){
               System.out.println("Value of k: " + k);
               Thread.sleep(1000); //Slows the thread by 1 second while printing output
           }

       } catch (Exception e) {
           System.out.println("Exception occurred: " + e.getMessage());
       }
    }
}
