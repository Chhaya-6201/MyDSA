
public class Queue {
private int front,rear,size;
private int capacity;
private int[] arr;

//capacity is the maximum no. of elements that 
//the queue can hold. Capacity can never change

//size is the current no. of elements in the queue.
//Size chnages everytime we do enqueue or dequeue

public Queue(int capacity){
    this.capacity=capacity;
    arr=new int[capacity];
    front=0;
    rear=-1;
    size=0;
}
//Add element to the Queue
public void enqueue(int data)
{
    if(size==capacity){
        System.out.println("Queue is full");
        return;
    }
    arr[++rear]=data;
    size++;
}

public int dequeue(){
   if(size==0){
    System.out.print("Queue is empty");
    return -1;
   }
   int data=arr[front];
   front++;
   size--;
   return data;

}

//Printing the Queue
public void PrintQueue(){
if(size==0){
    System.out.println("queue is Empty");
    return;
}

for(int i=front;i<=rear;i++){
    System.out.print(arr[i]+" ");
}

}
}