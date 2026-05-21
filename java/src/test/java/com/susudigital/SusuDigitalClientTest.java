import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SusuDigitalClientTest {

    private SusuDigitalClient client;

    @BeforeEach
    void setUp() {
        client = new SusuDigitalClient();
        client.setApiKey("test-api-key");
        client.setEnvironment("sandbox");
        client.setOrganization("test-org-id");
    }

    @Test
    void testCreateCustomer() {
        // Arrange
        Customer customer = new Customer("John", "Doe", "+233XXXXXXXXX", "john.doe@example.com");

        // Act
        Customer createdCustomer = client.customers.createCustomer(customer);

        // Assert
        assertNotNull(createdCustomer);
        assertEquals("John", createdCustomer.getFirstName());
        assertEquals("Doe", createdCustomer.getLastName());
    }

    @Test
    void testGetCustomer() {
        // Arrange
        String customerId = "CUST001";

        // Act
        Customer customer = client.customers.getCustomer(customerId);

        // Assert
        assertNotNull(customer);
        assertEquals(customerId, customer.getId());
    }

    @Test
    void testUpdateCustomer() {
        // Arrange
        String customerId = "CUST001";
        Customer updatedCustomer = new Customer("John", "Smith", "+233XXXXXXXXX", "john.smith@example.com");

        // Act
        Customer result = client.customers.updateCustomer(customerId, updatedCustomer);

        // Assert
        assertNotNull(result);
        assertEquals("Smith", result.getLastName());
    }

    @Test
    void testCreateTransaction() {
        // Arrange
        Transaction transaction = new Transaction("CUST001", 100.0, "deposit");

        // Act
        Transaction createdTransaction = client.transactions.createTransaction(transaction);

        // Assert
        assertNotNull(createdTransaction);
        assertEquals(100.0, createdTransaction.getAmount());
    }

    @Test
    void testGetTransaction() {
        // Arrange
        String transactionId = "TRANS001";

        // Act
        Transaction transaction = client.transactions.getTransaction(transactionId);

        // Assert
        assertNotNull(transaction);
        assertEquals(transactionId, transaction.getId());
    }

    @Test
    void testRefundTransaction() {
        // Arrange
        String transactionId = "TRANS001";

        // Act
        boolean result = client.transactions.refundTransaction(transactionId);

        // Assert
        assertTrue(result);
    }
}