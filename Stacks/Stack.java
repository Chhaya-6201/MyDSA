
public class Stack {
  private int[] arr=new int[20];
  int top;
  int size;

  public Stack(){
   top=-1;
   size=arr.length; 
  }
  
  public void push(int data)
  {
     if(top<size-1){
        arr[++top]=data;
     }else{
        System.out.println("Stack Overflow");
     }
  }

  public int pop(){
     if(top>-1){
        return arr[top--];
     }
        else 
        {
            System.out.println("Stack Underflow");
            return 0;
        }
     }

  public int peek()
{  
    if(top>-1){
    return arr[top];
    }
    else {
    System.out.println("Stack is Empty");
    return 0;
    }
}

public void printStack(){
    for(int i=0;i<=top;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

}


