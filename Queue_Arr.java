public class Queue_Arr {
    private int data[];
    private int front;
    private int rear;
    private int size;

    public Queue_Arr(int cap){
        data=new int[cap];
        front=-1;
        rear=-1;
        size=0;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int peek() throws QueueEmptyError{
        if(isEmpty())
        {
            throw new QueueEmptyError();
        }

        return data[front];
    }

    
    public void enqueue(int elem) throws QueueFullError 
    {
        if(size==data.length){
            throw new QueueFullError();
        }
        if(size==0){
            front=0;
        }
        rear=(rear+1)%data.length;

        data[rear]=elem;
        size++;
    }
    public void dequeue() throws QueueEmptyError{
        if(size==0){
            throw new QueueEmptyError();
        }
    
        int temp=data[front];
        
        front=(front+1)%data.length;
        size--;  
        if(size==0){
            front=-1;
            rear=-1;
        }
     System.out.println(temp);
        
    }
}
