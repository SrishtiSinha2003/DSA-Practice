import java.util.*;
public class implementStack {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int stack[]=new int[t];
        int top=-1;
        while(t-->0){
            String s=sc.nextLine();
            if(s.startsWith("push")){
                int x=Integer.parseInt(s.split(" ")[1]);
                stack[++top]=x;
            }
            else{
                if(top==-1)
                    System.out.println("Empty");
                else
                    System.out.println(stack[top--]);
            }
        }
        sc.close();
    }
}