package cursoSprintBoot_v2.controllers;

import cursoSprintBoot_v2.domain.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerControllerUnitTest {

    private CustomerController controller;

    @BeforeEach
    void setUp() {
        controller = new CustomerController();
    }

    @Test
    void testGetCustomers() {
        List<Customer> expectedCustomers = new ArrayList<>();
        expectedCustomers.add(new Customer(1, "Juan Pérez", "juan@example.com", "3001234567"));
        expectedCustomers.add(new Customer(2, "Ana López", "ana@example.com", "3109876543"));

        controller.setCustomers(expectedCustomers);

        ResponseEntity<List<Customer>> response = controller.getCustomers();

        assertEquals(200, response.getStatusCodeValue());
        assertNotNull(response.getBody());
        assertEquals(2, response.getBody().size());
        assertEquals("Juan Pérez", response.getBody().get(0).getName());

        System.out.println("✅ Test ejecutado correctamente. Clientes: " + response.getBody().size());
    }
}