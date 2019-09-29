package sekcja15.thread;


import static sekcja15.thread.ThreadColor.ANSI_GREEN;
import static sekcja15.thread.ThreadColor.ANSI_PURPLE;
import static sekcja15.thread.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE+"1.Hello from the main thread.");

        final Thread anotherThread = new AnotherThread();
        anotherThread.setName("2.== Another Thread ==");
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "3.Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ANSI_RED + "4.Hello from the anonymous class's implementation of run()");
                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "4.AnotherThread terminated, or timed out, so I'm running again");
                } catch(InterruptedException e) {
                    System.out.println(ANSI_RED + "4.I couldn't wait after all. I was interrupted");
                }
            }
        });

        myRunnableThread.start();

        System.out.println(ANSI_PURPLE+"5.Hello again from the main thread.");


    }
}
