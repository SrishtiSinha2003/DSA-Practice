import java.util.*;
public class implementQueue {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
         Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int queue[]=new int[t];
        int front=0,rear=-1;
        while(t-->0){
            String s=sc.nextLine();
            if(s.startsWith("Enqueue")){
                int x=Integer.parseInt(s.split(" ")[1]);
                queue[++rear]=x;
            }
            else{
                if(front>rear)
                    System.out.println("Empty");
                else
                    System.out.println(queue[front++]);
            }
        }
        sc.close();
    }
}