import java.util.Stack;
public class asteroidCollision {
    public static int[] collision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int x : asteroids) {
            boolean destroyed = false;

            // Collision happens only when:
            // stack top is positive and current asteroid is negative
            while(!st.isEmpty() && st.peek() > 0 && x < 0) {
                if(Math.abs(st.peek()) < Math.abs(x)) {
                    // array element destroyed
                    st.pop();
                } else if(Math.abs(st.peek()) == Math.abs(x)) {
                    // both explodes
                    st.pop();
                    destroyed = true;
                } else {
                    // current asteriod destroyed
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed) {
                st.push(x);
            }
        }
        int[] result = new int[st.size()];
        for(int i=result.length-1; i>=0; i--) {
            result[i] = st.pop();
        }
        return result;
    }
    public static void main(String[] args) {
        int[] asteroids = {5,10, -5};
        int[] result = collision(asteroids);
        for(int x : result) {
            System.out.print(x+" ");
        }
    }
}
