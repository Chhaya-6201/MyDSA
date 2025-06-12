// import java.util.Stack;

// public class LargestAreaRectangle {
    
//  public static int findLargestArea(int[] arr){
//     int n=arr.length;
//     Stack<Integer> st=new Stack<>(); 
//     int[] pse=new int[n]; 
//     int[] nse=new int[n]; 
     
//    //nse
//    for(int i=n-1;i>=0;i--){
//     while(!st.isEmpty() && st.peek()>=arr[i]){
//         st.pop();
//     }
//     if(st.isEmpty()){
//         nse[i]=n-1;
//     }
//     else{
//         nse[i]=st.peek()-1;
//     }
     
//     st.push(arr[i]);
//    }
    

//       // clear the stack to be re-used
//         while (!st.isEmpty()) st.pop();

//    //pse

//    for(int i=0;i<n;i++ ){
//     while(!st.isEmpty() && st.peek()>=arr[i]){
//         st.pop();
//     }
//     if(st.isEmpty()){
//         pse[i]=0;
//     }
//     else{
//         pse[i]=st.peek()+1;
//     }
//      st.push(arr[i]);
//    }
//      int max=0;
//     for(int i=0;i<n;i++){
//          max=Math.max(max,arr[i]*(pse[i]-nse[i]-1));
//          {   
        
//         return max;
//         }
//     }
//  }

// }
