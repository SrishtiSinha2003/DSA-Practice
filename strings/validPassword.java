public class validPassword {
    public static boolean isValid(String password) {
        if(password.length() != 9) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for(char ch : password.toCharArray()) {
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
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
    public static void main(String[] args) {
        String password1 = "123456789";
        String password2 = "Ab1@defGh";

        System.out.println(isValid(password1) ? "Perfect Password" : "Not a Perfect Password");
        System.out.println(isValid(password2) ? "Perfect Password" : "Not a Perfect Password");
    }
}
