import java.util.*;
public class toggele {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int q=sc.nextInt();
            TreeSet<Integer> set=new TreeSet<>();
            while(q-->0){
                int type=sc.nextInt();
                int idx=sc.nextInt();
                if(type==1){
                    if(set.contains(idx)){
                        set.remove(idx);
                    }
                    else{
                        set.add(idx);
                    }
                }
                else{
                    if(set.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        Integer floor=set.floor(idx);
                        Integer ceil=set.ceiling(idx);

                        int ans=Integer.MAX_VALUE;

                        if(floor!=null){
                            ans=Math.min(ans,Math.abs(idx-floor));
                        }
                        if(ceil!=null){
                            ans=Math.min(ans,Math.abs(ceil-idx));
                        }
                        System.out.println(ans);
                    }
                }
            }
        }
        sc.close();
    }
}