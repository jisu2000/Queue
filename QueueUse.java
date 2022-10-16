import java.util.Arrays;
import java.util.Scanner;

public class QueueUse {

    public static void main(String[] args) throws QueueFullError, QueueEmptyError {

        System.out.println("Enter the Size of the Queue");

        Scanner sc = new Scanner(System.in);

        int cap = sc.nextInt();

       QueueLL<Integer> Q=new QueueLL<>();
        int arr[] = new int[cap];

        System.out.println("Filling The Queue Very First time");
        System.out.println("-----------------------------------");

        System.out.println("Enter " + cap + " items");

        for (int i = 0; i < cap; i++) {
            int el = sc.nextInt();
            Q.enqueue(el);
            arr[i] = el;
        }

        System.out.println("The Queue You have Filled is");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter Your Choice ");
        System.out.println("Press 1 for Deque all Items ");
        System.out.println("Press 2 for Deque for a Specific time");
    

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("As per your Choice Deleting all items in First in First out Fashion");
                deleteall(Q);
                break;

            case 2:
                System.out.println("Enter the time you want to delete");
                int times = sc.nextInt();
                String a="";
                if(times>1){
                    a="items";
                }
                else{
                    a="item";
                }

                System.out.println("Deleting " + times +" "+a);
                timesdel(Q, times);
                break;
            default:
                System.out.println("Enter Valid opertion");


           
        }

        if(!Q.isempty()){
        System.out.println("There are " + (cap - Q.size()) + " spaces left");
        }

        if ((cap - Q.size()) == 0) {
            System.out.println("There are no Space left ");
            
            
        } else if((cap - Q.size()) != cap) {
            System.out.println("Enter " + (cap - Q.size()) + " Element");

            for (int i = 0; i <(cap - Q.size()); i++) {
                int el = sc.nextInt();
                Q.enqueue(el);

            }

           

        }

        
        if(Q.size()!=0)
        {

        System.out.println("Removing all items from the Queue final time");

        deleteall(Q);

        }


    }

    private static void timesdel(QueueLL Q, int times) throws QueueEmptyError {

        for (int i = 0; i < times; i++) {
            System.out.print("Removed => ");
            Q.dequeue();
        }
    }

    private static void deleteall(QueueLL Q) throws QueueEmptyError {

        while (!Q.isempty()) {
            System.out.print("Removed => ");
            Q.dequeue();
        }
    }
}
