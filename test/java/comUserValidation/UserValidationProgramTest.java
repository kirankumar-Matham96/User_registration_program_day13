package comUserValidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationProgramTest
{
    @Test
    public void givenFirstNameProper_returnTrue()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertTrue(userValidationProgram.validateFirstName("Srinivas"));
    }

    @Test
    public void givenFirstNameShort_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
    }

    @Test
    public void givenFirstNameStartsLowerCase_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validateFirstName("srinivas"));
    }

    @Test
    public void givenLastNameProper_returnTrue()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertTrue(userValidationProgram.validateLastName("Srivathsava"));
    }

    @Test
    public void givenLastNameShort_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
    }

    @Test
    public void givenLastNameStartsLowerCase_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validateFirstName("srivathsava"));
    }

    @Test
    public void givenProperPhoneNumber_returnTrue()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertTrue(userValidationProgram.validatePhoneNumber("91 8688332960"));
    }

    @Test
    public void givenPhoneNumberNoSpaces_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("918688332960"));
    }

    @Test
    public void givenPhoneNumberShort_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("91 86832960"));
    }

    @Test
    public void givenPhoneNumberNoCountryCode_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("86832960"));
    }

    @Test
    public void givenPasswordProper_returnTrue()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertTrue(userValidationProgram.validatePassword("kojW7ybkc@"));
    }
    @Test
    public void givenPasswordNoUpperCase_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validatePassword("kojw7ybkc@"));
    }

    @Test
    public void givenPasswordNoNumber_returnFalse()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertFalse(userValidationProgram.validatePassword("kojwaybkc@"));
    }

//    @Test
//    public void givenPasswordNoSpecialChar_returnFalse()
//    {
//        UserValidationProgram userValidationProgram = new UserValidationProgram();
//        Assert.assertFalse(userValidationProgram.validatePassword("kAjw7ybkcl"));
//    }

//    @Test
//    public void givenPasswordMoreThan1SpecialChars_returnFalse()
//    {
//        UserValidationProgram userValidationProgram = new UserValidationProgram();
//        Assert.assertFalse(userValidationProgram.validatePassword("kAj@w7ybk#cl&"));
//    }

    @Test
    public void givenEmailProper_returnTrue()
    {
        UserValidationProgram userValidationProgram = new UserValidationProgram();
        Assert.assertTrue(userValidationProgram.validateEmail("abc@gmail.com"));
    }
}
