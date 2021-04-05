package comUserValidation;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserValidationProgram
{
    //UC1: valid first name
    public static boolean validateFirstName(String first_name)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}",first_name);
    }

    //UC2: valid last name
    public static boolean validateLastName(String last_name)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}",last_name);
    }

    //UC3: valid email
    public static boolean validateEmail(String email)
    {
        return Pattern.matches("^(.+)@(.+)$",email);
    }

    //UC4: valid phone number
    public static boolean validatePhoneNumber(String phone_number)
    {
        return Pattern.matches("^[0-9]{1,2}\\s[0-9]{10}$",phone_number);
    }

    //main method
    public static void main(String[] args)
    {
        System.out.println("first name: "+validateFirstName("Kiran"));
        System.out.println("last name: "+validateFirstName("Kumar"));
        System.out.println("Email: "+validateEmail("abc.xyz5@gmail.com.in"));
        System.out.println("Phone number: "+validatePhoneNumber("91 8688332960"));
    }
}
