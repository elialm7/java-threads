package threads2_Synchronization;

public class TestingSynch {

    public static void main(String[] args){
        Stack st = new Stack(5);
        new Thread(()->{
            int counter = 0;
            while(++counter < 10){
                System.out.println("Pushed: "+ st.push(100));
            }

        }, "pusher").start();
        new Thread(()->{
            int counter = 0;
            while(++counter < 10){
                System.out.println(
                        "Popped: "+st.pop()
                );
            }
        }, "Popper").start();
        System.out.println("Main is exiting");

    }


}
