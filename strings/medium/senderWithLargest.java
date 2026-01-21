import java.util.*;

public class senderWithLargest {
    public static String largest(String[] messages, String[] senders) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<messages.length; i++) {
            int words = messages[i].split(" ").length;
            map.put(senders[i], map.getOrDefault(senders[i], 0)+words);
        }
        String ans = "";
        int max = 0;
        for(String sender : map.keySet()) {
            int count = map.get(sender);
            if(count > max || (count == max && sender.compareTo(ans)> 0)) {
                max = count;
                ans = sender;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] messages = {"Hello userTwooo","Hi userThree",
                            "Wonderful day Alice","Nice day userThree"};
        String[] senders = {"Alice","userTwo","userThree","Alice"};
        System.out.println(largest(messages, senders));
    }
}
