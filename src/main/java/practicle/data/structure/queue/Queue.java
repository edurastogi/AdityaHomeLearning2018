package practicle.data.structure.queue;

public class Queue {
    private int maxSize;//initializes the set number of slots
    private long[] queArray;
    private int front; //index position for the element in the front
    private int rear; // index position for the element at the back of queue
    private int nItems; //number of item in the queue

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queArray = new long[maxSize];
        front = 0;//index position of the first slot of the array
        rear = -1; //there is no item int he array yet to be considered as the last item
        nItems = 0;
    }

    public void insert(long j){
        if(!isFull()){
        rear++;
        queArray[rear] = j;
        nItems++;
        }else{
            System.out.println("Queue is full");
        }
    }

    public long remove(){ // remove item from the front of the queue
        if(!isEmpty()){
        long temp = queArray[front];
        front++;
        if(front == maxSize){
            front = 0;// we can front back to 0th index so that we can utilize array again
        }
        nItems--;
        return temp;
        }else{
            System.out.println("Queue is empty");
            return -1;
        }
    }

    public long peekFront(){
        return queArray[front];
    }

    public boolean isEmpty(){
        return (nItems == 0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for (int i = 0; i < queArray.length ; i++) {
            System.out.print(queArray[i] + " ");
        }
        System.out.println("]");
    }
}
