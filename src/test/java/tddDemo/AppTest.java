package tddDemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class AppTest extends App {
	
	@Test
    public void shouldAnswerWithTrue() {
        String userName = "adminUser";
        String userName1 = "admin User";
        String userName2 = "admin@123";
        String userName3 = "admin_123";
        String userName4 = "admin/User";
        String userName5 = "admin#User";
        assertTrue(isValidUserName(userName));
        assertFalse(isValidUserName(userName1));
        assertFalse(isValidUserName(userName2));
        assertFalse(isValidUserName(userName3));
        assertFalse(isValidUserName(userName4));
        assertFalse(isValidUserName(userName5));
    }

}
