import java.util.Stack;

public class NextGreaterElement {
    
 public static int[] findNextGreater(int[]arr){
  int n=arr.length;
  int[] nge=new int[n];
  Stack<Integer> st=new Stack<>();
   for(int i=n-1;i>=0;i--){
    while(!st.isEmpty() && st.peek()<=arr[i]){
        st.pop();
    }
    if(st.isEmpty()){
        nge[i]=-1;
    }
    else{
        nge[i]=st.peek();
    }
    st.push(arr[i]);

 }
return nge;
}
 public static void main(String[] args){
    
 int[] arr={5,7,9,6,7,4,5,1,3,7};
     int[] result=findNextGreater(arr);
     for(int ele:result){
        System.out.print(ele+" ");
     }
}
}
