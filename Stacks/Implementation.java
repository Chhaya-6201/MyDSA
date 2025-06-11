// Stack Implemetation using Fixed Size Array

public class Implementation {
    public static void main(String[] args){
      Stack nums=new Stack();
      nums.push(10);
      nums.push(20);
      nums.push(30);
      nums.push(40);
      nums.push(50);

      System.out.println(nums.peek());
      
      nums.pop();
      nums.push(60);
      nums.pop();
      nums.pop();
      nums.pop();
      nums.pop();
      
      nums.printStack();

    }
    
}


