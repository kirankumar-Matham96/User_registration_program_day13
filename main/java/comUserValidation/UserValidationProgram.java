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

    //main method
    public static void main(String[] args)
    {
        System.out.println("first name: "+validateFirstName("Kiran"));
        System.out.println("last name: "+validateFirstName("Kumar"));
        System.out.println("Email: "+validateEmail("abc.xyz5@gmail.com.in"));

    }
}
