package threads1_creatingthreads;

public class PrintNumbers implements Runnable{
    private int limit;

    public PrintNumbers(int limit){

        this.limit = limit;

    }

    @Override
    public void run() {
        int counter = 0;
        while(counter < limit){
            System.out.println(counter);
            counter++;
        }
    }
}
