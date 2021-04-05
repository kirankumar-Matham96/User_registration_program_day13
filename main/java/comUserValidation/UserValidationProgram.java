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

    //UC1: valid last name
    public static boolean validateLastName(String last_name)
    {
        return Pattern.matches("^[A-Z][a-z]{2,}",last_name);
    }

    //main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String first_name = sc.nextLine();
        System.out.println("Enter last name");
        String last_name = sc.nextLine();

        System.out.println(validateFirstName(first_name));
        System.out.println(validateFirstName(last_name));

    }
}
