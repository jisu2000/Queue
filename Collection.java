import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collection{

    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<5;i++){
            int el=sc.nextInt();

            q.add(el);

        }
        System.out.println(q.size());

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

      
    }
}