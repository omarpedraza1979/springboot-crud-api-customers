package cursoSprintBoot_v2.controllers;

import cursoSprintBoot_v2.domain.Customer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

@WebMvcTest(CustomerController.class)
@AutoConfigureMockMvc(addFilters = false)
class CustomerControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    private static final String BASE_URL = "/clientes";

    @Test
    void testGetClientesInitiallyEmpty() throws Exception {
        mockMvc.perform(get(BASE_URL))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$", hasSize(4)));
    }

    @Test
    void testPostCliente() throws Exception {
        String json = """
            {"id":1,"userName":"LauraMora","email":"laura@test.com","phone":"3004445566"}
        """;

        mockMvc.perform(post(BASE_URL)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated())  // ✅ Esperamos 201 Created
                .andExpect(header().exists("Location")) // ✅ Se genera la URI del nuevo recurso
                .andExpect(jsonPath("$.userName").value("LauraMora"));

    }
}
