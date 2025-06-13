public class Implementation {
    public static void main(String[] args){
        Queue que=new Queue(10);
        que.enqueue(10);
        que.enqueue(20);
        que.dequeue();
        que.enqueue(30);
        que.enqueue(40);
        que.dequeue();
        
        que.PrintQueue();

    }

        
}
