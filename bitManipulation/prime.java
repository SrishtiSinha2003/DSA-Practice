import static java.lang.Math.sqrt;
import java.util.Scanner;
public class prime {
    public static boolean primecheck(int n) {
        if(n ==1)
            return false;
        else if(n==2 || n==3){
            return true;
        }
        else if(n%6 != 1 && n%6 !=5){
            return false;
        }
        else {
            for(int i=2; i<=sqrt(n);) {
                if(n%i==0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt();
        if(primecheck(n)){
            System.out.println(n + " is a prime number");
        }
        else{
            System.out.println(n + " is not a prime number");
        }
        sc.close();
    }
}
