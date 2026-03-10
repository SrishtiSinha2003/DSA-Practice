public class passwordDecode {
    public static void main(String[] args) {
        String s = "PLEASESAVEME";
        int l = 12;
        int row = (int) Math.floor(Math.sqrt(l));
        int col = (int) Math.ceil(Math.sqrt(l));
        if(row* col < l) row++;
        for(int i=0; i<col; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=i; j<l; j+=col) {
                sb.append(s.charAt(j));
            }
            System.out.print("\"" + sb.toString() + "\" ");
        }
    }
}
