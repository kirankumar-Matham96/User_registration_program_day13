package comUserValidation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserValidationProgramTest {
    private UserValidationProgram userValidationProgram;
    
    @Before
    public void initialize() {
        userValidationProgram = new UserValidationProgram();
    }
    
    @Test
    public void givenFirstNameProper_returnTrue() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertTrue(userValidationProgram.validateFirstName("Srinivas"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenFirstNameShort_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenFirstNameStartsLowerCase_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validateFirstName("srinivas"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenLastNameProper_returnTrue() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertTrue(userValidationProgram.validateLastName("Srivathsava"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenLastNameShort_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validateFirstName("Sr"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenLastNameStartsLowerCase_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validateFirstName("srivathsava"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenProperPhoneNumber_returnTrue() throws UserValidationCustomExceptions {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertTrue(userValidationProgram.validatePhoneNumber("91 8688332960"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPhoneNumberNoSpaces_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePhoneNumber("918688332960"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPhoneNumberShort_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePhoneNumber("91 86832960"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPhoneNumberNoCountryCode_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePhoneNumber("86832960"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPasswordProper_returnTrue() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertTrue(userValidationProgram.validatePassword("kojW7@bkc"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPasswordNoUpperCase_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePassword("kojw7ybkc@"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPasswordNoNumber_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePassword("kojwaybkc@"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPasswordNoSpecialChar_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePassword("kAjw7ybkcl"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenPasswordMoreThan1SpecialChars_returnFalse() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertFalse(userValidationProgram.validatePassword("kAj@w7ybk#cl&"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
    
    @Test
    public void givenEmailProper_returnTrue() {
        try {
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(UserValidationCustomExceptions.class);
            Assert.assertTrue(userValidationProgram.validateEmail("abc@gmail.com"));
        } catch(UserValidationCustomExceptions userValidationCustomExceptions) {
            userValidationCustomExceptions.printStackTrace();
        }
    }
}
