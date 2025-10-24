package cursoSprintBoot_v2.controllers;

import cursoSprintBoot_v2.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CustomerControllerUnitTest {

    private CustomerController customerController;

    @BeforeEach
    void setUp() {
        customerController = new CustomerController();
    }

    @Test
    void testGetCustomersInitiallyEmpty() {
        List<Customer> customers = customerController.getCustomers();
        assertNotNull(customers);
        assertTrue(customers.isEmpty(), "La lista inicial debe estar vacía");
    }

    @Test
    void testPostCustomerAddsToList() {
        Customer newCustomer = new Customer(1, "Juan Pérez", "juan@test.com", "3001112233");

        ResponseEntity<Customer> response = customerController.postCustomer(newCustomer);

        assertEquals(200, response.getStatusCodeValue());
        assertEquals("Juan Pérez", response.getBody().getName());
        assertEquals(1, customerController.getCustomers().size());
    }

    @Test
    void testPostMultipleCustomers() {
        customerController.postCustomer(new Customer(1, "Ana", "ana@test.com", "3001112233"));
        customerController.postCustomer(new Customer(2, "Luis", "luis@test.com", "3102223344"));

        List<Customer> customers = customerController.getCustomers();
        assertEquals(2, customers.size());
        assertEquals("Ana", customers.get(0).getName());
        assertEquals("Luis", customers.get(1).getName());
    }
}