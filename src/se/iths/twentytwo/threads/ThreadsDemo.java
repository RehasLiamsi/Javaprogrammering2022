package se.iths.twentytwo.threads;

public class ThreadsDemo implements Runnable{

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        Thread.ofPlatform().start(new ThreadsDemo());

        while(true){
            System.out.println("Hello");
        }
    }

    @Override
    public void run() {

    }
}
