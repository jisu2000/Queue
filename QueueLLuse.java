public class QueueLLuse {

    public static void main(String[] args) throws QueueEmptyError {
        QueueLL<Integer> q=new QueueLL<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.size);

        while(!q.isempty())
        {
            System.out.println(q.dequeue());
        }
        System.out.println(q.size());
    }
    
}
