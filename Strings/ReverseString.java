public class ReverseString {
    public static void main(String[] args) {
        String s="Chhaya";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
          char ch=s.charAt(i);
          ans+=ch;
        }
        System.err.print(ans);
    }
}
