import java.util.*;
public class collectingMangoes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int n=sc.nextInt();
            Stack<Integer> st=new Stack<>();
            Stack<Integer> maxst=new Stack<>();
            System.out.println("Case "+i+":");
            for(int j=0;j<n;j++){
                String op=sc.next();
                if(op.equals("A")){
                    int x=sc.nextInt();
                    st.push(x);
                    if(maxst.isEmpty()){
                        maxst.push(x);
                    }
                    else{
                        maxst.push(Math.max(x,maxst.peek()));
                    }
                }
                else if(op.equals("R")){
                    if(!st.isEmpty()){
                        st.pop();
                        maxst.pop();
                    }
                }
                else{
                    if(st.isEmpty()){
                        System.out.println("Empty");
                    }
                    else{
                        System.out.println(maxst.peek());
                    }
                }
            }
        }
        sc.close();
    }
}