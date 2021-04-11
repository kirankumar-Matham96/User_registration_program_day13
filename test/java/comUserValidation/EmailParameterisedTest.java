package comUserValidation;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EmailParameterisedTest
{
    public String input;
    public boolean expected;
    public UserValidationProgram userValidationProgram;

    @Before
    public void initialize()
    {
        userValidationProgram = new UserValidationProgram();
    }

    public EmailParameterisedTest(String inputEmail, boolean expectedOutput)
    {
        input = inputEmail;
        expected = expectedOutput;
    }

    @Parameterized.Parameters
    public static Collection emailSetToTest()
    {
        return Arrays.asList(new Object[][]{{"abc@gmail.com", true},
                {"abc@gmail.net", true},
                {"abc@gmail.com.com", true},
                {"abc.123@gmail.com", true},
                {"abc@1.com", true},
                {"abc@gmail.com.in", true},
                {".abc@gmail.com", false},
                {"abc@.gmail.com", false},
                {"abc..abc@gmail.com", false},
                {"abcgmail.com", false},
                {"abc@123@gmail.com", false},
                {"abc@gmail.com.", false},
                {"abc@gmail.com.au.in", false},
                {"abc()*@gmail.com", false},
                {"abc@%*gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.a", false},
                {"abc@.com.com", false}});
    }

    @Test
    public void givenSetOfEmails_ReturnsAccordingToTheParameters()
    {
        assertEquals(expected, userValidationProgram.validateEmail(input));
    }

}
