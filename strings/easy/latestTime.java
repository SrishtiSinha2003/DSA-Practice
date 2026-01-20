public class latestTime {
    public static String max(String time) {
        char[] times = time.toCharArray();
        if(times[0] == '?') {
            times[0] = (times[1] <= '3' || times[1] == '?') ? '2' : '1';
        }
        if(times[1] == '?') {
            times[1] = times[0] == '2' ? '3' : '9';
        }
        if(times[3] == '?') {
            times[3] = '5';
        }
        if(times[4] == '?') {
            times[4] = '9';
        }
        return new String(times);
    }
    public static void main(String[] args) {
        String time = "2?:?0";
        System.out.print(max(time));
    }
}
