class Node<T>{
    T data;
    Node<T> Next;

    Node(T data){
        this.data=data;
        this.Next=null;
    }

}

public class QueueLL<T> {
    private Node<T> front;
    private Node<T> rear;
    int size;


    public QueueLL(){
        front =null;
        rear=null;
        size=0;

    }

    public int size(){
        return size;
    }

    public boolean isempty(){
        return size==0;
    }

    public void enqueue(T elem)
    {
        Node<T> newNode=new Node<>(elem);
        size++;
        if(rear==null){
            front=newNode;
            rear=newNode;
        }
        else{
            rear.Next=newNode;
            rear=newNode;
           
        }

    }

    public T front() throws QueueEmptyError{
        if(front==null)
        {
            throw new QueueEmptyError();
        }

        return front.data;
    }

    public T dequeue() throws QueueEmptyError{
        if(front==null)
        {
            throw new QueueEmptyError();
        }
        T temp=front.data;
        front=front.Next;
        if(front==null){
            rear=null;
        }
        size--;
        return temp;
    }


    
}
