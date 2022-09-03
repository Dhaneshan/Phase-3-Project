package UserTestCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import UserTesting.Checking;
public class Testing 
{
    static Checking Sign_in;
    @BeforeEach
    void Initialized()
    {
    	Sign_in=new Checking();
    	System.out.println("Login Initiated");
    }
    @Test
   public void Sign_in_Successfull()
    {
    	assertEquals("Welcome Dhaneshan",Sign_in.check("Dhaneshan", "Dhaneshan@2001"));
    	
    }
    @Test
    void Invalid_Username()
    {
    	assertEquals("Invalid Username",Sign_in.check("Dhaneshhn", "Dhaneshan@2001"));
    	
    }
    @Test
    void Invalid_Password()
    {
    	assertEquals("Invalid Password",Sign_in.check("Dhaneshan", "Dhaneshan@123"));
    	
    }
    @Test
    void Both_Invalid()
    {
    	assertEquals("Invalid Username And Password",Sign_in.check("Dhaneshhn", "Dhaneshan@123"));
    }
    @Test
    void TrueAssert()
    {
    	assertTrue(Sign_in.Assert_check("Dhaneshan","Dhaneshan@123"));
    	
    }
    @Test
    void FalseAssert()
    {
    	assertFalse(Sign_in.Assert_check("Dhaneshan","Dhaneshan@2001"));
    }
    @AfterEach
    void Destruction()
    {
    	Sign_in=null;
    	System.out.println("Login Closed Successfull");
    }
    
    
}
