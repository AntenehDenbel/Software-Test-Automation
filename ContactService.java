import java.util.ArrayList;
import java.util.List;

public class ContactService {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String contactId, String firstName, String lastName, String phone, String address) {
        // Check for duplicate contactId
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                throw new IllegalArgumentException("Contact ID already exists");
            }
        }

        Contact newContact = new Contact(contactId, firstName, lastName, phone, address);
        contacts.add(newContact);
    }

    public void deleteContact(String contactId) {
        contacts.removeIf(contact -> contact.getContactId().equals(contactId));
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact contactToUpdate = findContact(contactId);
        if (contactToUpdate == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        if (firstName != null) {
            contactToUpdate.setFirstName(firstName);
        }
        if (lastName != null) {
            contactToUpdate.setLastName(lastName);
        }
        if (phone != null) {
            contactToUpdate.setPhone(phone);
        }
        if (address != null) {
            contactToUpdate.setAddress(address);
        }
    }

    private Contact findContact(String contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    // For testing purposes
    public Contact getContact(String contactId) {
        return findContact(contactId);
    }
}