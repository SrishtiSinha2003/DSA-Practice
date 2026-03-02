public class validPassword {
    public static boolean isValid(String s) {

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;
        boolean hasDigit = false;

        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if(Character.isLowerCase(ch)) {
                hasLower = true;
            } else if(Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        } 
        return hasUpper && hasDigit && hasLower && hasSpecial;
    }
    public static void main(String[] args) {
        String password1 = "123456789";
        String password2 = "Ab1@defGh";

        System.out.println(isValid(password1) ? "Perfect Password" : "Not a Perfect Password");
        System.out.println(isValid(password2) ? "Perfect Password" : "Not a Perfect Password");
    }
}
