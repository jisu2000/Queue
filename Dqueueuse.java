public class Dqueueuse {
    public static void main(String[] args) throws Exception {
        DynamicQueue Q = new DynamicQueue(5);

        Q.enque(10);
        Q.enque(20);
        Q.enque(30);
        Q.enque(40);
        Q.enque(50);
        Q.enque(60);
        Q.enque(70);
        Q.enque(80);

        System.out.println(Q.deque());
        System.out.println(Q.deque());
        System.out.println(Q.deque());
        System.out.println(Q.deque());
        System.out.println(Q.deque());
        System.out.println(Q.deque());
       

    }
}
