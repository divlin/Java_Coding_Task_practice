package string_Tasks;

public class String_Password_Validation {

    public static void main(String[] args) {

        String password = "123mh*A";

        System.out.println(validPassword(password));
    }

    public static boolean validPassword(String password){

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecialChar = false;

        for (int i = 0; i <password.length() ; i++) {
            char each = password.charAt(i);

            if(password.length() >=6 && ! password.contains(" ") ){
                if(Character.isDigit(each)){
                    hasDigit = true;
                }else if(Character.isUpperCase(each)) {
                    hasUpper = true;
                }else if(Character.isLowerCase(each)){
                    hasLower = true;
                }else if( ! Character.isLetterOrDigit(each)  ){
                    hasSpecialChar = true;
                }

                if(hasDigit && hasLower && hasUpper && hasSpecialChar) {
                    return true;
                }
            }
        }

        return false;

    }
}

/*
    Write a function that can verify if a password is valid or not. requirements:
   1. Password MUST be at least have 6 characters and should not contain space
   2. PassWord should at least contain one upper case letter
   3. PassWord should at least contain one lowercase letter
   4. Password should at least contain one special characters
   5. Password should at least contain a digit
   if all requirements above are met, the method returns true, otherwise returns false
     */
