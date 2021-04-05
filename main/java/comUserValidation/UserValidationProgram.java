package comUserValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidationProgram
{
    //UC1: valid first name
    public static boolean validateFirstName(String first_name)
    {
        return Pattern.matches("^[A-Z]{1}[a-z]{2,}",first_name);
    }

    //UC2: valid last name
    public static boolean validateLastName(String last_name)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}",last_name);
    }

    //UC3: valid email
    public static boolean validateEmail(String email)
    {
        return Pattern.matches("^(?!\\.)[A-Za-z0-9]+([._%+-]?[0-9])*@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}(\\.[A-Za-z]{2,})?$",email);
    }

    //UC4: valid phone number
    public static boolean validatePhoneNumber(String phone_number)
    {
        return Pattern.matches("^[0-9]{1,2}\\s[0-9]{10}$",phone_number);
    }

    //UC5: valid password
    /*
    * rule1: must contain min 8 characters
    * rule2: at least 1 uppercase
    * rule3: at least 1 numeric value
    * */
    public static boolean validatePassword(String password)
    {
        return Pattern.matches("(?=.*[A-Z])(?=.*[0-9]).{8,}",password);
    }

    //main method
    public static void main(String[] args)
    {
        System.out.println("first name: "+validateFirstName("Kiran"));
        System.out.println("last name: "+validateFirstName("Kumar"));
        System.out.println("Phone number: "+validatePhoneNumber("91 8688332960"));
        System.out.println("Password: "+validatePassword("dGs8j&*gh"));

        //valid emails
        System.out.println("Rahul@gmail.com: "+validateEmail("Rahul@gmail.com"));
        System.out.println("Rahul-100@gmail.com: "+validateEmail("Rahul-100@gmail.com"));
        System.out.println("Rahul.100@gmail.com: "+validateEmail("Rahul.100@gmail.com"));
        System.out.println("Rahul-100@Rahul.com: "+validateEmail("Rahul-100@Rahul.com"));
        System.out.println("Rahul-100@Rahul.net: "+validateEmail("Rahul-100@Rahul.net"));
        System.out.println("Rahul.100@Rahul.com.au: "+validateEmail("Rahul.100@Rahul.com.au"));
        System.out.println("Rahul@1.com: "+validateEmail("Rahul@1.com"));
        System.out.println("Rahul@gmail.com.com: "+validateEmail("Rahul@gmail.com.com"));
        System.out.println("Rahul+100@yahoo.com: "+validateEmail("Rahul+100@yahoo.com"));

        //invalid emails
        System.out.println("Rahul@.com.my: "+validateEmail("Rahul@.com.my"));
        System.out.println("Rahul123@gmail.a: "+validateEmail("Rahul123@gmail.a"));
        System.out.println("Rahul123@.com: "+validateEmail("Rahul123@.com"));
        System.out.println("Rahul123@.com.com: "+validateEmail("Rahul123@.com.com"));
        System.out.println(".Rahul@Rahul.com: "+validateEmail(".Rahul@Rahul.com"));
        System.out.println("Rahul()*@gmail.com: "+validateEmail("Rahul()*@gmail.com"));
        System.out.println("Rahul@%*.com: "+validateEmail("Rahul@%*.com"));
        System.out.println("Rahul..2002@gmail.com: "+validateEmail("Rahul..2002@gmail.com"));
        System.out.println("Rahul.@gmail.com: "+validateEmail("Rahul.@gmail.com"));
        System.out.println("Rahul@Rahul@gmail.com: "+validateEmail("Rahul@Rahul@gmail.com"));
        System.out.println("Rahul@gmail.com.1a: "+validateEmail("Rahul@gmail.com.1a"));
        System.out.println("Rahul@gmail.com.aa.au: "+validateEmail("Rahul@gmail.com.aa.au"));

    }
}
