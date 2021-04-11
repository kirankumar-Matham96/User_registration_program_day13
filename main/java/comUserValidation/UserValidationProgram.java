package comUserValidation;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserValidationProgram {
    
    /*
     * UC-1: validating first name
     */
    public static boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName);
    }
    
    /*
     * UC-2: validating last name
     */
    public static boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName);
    }
    
    /*
     * UC-3: validating email
     */
    public static boolean validateEmail(String email) {
        return Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$", email);
    }
    
    /*
     * UC-4: validating predefined mobile number
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches("^[91]{2}\\s[0-9]{10}", phoneNumber);
    }
    
    /*
     * UC-5: validating password
     *
     *  Rule1: minimum 8 characters
     *  Rule2: minimum 1 upper-case
     *  Rule3: minimum 1 numeric
     *  Rule4: Exactly 1 special character
     */
    public static boolean validatePassword(String userInput) {
        String[] regexExpressions = {"[a-zA-Z0-9][@|#|$|%|&]{1,1}[a-zA-Z0-9]$", "(?=.[A-Z])(?=.[0-9])(?=.*[@|#|$|%|&])[A-Za-z0-9@#$%&]{8,}$"};
        for(String regex : regexExpressions) {
            if(!userInput.matches(regex)) {
                return false;
            }
        }
        return true;
    }
    
    /*
     * UC-9: All types of email
     * adding email to array-list and calling validateEmail method
     */
    public static void addToEmailList(String emailToAdd) {
        ArrayList<String> email = new ArrayList<String>();
        
        email.add(emailToAdd);
        
        for(int i = 0; i < email.size(); i++) {
            System.out.println(email.get(i) + ": " + validateEmail(email.get(i)));
        }
    }
    
    //main method
    public static void main(String[] args) {
        String firstName = "Rahul";
        String lastName = "Shinde";
        String phoneNumber = "91 8688332960";
        String passWord = "9P#lesLd65ef";
        
        System.out.println("first name: " + validateFirstName(firstName));
        System.out.println("last name: " + validateLastName(lastName));
        System.out.println("phone numbar: " + validatePhoneNumber(phoneNumber));
        System.out.println("password: " + validatePassword(passWord));
        
        //valid email
        addToEmailList("Rahul@gmail.com");
        addToEmailList("Rahul-100@gmail.com");
        addToEmailList("Rahul.100@gmail.com");
        addToEmailList("Rahul-100@Rahul.com");
        addToEmailList("Rahul-100@Rahul.net");
        addToEmailList("Rahul.100@Rahul.com.au");
        addToEmailList("Rahul@1.com");
        addToEmailList("Rahul@gmail.com.com");
        addToEmailList("Rahul+100@yahoo.com");
        
        //invalid email
        addToEmailList("Rahul@.com.my");
        addToEmailList("Rahul123@gmail.a");
        addToEmailList("Rahul123@.com");
        addToEmailList("Rahul123@.com.com");
        addToEmailList(".Rahul@Rahul.com");
        addToEmailList("Rahul()*@gmail.com");
        addToEmailList("Rahul@%*.com");
        addToEmailList("Rahul..2002@gmail.com");
        addToEmailList("Rahul.@gmail.com");
        addToEmailList("Rahul@Rahul@gmail.com");
        addToEmailList("Rahul@gmail.com.1a");
        addToEmailList("Rahul@gmail.com.aa.au");
    }
}