import java.util.Stack;

public class PreviousSmallerElement {
    public static int[] findPreviousElement(int[] arr){
       int n=arr.length;
       int[] pse=new int[n];
       Stack<Integer> st=new Stack<>();
       for(int i=0;i<n;i++){
        while(!st.isEmpty() && st.peek()>=arr[i]){
            st.pop();
        }
        if(st.isEmpty()){
            pse[i]=-1;
        }
        else{
            pse[i]=st.peek();
        }
        st.push(arr[i]);
       }
        return pse;
    }

   public static void main(String[] args){
     int[] arr={5,7,9,6,7,4,5,1,3,7};
     int[] result=findPreviousElement(arr);
     for(int ele:result){
        System.out.print(ele+" ");
     }
   }

}
