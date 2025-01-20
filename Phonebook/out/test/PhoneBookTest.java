import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PhoneBookTest {

    @Test
    public void testThatUserAddContact() {
        PhoneBook number = new PhoneBook();
        String firstName = "blessing";
        String secondName = "ore";
        String expectedResult = number.addContact();
        assertEquals(firstName, expectedResult);
        assertEquals(secondName, expectedResult);
        assertNotNull(number.addContact());
    }

}
