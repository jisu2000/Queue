public class DynamicQueue {
   
    private int data[];
    private int front;
    private int rear;
    private int size;

      
     public DynamicQueue(int size){
            data=new int[size];
            front=-1;
            rear =-1;
        }
        public int size(){
            return size;
        }
        public void enque(int element){
            if(size==data.length){
                int temp[]=data;
                data=new int[temp.length*2];
                int index =0;
                for (int i = front; i < temp.length; i++) {
                    data[index++]=temp[i];
                }
                for (int i = 0; i <front-1 ; i++) {
                    data[++index]=temp[i];
                }
                front=0;
                rear= temp.length-1;
            }
            if(front<0){
            front=0;
            }
            rear=(rear+1)% data.length;
            data[rear]=element;
            size++;
        }
        public int deque()throws Exception{
            if(size==0){
                throw new Exception("quee is empty");
            }
           
            front=(front+1)% data.length;
            size--;

            return data[front];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public int front()throws Exception{
            if (size == 0) {
                throw new Exception("quee is empty");
            }
            return data[front];
        }

       
    }

