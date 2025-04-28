import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service = new ContactService();

    @Test
    public void testAddContact() {
        service.addContact("ID1", "John", "Doe", "1234567890", "123 Main St");
        Contact contact = service.getContact("ID1");
        assertNotNull(contact);
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
    }

    @Test
    public void testAddDuplicateContactId() {
        service.addContact("ID1", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact("ID1", "Jane", "Smith", "0987654321", "456 Oak Ave");
        });
    }

    @Test
    public void testDeleteContact() {
        service.addContact("ID1", "John", "Doe", "1234567890", "123 Main St");
        service.deleteContact("ID1");
        assertNull(service.getContact("ID1"));
    }

    @Test
    public void testUpdateContact() {
        service.addContact("ID1", "John", "Doe", "1234567890", "123 Main St");
        service.updateContact("ID1", "Jane", "Smith", "0987654321", "456 Oak Ave");
        Contact contact = service.getContact("ID1");
        assertEquals("Jane", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Oak Ave", contact.getAddress());
    }

    @Test
    public void testUpdateNonexistentContact() {
        assertThrows(IllegalArgumentException.class, () -> {
            service.updateContact("ID1", "Jane", "Smith", "0987654321", "456 Oak Ave");
        });
    }
}