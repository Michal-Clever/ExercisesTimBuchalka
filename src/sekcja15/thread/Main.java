package sekcja15.thread;


import static sekcja15.thread.ThreadColor.ANSI_GREEN;
import static sekcja15.thread.ThreadColor.ANSI_PURPLE;
import static sekcja15.thread.ThreadColor.ANSI_RED;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "1.Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_GREEN + "3.Hello from the anonymous class thread");
            }
        }.start();

        System.out.println(ANSI_RED + "4.Hello again from the main thread.");


    }
}
