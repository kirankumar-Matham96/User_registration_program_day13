package comUserValidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserValidationProgramTest
{
    private UserValidationProgram userValidationProgram;

    @Before
    public void initialize()
    {
        userValidationProgram = new UserValidationProgram();
    }

    @Test
    public void givenFirstNameProper_returnTrue()
    {
            Assert.assertTrue(userValidationProgram.validateFirstName("Srinivas"));
    }

    @Test
    public void givenFirstNameShort_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
    }

    @Test
    public void givenFirstNameStartsLowerCase_returnFalse()
    {
            Assert.assertFalse(userValidationProgram.validateFirstName("srinivas"));
    }

    @Test
    public void givenLastNameProper_returnTrue()
    {
        Assert.assertTrue(userValidationProgram.validateLastName("Srivathsava"));
    }

    @Test
    public void givenLastNameShort_returnFalse()
    {
            Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
    }

    @Test
    public void givenLastNameStartsLowerCase_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validateFirstName("srivathsava"));
    }

    @Test
    public void givenProperPhoneNumber_returnTrue()
    {
        Assert.assertTrue(userValidationProgram.validatePhoneNumber("91 8688332960"));
    }

    @Test
    public void givenPhoneNumberNoSpaces_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("918688332960"));
    }

    @Test
    public void givenPhoneNumberShort_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("91 86832960"));
    }

    @Test
    public void givenPhoneNumberNoCountryCode_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePhoneNumber("86832960"));
    }

    @Test
    public void givenPasswordProper_returnTrue()
    {
        Assert.assertTrue(userValidationProgram.validatePassword("kojW7@bkc"));
    }
    @Test
    public void givenPasswordNoUpperCase_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePassword("kojw7ybkc@"));
    }

    @Test
    public void givenPasswordNoNumber_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePassword("kojwaybkc@"));
    }

    @Test
    public void givenPasswordNoSpecialChar_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePassword("kAjw7ybkcl"));
    }

    @Test
    public void givenPasswordMoreThan1SpecialChars_returnFalse()
    {
        Assert.assertFalse(userValidationProgram.validatePassword("kAj@w7ybk#cl&"));
    }

    @Test
    public void givenEmailProper_returnTrue()
    {
        Assert.assertTrue(userValidationProgram.validateEmail("abc@gmail.com"));
    }
}
