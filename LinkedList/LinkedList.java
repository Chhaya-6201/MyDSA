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

    //For adding Node at the beginning of LinkedList
     public void addFirst(int data) {
     Node newNode =new Node(data);
     newNode.next=head;
     head=newNode;
   }
     
   //For deleting a node from Linked List
   public void deleteNode(int data){
     Node current=head;
     while(current.next!=null && current.next.data!=data){
        current=current.next;
     }
     if(current.next!=null){
        current.next=current.next.next;
     }
   }
    
   //For searching a value in Linked List
   public boolean search(int data){
     Node current=head;
     while(current!=null){
        if(current.data==data){
            return true;
        }
        current=current.next;
     }
    return false;
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

    ll.addFirst(5);
    ll.deleteNode(30);
    ll.display();
    ll.search(2);

   }

  
}

 



