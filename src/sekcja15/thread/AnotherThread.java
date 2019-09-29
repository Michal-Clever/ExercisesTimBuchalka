package sekcja15.thread;


import static sekcja15.thread.ThreadColor.ANSI_BLUE;

/**
 * Created by timbuchalka on 25/05/2016.
 */
public class AnotherThread extends Thread {

    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "2.Hello from another thread.");
    }
}
