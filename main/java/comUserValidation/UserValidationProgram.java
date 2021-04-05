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

    //main method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String first_name = sc.nextLine();
        boolean b = validateFirstName(first_name);
        System.out.println(b);
    }
}
