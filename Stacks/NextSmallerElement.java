import java.util.Stack;

public class NextSmallerElement {
    
public static int[] findSmallerElement(int[] arr){
int n=arr.length;
int[] nse=new int[n];
Stack<Integer> st=new Stack<>();
for(int i=n-1;i>=0;i--){
    while(!st.isEmpty() && st.peek()>=arr[i]){
        st.pop();
    }
    if(st.isEmpty()){
        nse[i]=-1;
    }else{
        nse[i]=st.peek();
    }
    st.push(arr[i]);
}
return nse;

}
 public static void main(String[] args){
    
 int[] arr={5,7,9,6,7,4,5,1,3,7};
     int[] result=findSmallerElement(arr);
     for(int ele:result){
        System.out.print(ele+" ");
     }
}

}
