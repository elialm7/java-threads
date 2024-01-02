package producer_consumer_problem;

public class TestingproducerConsumer {


    public static void main(String[] args){

        BlockingQueue queue = new BlockingQueue(20);
        QueueProducer producer = new QueueProducer(queue);
        QueueConsumer consumer = new QueueConsumer(queue);
        Thread th1 = new Thread(producer);
        Thread th2 = new Thread(consumer);
        th1.start();
        th2.start();



    }




}
class QueueProducer implements Runnable{


    private BlockingQueue q;

    public QueueProducer(BlockingQueue q) {
        this.q = q;
    }

    @Override
    public void run() {

        while(true){

            int random = (int)Math.random();
            System.out.println("Producer added: "+random);
            q.add(random);

        }


    }
}
class QueueConsumer implements Runnable{


    private BlockingQueue q;

    public QueueConsumer(BlockingQueue q) {
        this.q = q;
    }

    @Override
    public void run() {

        while(true){


            System.out.println("Consumer consumed: "+q.remove());


        }
    }
}