
package prog5121part1;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals; 
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;


public class LoginTest {
    Login k1 =new Login();
    
    public LoginTest() {
    }

    @Test
    public void testCheckUserName() {
        Login.username = "Kyl_1";
        boolean actual = Login.checkUserName("Kyl_1");
        assertEquals(true,actual);
    }
    @Test
    public void testCheckUserName_()
    {
        Login.username = "Kyle";
        boolean actual = Login.checkUserName("Kyle");
        assertEquals(false, actual);
    }

    @Test
    public void testCheckPasswordComplexity() {
         Login.password = "Ch&&sec@ke99!";
        boolean actual = Login.checkPasswordComplexity("Ch&&sec@ke99!");
        assertEquals(true, actual);
    }
      @Test
    public void testCheckPasswordComplexity_() 
    {
        Login.password = "password";
        boolean actual = Login.checkPasswordComplexity("password");
        assertEquals(false, actual);
    }

    @Test
    public void testRegisterUser() {
         Login.username = "kyl_1";
        String expected = "Username successfully captured";
        assertTrue(expected, Login.checkUserName("kyl_1"));
        Login.password = "Ch&&sec@ke99!";
        String expected1 = "Password successfully captured";
        assertTrue(expected1, Login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
     @Test
    public void testRegisterUser_() 
    {
        Login.username = "Kyle";
        String expected = "Username is not correctly formatted," +
            "please ensure that your username contains an underscore and is no more than 5 characters in length";
        assertFalse(Login.checkUserName("Kyle"), expected);
        Login.password = "password";
        assertFalse(Login.checkPasswordComplexity("password"), expected);
    }

    @Test
    public void testLoginUser() {
        Login.username = "kyl_1";
       Login.password = "Ch&&sec@ke99!";
        assertEquals(true, Login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }
     @Test
    public void testLoginUser_() 
    {
       Login.username = "Kyle";
       Login.password = "password";
        assertEquals(false, Login.loginUser("kyl_1", "Ch&&sec@ke99!"));
    }

    @Test
    public void testReturnLoginStatus() {
        
    }

    @Test
    public void testMain() {
    }
    
}
