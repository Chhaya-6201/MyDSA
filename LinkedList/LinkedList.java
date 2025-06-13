package LinkedList;

class Node{
    int data;
    Node next;
   
   public Node(int data){
    this.data=data;
    next=null;
   }
 }

public class LinkedList {
    Node head=null;
    // For adding new Node in Linked List
    public void insert(int data){
        Node current=head;
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }

    }

    // For printing the Linked List
    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.err.println("null");

    }
   public static void main(String[] args) {
    LinkedList ll=new LinkedList();
    ll.insert(10);
    ll.insert(20);
    ll.insert(30);
    ll.insert(40);
    ll.insert(50);
    ll.insert(60);


    ll.display();

   }

  
}

 



