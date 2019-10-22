package sekcja15.thread;


import static sekcja15.thread.ThreadColor.ANSI_RED;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println(ANSI_RED + "6,Hello from MyRunnable's implementation of run()");
    }
}
