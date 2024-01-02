package threads2_Synchronization;

public class Stack {
    
    private int[] array;
    private int stacktop;

    public Stack(int capacity){

        this.array = new int[capacity];
        this.stacktop = -1;
    }


    public synchronized boolean push(int element){

        if(isFull()) return false;
        stacktop++;
        array[stacktop] = element;

        return true;


    }


    public synchronized int pop(){
        if(isEmpty()) return Integer.MIN_VALUE;
        int ele = array[stacktop];
        array[stacktop] = Integer.MIN_VALUE;
        stacktop--;
        return ele;
    }


    public boolean isEmpty(){
        return this.stacktop < 0;
    }

    public boolean isFull(){
        return stacktop >= array.length-1;
    }
    
    
}
