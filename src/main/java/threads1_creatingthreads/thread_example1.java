package threads1_creatingthreads;

public class thread_example1 {


    public static void main(String[] args) throws InterruptedException {
        PrintNumbers numbersthread = new PrintNumbers(30);
        Thread th = new Thread(numbersthread, "PrintingNumber thread");
        th.run();
        th.join();
        System.out.println("Main thread finished");
    }



}
